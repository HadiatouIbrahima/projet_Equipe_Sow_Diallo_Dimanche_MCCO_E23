package Generique;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonJava {
	

    // M�thode g�n�rique qui prend un objet de n'importe quelle classe et renvoie un objet JSON
	public static <T> JSONObject convertirObjetEnJson(T objT) {
	    List<InfoClasse> infosAttribut = recupererInfoAttributClasse(objT.getClass());
	    JSONObject jsonObject = new JSONObject();

	    for (InfoClasse attributeInfo : infosAttribut) {
	        String nomAttribut = attributeInfo.getNomAttribut();
	        Class<?> typeAttribut = attributeInfo.getTypeAttibut();
	        try {
	            Field field = objT.getClass().getDeclaredField(nomAttribut);
	            field.setAccessible(true);
	            Object valeurAttribut = field.get(objT);
	            if (valeurAttribut != null) {
	                if (typeAttribut.equals(List.class)) {
	                    List<?> listValue = (List<?>) valeurAttribut;
	                    JSONArray jsonArray = convertirListeEnJson(listValue);
	                    jsonObject.put(nomAttribut, jsonArray);
	                } else if (typeAttribut.isArray()) {
	                    String[] cles = {"Nom d'utilisateur", "Mot de passe", "Statut"};
	                    JSONObject tableauJson = convertirTableauEnJson(valeurAttribut, cles);
	                    jsonObject.put(nomAttribut, tableauJson);
	                } else {
	                    jsonObject.put(nomAttribut, valeurAttribut);
	                }
	            } else {
	                // Si la valeur est nulle, vous pouvez choisir de ne pas ajouter cet attribut au JSON.
	                // Sinon, vous pouvez le laisser vide en utilisant jsonObject.put(nomAttribut, null);
	            }
	        } catch (NoSuchFieldException | IllegalAccessException e) {
	            e.printStackTrace();
	        }
	    }

	    return jsonObject;
	}

	// M�thode pour convertir un tableau en JSON
	public static JSONObject convertirTableauEnJson(Object tableau, String[] cles) {
	    JSONObject jsonObject = new JSONObject();
	    JSONArray jsonArray = new JSONArray();

	    int length = Array.getLength(tableau);
	    for (int i = 0; i < length; i++) {
	        JSONObject elementJson = new JSONObject();
	        elementJson.put(cles[i], Array.get(tableau, i));
	        jsonArray.add(elementJson);
	    }

	    jsonObject.put("infoConAdmin", jsonArray);
	    return jsonObject;
	}

    // M�thode pour obtenir les informations sur les attributs d'une classe
    public static List<InfoClasse> recupererInfoAttributClasse(Class<?> clazz) {
        List<InfoClasse> attributeInfoList = new ArrayList<>();

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            Class<?> type = field.getType();
            attributeInfoList.add(new InfoClasse(name, type));
        }

        return attributeInfoList;
    }

    public static <T> JSONArray convertirListeEnJson(List<T> listeObjets) {
    	JSONObject bddJson=new JSONObject();
        JSONArray listeJson = new JSONArray();
        String nomBDD = null;
        String nomFichier = listeObjets.get(0).getClass().getName() + ".json";
        System.err.println("Nom de fichier : "+nomFichier);
        if(!listeObjets.isEmpty()) {
        	nomBDD = "Base de donnees " + listeObjets.get(0).getClass().getName();
        }

        for (T objet : listeObjets) {
            JSONObject objJson = convertirObjetEnJson(objet);
            listeJson.add(objJson);
        }
        
        bddJson.put(nomBDD, listeJson);
        
        //try (FileWriter file = new FileWriter(nomFichier)){
        	//System.err.println("Enregistrement commenc�");
        String cheminFichier = System.getProperty("user.home") + "/Desktop/" + nomFichier;
        try (FileWriter file = new FileWriter(cheminFichier)) {
        
        	System.err.println("Enregistrement commenc�");
			file.write(bddJson.toJSONString()); 
			System.err.println("Enregistrement r�ussi");
			
			file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
        return listeJson;
    }
    

	
 // M�thode g�n�rique qui prend un objet JSON et renvoie un objet de type T
   
    public static <T> T convertirJsonVersObjet(JSONObject jsonObject, Class<T> classe) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        T objet = classe.getDeclaredConstructor().newInstance();

        // R�cup�rer les attributs de la classe
       
	List<InfoClasse> attributeInfoList = recupererInfoAttributClasse(classe);

        // Parcourir les attributs et assigner les valeurs � l'objet
        for (InfoClasse attributeInfo : attributeInfoList) {
            String attributeName = attributeInfo.getNomAttribut();
            Class<?> attributeType = attributeInfo.getTypeAttibut();

            // V�rifier si l'attribut existe dans le JSON
            if (jsonObject.containsKey(attributeName)) {
                Object attributeValue = jsonObject.get(attributeName);

                // Convertir la valeur du JSON vers le type de l'attribut
                Object convertedValue;
                if (attributeValue instanceof JSONArray && attributeType.isArray()) {
                    JSONArray jsonArray = (JSONArray) attributeValue;
                    int arrayLength = jsonArray.size();
                    Object[] array = (Object[]) Array.newInstance(attributeType.getComponentType(), arrayLength);
                    for (int i = 0; i < arrayLength; i++) {
                        JSONObject element = (JSONObject) jsonArray.get(i);
                        array[i] = convertirJsonVersObjet(element, attributeType.getComponentType());
                    }
                    convertedValue = array;
                } else {
                    convertedValue = convertirVersType(attributeValue, attributeType);
                }

                // Assigner la valeur � l'attribut de l'objet
                Field field;
                try {
                    field = classe.getDeclaredField(attributeName);
                    field.setAccessible(true);
                    field.set(objet, convertedValue);
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }
            }
        }

        return objet;
    }


    // M�thode qui convertit la valeur du JSON vers le type de l'attribut
    private static Object convertirVersType(Object value, Class<?> type) {
        // conversions sp�cifiques pour les types que vous souhaitez g�rer
        // pour convertir une valeur en entier :
        if (type == int.class || type == Integer.class) {
            return Integer.parseInt(value.toString());
        }

        // Pour les autres types, retourner la valeur telle quelle
        return value;
    }


    public static <T> List<T> chargerBDDListe(List<T> listeObjets, String nomFichier, Class<T> classe) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader(System.getProperty("user.home") + "//Desktop//" + nomFichier);
        Object obj = null;
		try {
			obj = jsonParser.parse(reader);
		} catch (IOException | org.json.simple.parser.ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        JSONObject bddJson = (JSONObject) obj;
        String nomBDD = "Base de donnees " + classe.getName();
        JSONArray array = (JSONArray) bddJson.get(nomBDD);

        for (int i = 0; i < array.size(); i++) {
            JSONObject jsonObject = (JSONObject) array.get(i);
            T objet = null;
			try {
				objet = convertirJsonVersObjet(jsonObject, classe);
			} catch (IllegalAccessException | InstantiationException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            listeObjets.add(objet);
        }

        return listeObjets;
    }



       
    
}


