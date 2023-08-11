package com.didiso.sysyteme;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import Generique.JsonJava;


public class Initialisation {

    public Initialisation() throws org.json.simple.parser.ParseException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //System.out.println("Notre projet commence ici: ");
        //List<ObjetClasseInfo> classeInfoList = ObjetClasseInfo.RecupererClasseInfo(Admin.class);
        //System.out.println("Info Classe : "+ classeInfoList);
        //Admin
        //String idAdmin, String nomAdmin, String nasAdmin, String[] infoConAdmin

        //creation Admin
        //String [] infoConAdmin = {"sow", "12345", "admin"};    ////username, ^password, statut,
        //Admin(String idAdmin, String nomAdmin, String nasAdmin, String nomUtilisateur, String motDePasse,
        //String statut)
        Admin admin = new Admin("0", "Sow", "123456789", "sow", "12345", "admin");

        JSONObject jsonAdmin = JsonJava.convertirObjetEnJson(admin);
		/*

      // Utiliser JSONWriter pour obtenir une mise en forme
        StringWriter stringWriter = new StringWriter();
        JSONWriter jsonWriter = new JSONWriter(stringWriter);
        jsonWriter.object();
        for (String key : jsonAdmin.keySet()) {
            jsonWriter.key(key).value(jsonAdmin.get(key));
        }
        jsonWriter.endObject();

        // Afficher le JSON dans la console
        System.out.println(stringWriter.toString());

		 */


        List<Admin> listeAdmin = new ArrayList<Admin>();
        listeAdmin.add(admin);

        JSONArray jsonArray = JsonJava.convertirListeEnJson(listeAdmin);
        //System.out.println("Format json"+jsonAdmin.toString());


        List<Admin> listeAchargerAdmin = new ArrayList<>();
        try {
            listeAchargerAdmin = JsonJava.chargerBDDListe(listeAchargerAdmin, "com.didiso.sysyteme.Admin.json", Admin.class);
            //System.out.println("===================\n\n" + listeAchargerAdmin.toString() + "\n\n===================");
        } catch (IllegalArgumentException | SecurityException | IOException | ParseException e) {
            e.printStackTrace();
        }

        //Employe
		/*
		 * IdEmpl = idEmpl;
      this.nasEmpl = nasEmpl;
      this.nomEmpl = nomEmpl;
      this.dateEmbEmpl = dateEmbEmpl;
      this.dateDepartEmpl = dateDepartEmpl;
      this.poste = poste;
      this.nomUtilisateur = nomUtilisateur;
      this.motDePasse = motDePasse;
      this.statut = statut;
		 */
        Employe hadi = new Employe("1", "123456780", "Hadiatou Ibrahima Diallo", "01-06-2023 00:00:01", "99-99-9999 23:59:59", "Analyste", "hadi", "12345", "empl");  //"dd-MM-yyyy HH:mm:ss"
        Employe karen = new Employe("2", "123456781", "Karen Anne Diumanche", "01-06-2023 00:00:01", "99-99-9999 23:59:59", "Concepteur", "karen", "12345", "empl");  //"dd-MM-yyyy HH:mm:ss"
        Employe alpha = new Employe("3", "123456781", "Alpha Mamadou Sow", "01-06-2023 00:00:01", "99-99-9999 23:59:59", "Programmeur", "alpha", "12345", "empl");  //"dd-MM-yyyy HH:mm:ss"
        //Employe dimanche=new Employe("6","060603","DimancheKaren","01-06-2023 00:00:01","99-99-9999 23:59:59","Etudiante","Dim","0000","xx");


        JSONObject jsonEmpl1 = JsonJava.convertirObjetEnJson(hadi);
        JSONObject jsonEmpl2 = JsonJava.convertirObjetEnJson(karen);
        JSONObject jsonEmpl3 = JsonJava.convertirObjetEnJson(alpha);
        List<Employe> listeEmpl = new ArrayList<Employe>();  //La liste de tous les employes
        listeEmpl.add(hadi);
        listeEmpl.add(karen);
        listeEmpl.add(alpha);


        JSONArray jsonArrayEmpl = JsonJava.convertirListeEnJson(listeEmpl);  //liste json Employe unique pour tous
        //System.out.println("Format json"+jsonEmpl1.toString());


