package com.didiso.sysyteme;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;
import Generique.JsonJava;

/*
import Generique.Discipline;
import Generique.Employe;
import Generique.JsonJava;
import Generique.Projet;
import Generique.Scanner;
*/
public class Employe {
	private String idEmpl;
	private String nasEmpl;
	private String nomEmpl;
	private String dateEmbEmpl;
	private String dateDepartEmpl;
	private List<Taux> tauxNormEmpl;
	private List<Taux> tauxSupp;
	private List<Pointage> listePointage;
	private String poste;
	//private String [] infosConEmpl;
	private String nomUtilisateur;
	private String motDePasse;
	private String statut;
	private List<Projet >listeProjetAtt;
	private List<Discipline> listeDiscAttr;
	private boolean estActif;
	private boolean estConnecte;
	/**
	 *
	 */
	public Employe() {
		super();
	}
	/**
	 * @param idEmpl
	 * @param nasEmpl
	 * @param nomEmpl
	 * @param dateEmbEmpl
	 * @param dateDepartEmpl
	 * @param poste
	 * @param nomUtilisateur
	 * @param motDePasse
	 * @param statut
	 */
	public Employe(String idEmpl, String nasEmpl, String nomEmpl, String dateEmbEmpl, String dateDepartEmpl,
				   String poste, String nomUtilisateur, String motDePasse, String statut) {
		super();
		this.idEmpl = idEmpl;
		this.nasEmpl = nasEmpl;
		this.nomEmpl = nomEmpl;
		this.dateEmbEmpl = dateEmbEmpl;
		this.dateDepartEmpl = dateDepartEmpl;
		this.poste = poste;
		this.nomUtilisateur = nomUtilisateur;
		this.motDePasse = motDePasse;
		this.statut = statut;
		this.estActif=true;
		this.estConnecte=false;


	}
	/**
	 * @return the idEmpl
	 */
	public String getIdEmpl() {
		return idEmpl;
	}
	/**
	 * @param idEmpl the idEmpl to set
	 */
	public void setIdEmpl(String idEmpl) {
		this.idEmpl = idEmpl;
	}
	/**
	 * @return the nasEmpl
	 */
	public String getNasEmpl() {
		return nasEmpl;
	}
	/**
	 * @param nasEmpl the nasEmpl to set
	 */
	public void setNasEmpl(String nasEmpl) {
		this.nasEmpl = nasEmpl;
	}
	/**
	 * @return the nomEmpl
	 */
	public String getNomEmpl() {
		return nomEmpl;
	}
	/**
	 * @param nomEmpl the nomEmpl to set
	 */
	public void setNomEmpl(String nomEmpl) {
		this.nomEmpl = nomEmpl;
	}
	/**
	 * @return the dateEmbEmpl
	 */
	public String getDateEmbEmpl() {
		return dateEmbEmpl;
	}
	/**
	 * @param dateEmbEmpl the dateEmbEmpl to set
	 */
	public void setDateEmbEmpl(String dateEmbEmpl) {
		this.dateEmbEmpl = dateEmbEmpl;
	}
	/**
	 * @return the dateDepartEmpl
	 */
	public String getDateDepartEmpl() {
		return dateDepartEmpl;
	}
	/**
	 * @param dateDepartEmpl the dateDepartEmpl to set
	 */
	public void setDateDepartEmpl(String dateDepartEmpl) {
		this.dateDepartEmpl = dateDepartEmpl;
	}
	/**
	 * @return the tauxNormEmpl
	 */
	public List<Taux> getTauxNormEmpl() {
		return tauxNormEmpl;
	}
	/**
	 * @param tauxNormEmpl the tauxNormEmpl to set
	 */
	public void setTauxNormEmpl(List<Taux> tauxNormEmpl) {
		this.tauxNormEmpl = tauxNormEmpl;
	}
	/**
	 * @return the tauxSupp
	 */
	public List<Taux> getTauxSupp() {
		return tauxSupp;
	}
	/**
	 * @param tauxSupp the tauxSupp to set
	 */
	public void setTauxSupp(List<Taux> tauxSupp) {
		this.tauxSupp = tauxSupp;
	}
	/**
	 * @return the poste
	 */
	public String getPoste() {
		return poste;
	}
	/**
	 * @param poste the poste to set
	 */
	public void setPoste(String poste) {
		this.poste = poste;
	}
	/**
	 * @return the nomUtilisateur
	 */
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}
	/**
	 * @param nomUtilisateur the nomUtilisateur to set
	 */
	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}
	/**
	 * @return the motDePasse
	 */
	public String getMotDePasse() {
		return motDePasse;
	}
	/**
	 * @param motDePasse the motDePasse to set
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	/**
	 * @return the statut
	 */
	public String getStatut() {
		return statut;
	}
	/**
	 * @param statut the statut to set
	 */
	public void setStatut(String statut) {
		this.statut = statut;
	}
	/**
	 * @return the listeProjetAtt
	 */
	public List<Projet> getListeProjetAtt() {
		return listeProjetAtt;
	}

	/**
	 * @param listeProjetAtt the listeProjetAtt to set
	 */
	public void setListeProjetAtt(List<Projet> listeProjetAtt) {
		this.listeProjetAtt = listeProjetAtt;
	}
	/**
	 * @return the listeDiscAttr
	 */
	public List<Discipline> getListeDiscAttr() {
		return listeDiscAttr;
	}
	/**
	 * @param listeDiscAttr the listeDiscAttr to set
	 */
	public void setListeDiscAttr(List<Discipline> listeDiscAttr) {
		this.listeDiscAttr = listeDiscAttr;
	}
	/**
	 * @return the estActif
	 */
	public boolean isEstActif() {
		return estActif;
	}
	/**
	 * @param estActif the estActif to set
	 */
	public void setEstActif(boolean estActif) {
		this.estActif = estActif;
	}
	/**
	 * @return the estConnecte
	 */
	public boolean isEstConnecte() {
		return estConnecte;
	}
	/**
	 * @param estConnecte the estConnecte to set
	 */
	public void setEstConnecte(boolean estConnecte) {
		this.estConnecte = estConnecte;
	}




	/**
	 * @return the listePointage
	 */
	public List<Pointage> getListePointage() {
		return listePointage;
	}
	/**
	 * @param listePointage the listePointage to set
	 */
	public void setListePointage(List<Pointage> listePointage) {
		this.listePointage = listePointage;
	}





	@Override
	public String toString() {
		return "Employe [idEmpl=" + idEmpl + ", nasEmpl=" + nasEmpl + ", nomEmpl=" + nomEmpl + ", dateEmbEmpl="
				+ dateEmbEmpl + ", dateDepartEmpl=" + dateDepartEmpl + /*", tauxNormEmpl=" + tauxNormEmpl + ", tauxSupp="
				+ tauxSupp + ", listePointage=" + listePointage + */", poste=" + poste + ", nomUtilisateur="
				+ nomUtilisateur + ", motDePasse=" + motDePasse + ", statut=" + statut /*+ ", listeProjetAtt="
				+ listeProjetAtt + ", listeDiscAttr=" + listeDiscAttr */+ ", estActif=" + estActif + ", estConnecte="
				+ estConnecte + "]";
	}
	public static boolean estDanslaBaseDonneeEmpl(String idEmplCherche, List<Employe> listeEmpl){
		boolean trouve=false;
		for (int i=0; i<listeEmpl.size(); i++) {
			if(listeEmpl.get(i).getIdEmpl().equals(idEmplCherche)) {
				trouve=true;
				return trouve;
			}
		}
		return trouve;
	}

	public static int chercherPositionEmplTrouve(String idEmplCherche, List<Employe> listeEmpl){
		if(estDanslaBaseDonneeEmpl( idEmplCherche, listeEmpl)) {
			for (int i=0; i<listeEmpl.size(); i++) {
				if(listeEmpl.get(i).getIdEmpl().equals(idEmplCherche)) {
					return i;
				}
			}
		}
		return -1;
	}


	public static Employe  trouverEmpl(String idEmplCherche, List<Employe> listeEmpl) {
		Employe empl=new Employe();
		boolean arret=true;
		for (int i=0; i<listeEmpl.size(); i++) {
			System.out.println(listeEmpl.get(i).getIdEmpl());
			System.out.println(idEmplCherche);
			if( (listeEmpl.get(i).getIdEmpl().equals(idEmplCherche))&&(arret) ) {
				arret=false;
				empl=listeEmpl.get(i);
				System.out.println(listeEmpl.get(i).toString());

			}else {

			}
		}
		return empl;

	}


	public void ajouterEmpl(List<Employe> listeEmpl) {
		if(!estDanslaBaseDonneeEmpl(this.idEmpl, listeEmpl)) {
			listeEmpl.add(this);
			JsonJava.convertirListeEnJson(listeEmpl);
		}else {
			JOptionPane.showMessageDialog(null, "Ce projet est d�j� dans la base de donn�e", "Info", JOptionPane.CLOSED_OPTION);
		}
	}


	public static void supprimerEmploye(String idEmplAsupprimer, List<Employe> listeEmpl) {
		//int position=chercherPositionProjTrouve(idProjAsupprimer, listeProj);
		if(estDanslaBaseDonneeEmpl(idEmplAsupprimer, listeEmpl)) {
			listeEmpl.remove(chercherPositionEmplTrouve(idEmplAsupprimer, listeEmpl));
			System.out.println("Nouvelle liste : "+listeEmpl.toString());
			JsonJava.convertirListeEnJson(listeEmpl);
		}
	}



	public static Employe modifierEmpl(List<Employe> listeEmpl, Employe nouvEmpl) {
		//int j=-1;
		int i;
		int positionEmplCherche = 0;
		//boolean trouve=false;
		boolean conditionArret=true;
		for (i=0; i<listeEmpl.size(); i++) {
			if((listeEmpl.get(i).getIdEmpl()==nouvEmpl.getIdEmpl())&&conditionArret) {
				positionEmplCherche=i;
				System.out.println("Employe � modifier = "+listeEmpl.get(positionEmplCherche));
				//trouve=true;
				conditionArret=false;
			}

		}

		/*
		 *

	private String nomEmpl;
	private String dateDepartEmpl;
	private String poste;
	private String nomUtilisateur;
		 */

		if(estDanslaBaseDonneeEmpl(nouvEmpl.getIdEmpl(), listeEmpl)) {
			int positionEmplAmodifier=chercherPositionEmplTrouve(nouvEmpl.getIdEmpl(), listeEmpl);
			Employe emplAmodifier=listeEmpl.get(positionEmplAmodifier);
			if(emplAmodifier.getIdEmpl().equals(nouvEmpl.getIdEmpl())){  //Pour �viter de modifier l'ID

				if(!emplAmodifier.getNomEmpl().equals(nouvEmpl.getNomEmpl())){
					emplAmodifier.setNomEmpl(nouvEmpl.getNomEmpl());
				}

				if(!emplAmodifier.getDateDepartEmpl().equals(nouvEmpl.getDateDepartEmpl())){
					emplAmodifier.setDateDepartEmpl(nouvEmpl.getDateDepartEmpl());
				}
				if(emplAmodifier.getPoste()!=(nouvEmpl.getPoste())){
					emplAmodifier.setPoste(nouvEmpl.getPoste());
				}
				if(emplAmodifier.getNomUtilisateur()!=(nouvEmpl.getNomUtilisateur())){
					emplAmodifier.setNomUtilisateur(nouvEmpl.getNomUtilisateur());
				}
				listeEmpl.set(positionEmplCherche, nouvEmpl);
				System.out.println("nouvelle liste : "+listeEmpl.toString());

				JsonJava.convertirListeEnJson(listeEmpl);
				return nouvEmpl;
			}else {
				System.out.println("Id inexistant");
				return emplAmodifier;
			}
		}

		return nouvEmpl;

	}

	/*

	private List<Taux> tauxNormEmpl;
	private List<Taux> tauxSupp;
	private List<Pointage> listePointage;
	private List<Projet >listeProjetAtt;
	private List<Discipline> listeDiscAttr;
	 */

	public void ajouterTauxNormEmpl(Taux taux) {
		if(!Taux.estDanslaBaseDonneeTaux(taux.getIdTx(), this.tauxNormEmpl)) {
			this.tauxNormEmpl.add(taux);
		}
	}

	public void ajouterTauxSuppEmpl(Taux taux) {
		if(!Taux.estDanslaBaseDonneeTaux(taux.getIdTx(), this.tauxSupp)) {
			this.tauxSupp.add(taux);
		}
	}


	public void ajouterPointEmpl(Pointage pointage) {
		if(!Pointage.estDanslaBaseDonneePoint(pointage.getIdPoint() , this.listePointage)) {
			this.listePointage.add(pointage);
		}
	}

	public Employe DesactiverEmploye() {
		this.setEstActif(false);
		return this;
	}


	public void ajouterProjEmpl(Projet proj) {
		if(!Projet.estDanslaBaseDonneeProj(proj.getIdProj() , this.listeProjetAtt)) {
			this.listeProjetAtt.add(proj);
		}
	}

	public void retirerProjetEmpl(Projet proj) {
		int positionAsupprimer = Projet.chercherPositionProjTrouve(proj.getIdProj(), this.listeProjetAtt);
		if (positionAsupprimer != -1) {
			this.getListeProjetAtt().remove(positionAsupprimer);
			//creerListeDiscJson(liste);
		}
	}


	public void ajouterDiscEmpl(Discipline disc) {
		if(!Discipline.estDanslaBaseDonneeDisc(disc.getIdDisc() , this.listeDiscAttr)) {
			this.listeDiscAttr.add(disc);
		}
	}

	/*
	public Projet DesactiverProjet() {
		this.setEstActif(false);
		return this;
	}
	*/

	public void retirerDiscEmpl(Discipline disc) {
		int positionAsupprimer = Discipline.chercherPositionDiscTrouve(disc.getIdDisc(), this.listeDiscAttr);
		if (positionAsupprimer != -1) {
			this.listeDiscAttr.remove(positionAsupprimer);
			//creerListeDiscJson(liste);
		}
	}

	/*
	public double calculerNbHeureTravProj() {
		double nbH =0;
		for(Discipline disc : this.disciplineProjet) {
			double nbDisc = disc.getNbHTrav();
			nbH = nbH + nbDisc;
		}
		return nbH;
	}

	public double calculerAvancementProj() {
		double nbH = calculerNbHeureTravProj();
		double avancementProj = nbH/this.getNbHeureBudgProj();
		return avancementProj;
	}
	*/


	public void executerCreationEmploye() {
		//Bail bail=new Bail(idBail, numUnite, typeUnite, dateEntree, dateSortie, assurance, remisage, locataire, renouvelable, stationnement, montantLoyer);
		List<Employe> listeEmpl = new ArrayList<>();
		List<Employe> listeEmplchargee = null;

		try {
			listeEmplchargee=JsonJava.chargerBDDListe(listeEmpl, "com.didiso.sysyteme.Employe.json", Employe.class);
		} catch (IOException | ParseException e1) {

			e1.printStackTrace();
		}

		this.ajouterEmpl(listeEmpl);
	}



















	public double calculerSalaire(Date dateDebut, Date dateFin) {
		double salaireTotal = 0.0;

		// Parcours des pointages pour la p�riode donn�e
		for (Pointage pointage : this.listePointage) {
			Date datePointage = pointage.getDatePointage();

			// V�rification si le pointage est dans la p�riode
			if (datePointage.compareTo(dateDebut) >= 0 && datePointage.compareTo(dateFin) <= 0) {
				Taux tauxApplicable = trouverTauxApplicable(datePointage);
				if (tauxApplicable != null) {
					double montantHoraire = tauxApplicable.getTauxH();
					double heuresTravaillees = pointage.getNbTotal();

					// Calcul des heures normales et suppl�mentaires
					double heuresNormales = Math.min(heuresTravaillees, 8.0);
					double heuresSupplementaires = Math.max(heuresTravaillees - 8.0, 0.0);

					// Recherche du taux de suppl�ment applicable
					Taux tauxSuppApplicable = trouverTauxSuppApplicable(datePointage);
					double montantSupp = tauxSuppApplicable.getTauxH();

					// Calcul du salaire pour les heures normales et suppl�mentaires
					double salairePartiel = (montantHoraire * heuresNormales) + (montantSupp * heuresSupplementaires);
					salaireTotal += salairePartiel;
				}
			}
		}

		return salaireTotal;
	}


	public Taux trouverTauxApplicable(Date date) {
		for (Taux taux : this.tauxNormEmpl) {
			if (date.compareTo(parseDate(taux.getDateDebutTx())) >= 0 && date.compareTo(parseDate(taux.getDateFinTx())) <= 0) {
				return taux;
			}
		}
		return null;
	}


	public Taux trouverTauxSuppApplicable(Date date) {
		for (Taux taux : this.tauxSupp) {
			if (date.compareTo(parseDate(taux.getDateDebutTx())) >= 0 && date.compareTo(parseDate(taux.getDateFinTx())) <= 0) {
				return taux;
			}
		}
		return null;
	}



	public static Date parseDate(String dateString) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			return sdf.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}


    /*
 // Effectuez la connexion
    if (verifierInfosConnexion(employe1)) {
        Projet projetChoisi = choisirProjet(listeProjets);
        if (projetChoisi != null) {
            Discipline disciplineChoisie = choisirDiscipline(projetChoisi, listeDisciplines);
            if (disciplineChoisie != null) {
                enregistrerDebutTravail(employe1, disciplineChoisie);
                seDeconnecter();
                enregistrerFinTravail(employe1, disciplineChoisie);
            }
        }
    }
}
*/
    /*
public boolean verifierInfosConnexion() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nom d'utilisateur : ");
    String nomUtilisateur = scanner.nextLine();
    System.out.println("Mot de passe : ");
    String motDePasse = scanner.nextLine();
    System.out.println("Statut : ");
    String statut = scanner.nextLine();

    if (nomUtilisateur.equals(this.getNomUtilisateur())
    		&& motDePasse.equals(this.getMotDePasse())
    		&& statut.equals(this.getStatut())) {
        System.out.println("Connexion r�ussie !");
        return true;
    } else {
        System.out.println("�chec de la connexion !");
        return false;
    }
}

public static Projet choisirProjet(List<Projet> listeProjets) {
	return null;
    // Affichez la liste des projets et demandez � l'utilisateur de choisir
    // Retournez le projet choisi ou null en cas d'annulation
}

public static Discipline choisirDiscipline(Projet projet, List<Discipline> listeDisciplines) {
	return null;
    // Affichez la liste des disciplines du projet choisi
    // Demandez � l'utilisateur de choisir une discipline
    // Retournez la discipline choisie ou null en cas d'annulation
}

public static void enregistrerDebutTravail(Employe employe, Discipline discipline) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    Date dateDebut = new Date();

    System.out.println("D�but du travail enregistr� le " + dateFormat.format(dateDebut));
    // Enregistrez le d�but du travail dans la base de donn�es ou autre
}

public static void seDeconnecter() {
    System.out.println("D�connexion r�ussie !");
}

public static void enregistrerFinTravail(Employe employe, Discipline discipline) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    Date dateFin = new Date();

    System.out.println("Fin du travail enregistr�e le " + dateFormat.format(dateFin));

    // Calculez le temps effectu� et enregistrez-le dans la base de donn�es ou autre
}


	*/

}

