package Generique;

public class Connexion {
	
/*

    public static void main(String[] args) {
        // Créez des exemples d'employés, projets et disciplines
        Employe employe1 = new Employe("john", "password123", "Actif");
        // ... créez d'autres employés, projets et disciplines
        
        // Créez une liste de projets et disciplines pour l'exemple
        List<Projet> listeProjets = ...; // Remplacez par votre liste de projets
        List<Discipline> listeDisciplines = ...; // Remplacez par votre liste de disciplines
        
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

    public static boolean verifierInfosConnexion(Employe employe) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nom d'utilisateur : ");
        String nomUtilisateur = scanner.nextLine();
        System.out.println("Mot de passe : ");
        String motDePasse = scanner.nextLine();
        
        if (nomUtilisateur.equals(employe.getNomUtilisateur()) && motDePasse.equals(employe.getMotDePasse())) {
            System.out.println("Connexion réussie !");
            return true;
        } else {
            System.out.println("Échec de la connexion !");
            return false;
        }
    }

    public static Projet choisirProjet(List<Projet> listeProjets) {
        // Affichez la liste des projets et demandez à l'utilisateur de choisir
        // Retournez le projet choisi ou null en cas d'annulation
    }

    public static Discipline choisirDiscipline(Projet projet, List<Discipline> listeDisciplines) {
        // Affichez la liste des disciplines du projet choisi
        // Demandez à l'utilisateur de choisir une discipline
        // Retournez la discipline choisie ou null en cas d'annulation
    }

    public static void enregistrerDebutTravail(Employe employe, Discipline discipline) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date dateDebut = new Date();
        
        System.out.println("Début du travail enregistré le " + dateFormat.format(dateDebut));
        // Enregistrez le début du travail dans la base de données ou autre
    }

    public static void seDeconnecter() {
        System.out.println("Déconnexion réussie !");
    }

    public static void enregistrerFinTravail(Employe employe, Discipline discipline) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date dateFin = new Date();
        
        System.out.println("Fin du travail enregistrée le " + dateFormat.format(dateFin));
        
        // Calculez le temps effectué et enregistrez-le dans la base de données ou autre
    }
}

	 */

}