        List<Employe> listeAchargerEmpl = new ArrayList<>();
        try {
            listeAchargerEmpl = JsonJava.chargerBDDListe(listeAchargerEmpl, "com.didiso.sysyteme.Employe.json", Employe.class);
            //System.out.println("===================\n\n" + listeAchargerEmpl.toString() + "\n\n===================");
        } catch (IllegalArgumentException | SecurityException | IOException | ParseException e) {
            e.printStackTrace();
        }


        //Projet
        //(String idProj, String nomProj, String dateDebProj, String dateFinProj, int nbHeureBudgProj)

        Projet proj1 = new Projet("P1", "projet1", "01-06-2023 00:00:01", "30-09-2023 23:59:59", 5000);  //"dd-MM-yyyy HH:mm:ss"
        Projet proj2 = new Projet("P2", "projet2", "01-06-2023 00:00:01", "30-09-2023 23:59:59", 5000);  //"dd-MM-yyyy HH:mm:ss"
        Projet proj3 = new Projet("P3", "projet3", "01-06-2023 00:00:01", "30-09-2023 23:59:59", 5000);

        JSONObject jsonProj1 = JsonJava.convertirObjetEnJson(proj1);
        JSONObject jsonProj2 = JsonJava.convertirObjetEnJson(proj2);
        JSONObject jsonProj3 = JsonJava.convertirObjetEnJson(proj3);

        List<Projet> listeProj = new ArrayList<Projet>();  //La liste de tous les employes
        listeProj.add(proj1);
        listeProj.add(proj2);
        listeProj.add(proj3);


        JSONArray jsonArrayProj = JsonJava.convertirListeEnJson(listeProj);  //liste json Employe unique pour tous
        //System.out.println("Format json"+jsonProj1.toString());


        List<Projet> listeAchargerProj = new ArrayList<>();
        try {
            listeAchargerProj = JsonJava.chargerBDDListe(listeAchargerProj, "com.didiso.sysyteme.Projet.json", Projet.class);
            //System.out.println("===================\n\n" + listeAchargerProj.toString() + "\n\n===================");
        } catch (IllegalArgumentException | SecurityException | IOException | ParseException e) {
            e.printStackTrace();
        }


        //Disciplines

        //String idDisc, String nomDisc, double nbHBudget, String dateDebutDisc, String dateFinDisc

        Discipline design1P1 = new Discipline("D1P1", "design1P1", 1000.0, "06-06-2023 00:00:01", "21-06-2023 23:59:59");  //"dd-MM-yyyy HH:mm:ss"

        Discipline design2P1 = new Discipline("D2P1", "design2P1", 1000.0, "06-06-2023 00:00:01", "21-06-2023 23:59:59");

        Discipline implementationP1 = new Discipline("IP1", "ImplementationP1", 1000.0, "06-06-2023 00:00:01", "21-06-2023 23:59:59");

        Discipline testP1 = new Discipline("TP1", "TestP1", 1000.0, "06-06-2023 00:00:01", "21-06-2023 23:59:59");

        Discipline deployementP1 = new Discipline("DEP1", "DeployementP1", 1000.0, "06-06-2023 00:00:01", "21-06-2023 23:59:59");

        design1P1.setNbHTrav(20.0);
        design2P1.setNbHTrav(20.0);
        implementationP1.setNbHTrav(20.0);
        testP1.setNbHTrav(20.0);
        deployementP1.setNbHTrav(20.0);
        Discipline design1P2 = new Discipline("D1P2", "design1P2", 1000.0, "06-06-2023 00:00:01", "21-06-2023 23:59:59");  //"dd-MM-yyyy HH:mm:ss"
        Discipline design2P2 = new Discipline("D2P2", "design2P2", 1000.0, "06-06-2023 00:00:01", "21-06-2023 23:59:59");
        Discipline implementationP2 = new Discipline("IP2", "ImplementationP2", 1000.0, "06-06-2023 00:00:01", "21-06-2023 23:59:59");
        Discipline testP2 = new Discipline("TP2", "TestP2", 1000.0, "06-06-2023 00:00:01", "21-06-2023 23:59:59");
        Discipline deployementP2 = new Discipline("DEP2", "DeployementP2", 1000.0, "06-06-2023 00:00:01", "21-06-2023 23:59:59");

        design1P2.setNbHTrav(20.0);
        design2P2.setNbHTrav(20.0);
        implementationP2.setNbHTrav(20.0);
        testP2.setNbHTrav(20.0);
        deployementP2.setNbHTrav(20.0);

        Discipline design1P3 = new Discipline("D1P3", "design1P3", 1000.0, "06-06-2023 00:00:01", "21-06-2023 23:59:59");  //"dd-MM-yyyy HH:mm:ss"
        Discipline design2P3 = new Discipline("D2P3", "design2P3", 1000.0, "06-06-2023 00:00:01", "21-06-2023 23:59:59");
        Discipline implementationP3 = new Discipline("IP3", "ImplementationP3", 1000.0, "06-06-2023 00:00:01", "21-06-2023 23:59:59");
        Discipline testP3 = new Discipline("TP3", "TestP3", 1000.0, "06-06-2023 00:00:01", "21-06-2023 23:59:59");
        Discipline deployementP3 = new Discipline("DEP3", "DeployementP3", 1000.0, "06-06-2023 00:00:01", "21-06-2023 23:59:59");

        design1P3.setNbHTrav(20.0);
        design2P3.setNbHTrav(20.0);
        implementationP3.setNbHTrav(20.0);
        testP3.setNbHTrav(20.0);
        deployementP3.setNbHTrav(20.0);


        JSONObject jsonDesign1P1 = JsonJava.convertirObjetEnJson(design1P1);
        JSONObject jsonDesign2P1 = JsonJava.convertirObjetEnJson(design2P1);
        JSONObject jsonImplementationP1 = JsonJava.convertirObjetEnJson(implementationP1);
        JSONObject jsonTestP1 = JsonJava.convertirObjetEnJson(testP1);
        JSONObject jsonDeployementP1 = JsonJava.convertirObjetEnJson(deployementP1);

        List<Discipline> listeDisc = new ArrayList<Discipline>();  //La liste de tous les employes
        listeDisc.add(design1P1);
        listeDisc.add(design2P1);
        listeDisc.add(implementationP1);
        listeDisc.add(testP1);
        listeDisc.add(deployementP1);

        JSONArray jsonArrayDisc = JsonJava.convertirListeEnJson(listeDisc);  //liste json Employe unique pour tous
        //System.out.println("Format json"+jsonProj1.toString());


        List<Discipline> listeAchargerDisc = new ArrayList<>();
        try {
            listeAchargerDisc = JsonJava.chargerBDDListe(listeAchargerDisc, "com.didiso.sysyteme.Discipline.json", Discipline.class);
            //System.out.println("===================\n\n" + listeAchargerDisc.toString() + "\n\n===================");
        } catch (IllegalArgumentException | SecurityException | IOException | ParseException e) {
            e.printStackTrace();
        }


        //Taux
        //(String idTx, String dateDebutTx, double tauxH)

        Taux taux1 = new Taux("T1", "06-06-2023", 15);
        Taux tauxS1 = new Taux("TS1", "06-06-2023", 22.5);

        JSONObject jsonTx1 = JsonJava.convertirObjetEnJson(taux1);
        JSONObject jsonTxS1 = JsonJava.convertirObjetEnJson(tauxS1);
        List<Taux> listeTx = new ArrayList<Taux>();  //La liste de tous les employes
        listeTx.add(taux1);
        listeTx.add(tauxS1);

        JSONArray jsonArrayTx = JsonJava.convertirListeEnJson(listeTx);  //liste json Employe unique pour tous
        //System.out.println("Format json"+jsonEmpl1.toString());


        List<Taux> listeAchargerTx = new ArrayList<>();
        try {
            listeAchargerTx = JsonJava.chargerBDDListe(listeAchargerTx, "com.didiso.sysyteme.Taux.json", Taux.class);
            //System.out.println("===================\n\n" + listeAchargerEmpl.toString() + "\n\n===================");
        } catch (IllegalArgumentException | SecurityException | IOException | ParseException e) {
            e.printStackTrace();
        }

        Pointage pointage1 = new Pointage("PT1", Employe.parseDate("01-01-2023"), 8.0);
        Pointage pointage2 = new Pointage("PT2", Employe.parseDate("02-01-2023"), 9.0);
        Pointage pointage3 = new Pointage("PT3", Employe.parseDate("03-01-2023"), 10.0);
        Pointage pointage4 = new Pointage("PT4", Employe.parseDate("04-01-2023"), 11.0);
        Pointage pointage5 = new Pointage("PT5", Employe.parseDate("05-01-2023"), 12.0);
        Pointage pointage6 = new Pointage("PT6", Employe.parseDate("06-01-2023"), 8.0);
        Pointage pointage7 = new Pointage("PT7", Employe.parseDate("07-01-2023"), 9.0);
        Pointage pointage8 = new Pointage("PT8", Employe.parseDate("08-01-2023"), 10.0);
        Pointage pointage9 = new Pointage("PT9", Employe.parseDate("09-01-2023"), 11.0);
        Pointage pointage10 = new Pointage("PT10", Employe.parseDate("10-01-2023"), 12.0);


        Taux taux01 = new Taux("T1", "01-01-2023", 10.0);   //taux horaire normal = 10 $
        taux01.setDateFinTx("02-01-2023");
        Taux taux02 = new Taux("T2", "03-01-2023", 20.0);  //ne chevauche pas
        taux02.setDateFinTx("05-01-2023");

        Taux taux03 = new Taux("T3", "06-01-2023", 30.0);
        taux03.setDateFinTx("08-01-2023");

        Taux taux04 = new Taux("T4", "09-01-2023", 40);
        taux04.setDateFinTx("10-01-2023");


        Taux tauxS01 = new Taux("TS1", "01-01-2023", 15);  //taux horaire Suppl = 15 $
        tauxS01.setDateFinTx("02-01-2023");
        Taux tauxS02 = new Taux("TS2", "03-01-2023", 25);
        tauxS02.setDateFinTx("05-01-2023");

        Taux tauxS03 = new Taux("TS3", "06-01-2023", 35);
        tauxS03.setDateFinTx("08-01-2023");

        Taux tauxS04 = new Taux("TS4", "09-01-2023", 45);
        tauxS04.setDateFinTx("10-01-2023");


        //Liste de taux normal � Employe karen
        List<Taux> listeTxNormEmpl1 = new ArrayList<>();
		/*taux01.ajouterTaux(listeTxNormEmpl1);
      taux02.ajouterTaux(listeTxNormEmpl1);
      taux03.ajouterTaux(listeTxNormEmpl1);
      taux04.ajouterTaux(listeTxNormEmpl1);*/
        listeTxNormEmpl1.add(taux01);
        listeTxNormEmpl1.add(taux02);
        listeTxNormEmpl1.add(taux03);
        listeTxNormEmpl1.add(taux04);

        hadi.setTauxNormEmpl(listeTxNormEmpl1);
        karen.setTauxNormEmpl(listeTxNormEmpl1);  //ajouter liste de taux normal � Employe Karen
        alpha.setTauxNormEmpl(listeTxNormEmpl1);


        //Liste de taux supp � Employe karen
        List<Taux> listTxSuppEmpl1 = new ArrayList<>();
        tauxS01.ajouterTaux(listTxSuppEmpl1);
        tauxS02.ajouterTaux(listTxSuppEmpl1);
        tauxS03.ajouterTaux(listTxSuppEmpl1);
        tauxS04.ajouterTaux(listTxSuppEmpl1);
        hadi.setTauxSupp(listTxSuppEmpl1);  // ajouter liste de taux supp  Employe hadi
        karen.setTauxSupp(listTxSuppEmpl1);  // ajouter liste de taux supp Employe Karen
        alpha.setTauxSupp(listTxSuppEmpl1);  // ajouter liste de taux supp  Employe alpha


        List<Pointage> listPointage = new ArrayList<>();
        pointage1.ajouterPoint(listPointage);
        pointage2.ajouterPoint(listPointage);
        pointage3.ajouterPoint(listPointage);
        pointage4.ajouterPoint(listPointage);
        pointage5.ajouterPoint(listPointage);
        pointage6.ajouterPoint(listPointage);
        pointage7.ajouterPoint(listPointage);
        pointage8.ajouterPoint(listPointage);
        pointage9.ajouterPoint(listPointage);
        pointage10.ajouterPoint(listPointage);

        hadi.setListePointage(listPointage);
        karen.setListePointage(listPointage);
        alpha.setListePointage(listPointage);

        //Liste disc des proj
        proj1.setDisciplineProjet(listeDisc);
        proj2.setDisciplineProjet(listeDisc);
        proj3.setDisciplineProjet(listeDisc);

        //Liste proj pour chaque empl
        List<Projet> listeProjHadi = new ArrayList<>();
        listeProjHadi.add(proj1);
        listeProjHadi.add(proj2);
        hadi.setListeProjetAtt(listeProjHadi);

        List<Projet> listeProjKaren = new ArrayList<>();
        listeProjKaren.add(proj2);
        listeProjKaren.add(proj3);
        karen.setListeProjetAtt(listeProjKaren);

        List<Projet> listeProjAlpha = new ArrayList<>();
        listeProjAlpha.add(proj3);
        listeProjAlpha.add(proj1);
        alpha.setListeProjetAtt(listeProjAlpha);

        //Fonctionnalit� 1 : Rapport d'�tat de chaque projet
        List<Employe> listeEmployeProj1 = new ArrayList<>();
        listeEmployeProj1.add(hadi);
        listeEmployeProj1.add(alpha);
        proj1.setListeEmplProj(listeEmployeProj1);

        List<Employe> listeEmployeProj2 = new ArrayList<>();
        listeEmployeProj2.add(hadi);
        listeEmployeProj2.add(karen);
        proj2.setListeEmplProj(listeEmployeProj2);

        List<Employe> listeEmployeProj3 = new ArrayList<>();
        listeEmployeProj3.add(karen);
        listeEmployeProj3.add(alpha);
        proj3.setListeEmplProj(listeEmployeProj3);


        List<Discipline> listeDiscProj1 = new ArrayList();
        listeDiscProj1.add(design1P1);
        listeDiscProj1.add(design2P1);
        listeDiscProj1.add(implementationP1);
        listeDiscProj1.add(testP1);
        listeDiscProj1.add(deployementP1);
        proj1.setDisciplineProjet(listeDiscProj1);

        List<Discipline> listeDiscProj2 = new ArrayList();
        listeDiscProj2.add(design1P1);              //m�me disc pour les 3 projets
        listeDiscProj2.add(design2P1);
        listeDiscProj2.add(implementationP1);
        listeDiscProj2.add(testP1);
        listeDiscProj2.add(deployementP1);
        proj2.setDisciplineProjet(listeDiscProj2);

        List<Discipline> listeDiscProj3 = new ArrayList();
        listeDiscProj3.add(design1P1);
        listeDiscProj3.add(design2P1);
        listeDiscProj3.add(implementationP1);
        listeDiscProj3.add(testP1);
        listeDiscProj3.add(deployementP1);
        proj3.setDisciplineProjet(listeDiscProj3);

        List<Discipline> listeDiscHadi = new ArrayList<>();
        listeDiscHadi.add(design1P1);
        listeDiscHadi.add(design2P1);
        listeDiscHadi.add(implementationP1);
        listeDiscHadi.add(testP2);
        listeDiscHadi.add(deployementP2);
        hadi.setListeDiscAttr(listeDiscHadi);

        List<Discipline> listeDiscKaren = new ArrayList<>();
        listeDiscKaren.add(design1P2);
        listeDiscKaren.add(design2P2);
        listeDiscKaren.add(implementationP2);
        listeDiscKaren.add(testP3);
        listeDiscKaren.add(deployementP3);
        karen.setListeDiscAttr(listeDiscKaren);

        List<Discipline> listeDiscAlpha = new ArrayList<>();
        listeDiscAlpha.add(design1P3);
        listeDiscAlpha.add(design2P3);
        listeDiscAlpha.add(implementationP3);
        listeDiscAlpha.add(testP1);
        listeDiscAlpha.add(deployementP1);
        alpha.setListeDiscAttr(listeDiscAlpha);

        //System.out.println("=========== Hadi ============== \n"+ hadi.toString()+ "\n\n");

        //System.out.println("=========== Karen ============== \n"+ karen.toString()+ "\n\n");

        //System.out.println("=========== Alpha ============== \n"+ alpha.toString()+ "\n\n");

        //System.out.println(admin.toString());

        Scanner scanner = new Scanner(System.in);

        // Demande � l'utilisateur de saisir un nombre entier
        System.out.println("Bienvenue sur TimeLog.\n Pour vous connecter, veuillez choisir votre statut:\n(1) si vous etes Admin:\n(2) si vous etes employe:");
        String votreStatut;
        String nomUtilisateur;
        String motDePasse;
        int entreeStatut = scanner.nextInt();
        // Affiche le statut
        //System.out.println("Votre statut est : " + votreStatut);


        if (entreeStatut == 1) {  //admin
            // Demande à l'utilisateur de saisir une chaîne de caractères
            votreStatut = "admin";
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Veuillez maintenant saisir votre nom d'utilisateur.");
            nomUtilisateur = scanner2.nextLine();
            //System.out.println("Nom utilisateur : " + nomUtilisateur);
            // Affiche la chaîne de caractères saisie par l'utilisateur
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Veuillez saisir votre mot de passe : ");
            motDePasse = scanner3.nextLine();
            //Vérifier infos connexion
            if (nomUtilisateur.equalsIgnoreCase(admin.getNomUtilisateur())
                    && motDePasse.equalsIgnoreCase(admin.getMotDePasse())
                    && votreStatut.equalsIgnoreCase(admin.getStatut())) {
                System.out.println("Votre connexion a réussi !");
                admin.setEstConnecte(true);
                //System.out.println("Statut de connexion : "+ admin.isEstConnecte());
                System.err.println("Bienvenue : " + admin.getNomAdmin());

                Scanner scanner11 = new Scanner(System.in);
                System.out.println("Choisir l'une des options suivantes:\n"
                        + "(1) pour agir sur un projet\n"
                        + "(2) pour agir sur employe\n"
                        + "(3) pour générer rapport");
                int entree11 = scanner11.nextInt();
                if (entree11 == 1) {
                    System.err.println("Vous voulez agir sur projet\n");
                    System.out.println("Choisir l'une des options suivantes:\n"
                            + "(1) pour afficher liste des projets\n"
                            + "(2) pour afficher un projet\n"
                            + "(3) pour creer un projet\n"
                            + "(4) pour modifier un projet\n"
                            + "(5) pour supprimer un projet\n"
                            + "(6) pour autres action sur éléments du projet (ajouter/retirer/afficher employé, discipline. taux)");
                    Scanner scanner111 = new Scanner(System.in);
                    int entree111 = scanner111.nextInt();
                    if (entree111 == 1) {
                        System.err.println("Vous voulez afficher liste des projet\n");
                        System.out.println("Voici la liste des projets: \n\n" + listeProj.toString() + "\n\n");

                        System.out.println("====================================================");
                    }

                    if (entree111 == 2) {
                        System.err.println("Vous voulez afficher un projet");
                        System.out.println("Veuillez saisir l'id du projet : ");
                        Scanner scannerIdProj = new Scanner(System.in);
                        String idProjCherche = scannerIdProj.nextLine();

                        Projet projetCherche = Projet.trouverProj(idProjCherche, listeProj);

                        System.out.println("Voici le projet demandé : \n" + projetCherche.toString() + "\n\n");
                        System.out.println("====================================================");
                    }

                    if (entree111 == 3) {
                        System.err.println("Vous voulez créer un projet");
                        //(String idProj, String nomProj, String dateDebProj, String dateFinProj, int nbHeureBudgProj)
                        System.out.println("Veuillez saisir l'id du projet à créer : ");
                        Scanner scannerIdProjACreer = new Scanner(System.in);
                        String idProjACreer = scannerIdProjACreer.nextLine();

                        System.out.println("Veuillez saisir le nom du projet à créer : ");
                        Scanner scannerNomProjACreer = new Scanner(System.in);
                        String nomProjACreer = scannerNomProjACreer.nextLine();

                        System.out.println("Veuillez saisir la date début du projet à créer : ");
                        Scanner scannerDateDebProjACreer = new Scanner(System.in);
                        String dateDebProjACreer = scannerDateDebProjACreer.nextLine();
                        System.out.println("Veuillez saisir la date de fin prévue du projet à créer : ");
                        Scanner scannerDateFinProjACreer = new Scanner(System.in);
                        String dateFinProjACreer = scannerDateFinProjACreer.nextLine();

                        System.out.println("Veuillez saisir le nombre d'heures budgetisé du projet à créer : ");
                        Scanner scannerNbHBudgProjACreer = new Scanner(System.in);
                        int nbHbudgProjACreer = scannerNbHBudgProjACreer.nextInt();

                        Projet projetCree = new Projet(idProjACreer, nomProjACreer, dateDebProjACreer, dateFinProjACreer, nbHbudgProjACreer);

                        System.out.println("projet à créer : " + projetCree.toString());
                        projetCree.executerCreationProj();


                        //System.out.println("Voici le projet demandé : \n" + projetCherche.toString() + "\n\n");
                        System.out.println("====================================================");
                    }


                    if (entree111 == 4) {
                        String nouvNomProj;
                        String nouvDateFinProj;
                        int nouvNbHProj;
                        System.err.println("Vous voulez modifier un projet");
                        //(String idProj, String nomProj, String dateDebProj, String dateFinProj, int nbHeureBudgProj)
                        System.out.println("Veuillez saisir l'id du projet à créer : ");
                        Scanner scannerIdProjAModifier = new Scanner(System.in);
                        String idProjAModifier = scannerIdProjAModifier.nextLine();
                        System.out.println("Liste actualisée : \n" + listeProj.toString() + "\n\n");
                        Projet projetAModifier = Projet.trouverProj(idProjAModifier, listeProj);
                        System.out.println("Voici les informations du projet à modifier : \n" + projetAModifier.toString() + "\n\n");

                        System.out.println("Voulez-vous modifier le nom du projet ?\n(1) pour Oui\n(0) pour Non : ");
                        Scanner scannerNomAModifier = new Scanner(System.in);
                        int entreee = scannerNomAModifier.nextInt();
                        if (entreee == 1) {
                            System.out.println("Veuillez saisir le nouveau nom : ");
                            Scanner scannerNomSaisiAModifier = new Scanner(System.in);
                            nouvNomProj = scannerNomSaisiAModifier.nextLine();
                            //projetAModifier.setNomProj(nouvNomProj);
                        } else {
                            nouvNomProj = projetAModifier.getNomProj();
                        }

                        System.out.println("Voulez-vous modifier la date de fin du projet ?\n(1) pour Oui\n(0) pour Non : ");
                        Scanner scannerDateFinAModifier = new Scanner(System.in);
                        int entreeF = scannerDateFinAModifier.nextInt();
                        if (entreeF == 1) {
                            System.out.println("Veuillez saisir la nouvelle date : ");
                            Scanner scannerDateFSaisiAModifier = new Scanner(System.in);
                            nouvDateFinProj = scannerDateFSaisiAModifier.nextLine();
                            //projetAModifier.setNomProj(nouvNomProj);
                        } else {
                            nouvDateFinProj = projetAModifier.getDateFinProj();
                        }
                        System.out.println("Voulez-vous modifier le nombre d'heure budgetisé du projet ?\n(1) pour Oui\n(0) pour Non : ");
                        Scanner scannerNbHBudgAModifier = new Scanner(System.in);
                        int entreeNbHB = scannerNbHBudgAModifier.nextInt();
                        if (entreeNbHB == 1) {
                            System.out.println("Veuillez saisir le nouveau nombre heure budgetisé : ");
                            Scanner scannerNbHBudgSaisiAModifier = new Scanner(System.in);
                            nouvNbHProj = scannerNbHBudgSaisiAModifier.nextInt();
                            //projetAModifier.setNomProj(nouvNomProj);
                        } else {
                            nouvNbHProj = projetAModifier.getNbHeureBudgProj();
                        }
                        Projet nouvProj = new Projet();
                        //(String idProj, String nomProj, String dateDebProj, String dateFinProj, int nbHeureBudgProj,
                        //List<Employe> listeEmplProj, boolean estActif, List<Discipline> disciplineProjet)
                        nouvProj.setIdProj(projetAModifier.getIdProj());
                        nouvProj.setNomProj(nouvNomProj);
                        nouvProj.setDateDebProj(projetAModifier.getDateDebProj());
                        nouvProj.setDateFinProj(nouvDateFinProj);
                        nouvProj.setNbHeureBudgProj(nouvNbHProj);
                        nouvProj.setListeEmplProj(projetAModifier.getListeEmplProj());
                        nouvProj.setEstActif(projetAModifier.isEstActif());
                        nouvProj.setDisciplineProjet(projetAModifier.getDisciplineProjet());

                        Projet.modifierProj(idProjAModifier, listeProj, nouvProj);
						/*
						System.out.println("Veuillez saisir le nom du projet à créer : ");
						Scanner scannerNomProjACreer = new Scanner(System.in);
						String nomProjACreer = scannerNomProjACreer.nextLine();

						System.out.println("Veuillez saisir la date début du projet à créer : ");
						Scanner scannerDateDebProjACreer = new Scanner(System.in);
						String dateDebProjACreer = scannerDateDebProjACreer.nextLine();
						System.out.println("Veuillez saisir la date de fin prévue du projet à créer : ");
						Scanner scannerDateFinProjACreer = new Scanner(System.in);
						String dateFinProjACreer = scannerDateFinProjACreer.nextLine();

						System.out.println("Veuillez saisir le nombre d'heures budgetisé du projet à créer : ");
						Scanner scannerNbHBudgProjACreer = new Scanner(System.in);
						int nbHbudgProjACreer = scannerNbHBudgProjACreer.nextInt();

						Projet projetCree = new Projet (idProjACreer, nomProjACreer, dateDebProjACreer, dateFinProjACreer, nbHbudgProjACreer);

						System.out.println("projet à créer : " + projetCree.toString());
						projetCree.executerCreationProj();
						*/

                        //System.out.println("Voici le projet demandé : \n" + projetCherche.toString() + "\n\n");
                        System.out.println("====================================================");
                    }


                }


            } else {
                System.out.println("Nous sommes désolé ! Informations fournies incorrectes");
                System.out.println("Statut de connexion : " + admin.isEstConnecte());
            }


        } else {


            if (entreeStatut == 2) { //empl
                votreStatut = "empl";
                // Demande à l'utilisateur de saisir une chaîne de caractères
                Scanner scanner21 = new Scanner(System.in);
                System.out.println("Veuillez maintenant saisir votre nom d'utilisateur.");

                String nomUtilisateurEmpl = scanner21.nextLine();
                System.out.println("Nom utilisateur : " + nomUtilisateurEmpl);


                // Affiche la chaîne de caractères saisie par l'utilisateur
                Scanner scanner22 = new Scanner(System.in);
                System.out.println("Veuillez saisir votre mot de passe : ");
                String motDePasseEmpl = scanner22.nextLine();


                for (Employe employe : listeEmpl) {
                    if (nomUtilisateurEmpl.equalsIgnoreCase(employe.getNomUtilisateur())
                            && motDePasseEmpl.equalsIgnoreCase(employe.getMotDePasse())
                    ) {
                        System.out.println("Votre connexion a réussi !");
                        employe.setEstConnecte(true);

                        //System.err.println("Statut de connexion : "+ employe.isEstConnecte());
                        System.err.println("Statut de connexion : " + employe.getNomEmpl());
                        break;

                    }
                }
            } else {
                System.err.println("Entree invalide. Vous devez entrer 1 si vous êtes admin ou 2 si vous êtes employe : ");
            }
        }


        //Avancement Proj1
        double heureTravProj1 = proj1.calculerNbHeureTravProj();
        double avancementProj1 = proj1.calculerAvancementProj();

        //System.out.println("Heure travail Projet 1 : "+ heureTravProj1+ "\n\n");
        System.out.println("Avancement Projet 1 : " + avancementProj1 + "\n\n");

        Date date1 = Employe.parseDate("02-01-2023");
        Date date2 = Employe.parseDate("05-08-2023");

        double salaireKaren = karen.calculerSalaire(date1, date2);
        System.out.println("Salaire Karen : " + salaireKaren + " $");

        //Question1
        //proj1.getDisciplineProjet() : liste des disipli proj1
        //get(0)   premier element
        double n1 = proj1.getDisciplineProjet().get(0).getNbHTrav();
        System.out.println("Question 1 exple : " + n1);

        double avancDsc1Proj1 = n1 / proj1.getDisciplineProjet().get(0).getNbHBudget();
        System.out.println("Question 1 exple Avance : " + avancDsc1Proj1 * 100 + "%");

        List<Discipline> listDisc = new ArrayList<>();
        List<Projet> listProj = new ArrayList<>();


        //System.out.println(listeEmpl.toString());
        //System.out.println(listeProj.toString());
        //System.out.println(listeDisc.toString());
    }


}