package com.didiso.sysyteme;

import java.util.List;

import javax.swing.JOptionPane;

import org.json.simple.JSONObject;

import Generique.JsonJava;

public class Discipline {
	
	private String idDisc;
	private String nomDisc;
	private double nbHBudget;
	private double nbHTrav;
	private String dateDebutDisc;
	private String dateFinDisc;
	private boolean estActif;
	private List<Employe> listeEmplSurDisc;
	//private List<Discipline> disciplines;
	
	
	/**
	 * 
	 */
	public Discipline() {
	}


	/**
	 * @param idDisc
	 * @param nomDisc
	 * @param nbHBudget
	 * @param dateDebutDisc
	 * @param dateFinDisc
	 */
	public Discipline(String idDisc, String nomDisc, double nbHBudget, String dateDebutDisc, String dateFinDisc) {
		super();
		this.idDisc = idDisc;
		this.nomDisc = nomDisc;
		this.nbHBudget = nbHBudget;
		this.dateDebutDisc = dateDebutDisc;
		this.dateFinDisc = dateFinDisc;
		this.nbHTrav = 0;
	}


	/**
	 * @return the idDisc
	 */
	public String getIdDisc() {
		return idDisc;
	}


	/**
	 * @param idDisc the idDisc to set
	 */
	public void setIdDisc(String idDisc) {
		this.idDisc = idDisc;
	}


	/**
	 * @return the nomDisc
	 */
	public String getNomDisc() {
		return nomDisc;
	}

	/**
	 * @param nomDisc the nomDisc to set
	 */
	public void setNomDisc(String nomDisc) {
		this.nomDisc = nomDisc;
	}


	/**
	 * @return the nbHBudget
	 */
	public double getNbHBudget() {
		return nbHBudget;
	}


	/**
	 * @param nbHBudget the nbHBudget to set
	 */
	public void setNbHBudget(double nbHBudget) {
		this.nbHBudget = nbHBudget;
	}


	/**
	 * @return the nbHTrav
	 */
	public double getNbHTrav() {
		return nbHTrav;
	}


	/**
	 * @param nbHTrav the nbHTrav to set
	 */
	public void setNbHTrav(double nbHTrav) {
		this.nbHTrav = nbHTrav;
	}


	/**
	 * @return the dateDebutDisc
	 */
	public String getDateDebutDisc() {
		return dateDebutDisc;
	}


	/**
	 * @param dateDebutDisc the dateDebutDisc to set
	 */
	public void setDateDebutDisc(String dateDebutDisc) {
		this.dateDebutDisc = dateDebutDisc;
	}


	/**
	 * @return the dateFinDisc
	 */
	public String getDateFinDisc() {
		return dateFinDisc;
	}


	/**
	 * @param dateFinDisc the dateFinDisc to set
	 */
	public void setDateFinDisc(String dateFinDisc) {
		this.dateFinDisc = dateFinDisc;
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
	 * @return the listeEmplSurDisc
	 */
	public List<Employe> getListeEmplSurDisc() {
		return listeEmplSurDisc;
	}


	/**
	 * @param listeEmplSurDisc the listeEmplSurDisc to set
	 */
	public void setListeEmplSurDisc(List<Employe> listeEmplSurDisc) {
		this.listeEmplSurDisc = listeEmplSurDisc;
	}


	/**
	 * @return the disciplines
	 */
	


	/**
	 * @param disciplines the disciplines to set
	 */
	//public void setDisciplines(List<Discipline> disciplines) {
		//this.disciplines = disciplines;
	//}


	


	/*
	 * private String idDisc;
	private String nomDisc;
	private double nbHBudget;
	private double nbHTrav;
	private String dateDebutDisc;
	private String dateFinDisc;
	private boolean estActif;
	private List<Employe> listeEmplSurDisc;
	private List<Discipline> disciplines;
	 */
	public static boolean estDanslaBaseDonneeDisc(String idDiscCherche, List<Discipline> listeDisc){
		boolean trouve=false;
		for (int i=0; i<listeDisc.size(); i++) {
			if(listeDisc.get(i).getIdDisc().equals(idDiscCherche)) {
				trouve=true;
				return trouve;
			}
		}
		return trouve;
	}
	
	@Override
	public String toString() {
		return "Discipline [idDisc=" + idDisc + ", nomDisc=" + nomDisc + ", nbHBudget=" + nbHBudget + ", nbHTrav="
				+ nbHTrav + ", dateDebutDisc=" + dateDebutDisc + ", dateFinDisc=" + dateFinDisc + ", estActif="
				+ estActif + ", listeEmplSurDisc=" + listeEmplSurDisc + "]";
	}


	public static int chercherPositionDiscTrouve(String idDiscCherche, List<Discipline> listeDisc){
		if(estDanslaBaseDonneeDisc( idDiscCherche, listeDisc)) {
			for (int i=0; i<listeDisc.size(); i++) {
				if(listeDisc.get(i).getIdDisc().equals(idDiscCherche)) {
					return i;
				}
			}
		}
		return -1;
	}
	
	
	public static Discipline  trouverDisc(String idDiscCherche, List<Discipline> listeDisc) {
		Discipline disc=new Discipline();	
		boolean arret=true;
		for (int i=0; i<listeDisc.size(); i++) {
			System.out.println(listeDisc.get(i).getIdDisc());
			System.out.println(idDiscCherche);
			if( (listeDisc.get(i).getIdDisc().equals(idDiscCherche))&&(arret) ) {
				arret=false;
				disc=listeDisc.get(i);
				System.out.println(listeDisc.get(i).toString());
				
			}else {
				
			}
		}
		return disc;

	}
	
	
	public void ajouterDisc(List<Discipline> listeDisc) {
		if(!estDanslaBaseDonneeDisc(this.idDisc, listeDisc)) {
			listeDisc.add(this);
			JsonJava.convertirListeEnJson(listeDisc);
		}else {
			JOptionPane.showMessageDialog(null, "Ce projet est déjà dans la base de donnée", "Info", JOptionPane.CLOSED_OPTION);
		}
	}

	
	public static void supprimerDisc(String idDiscAsupprimer, List<Discipline> listeDisc) {
		//int position=chercherPositionProjTrouve(idProjAsupprimer, listeProj);
		if(estDanslaBaseDonneeDisc(idDiscAsupprimer, listeDisc)) {
			listeDisc.remove(chercherPositionDiscTrouve(idDiscAsupprimer, listeDisc));
			System.out.println("Nouvelle liste : "+listeDisc.toString());
			JsonJava.convertirListeEnJson(listeDisc);
		}
	}

	
	
	public static Discipline modifierDisc(List<Discipline> listeDisc, Discipline nouvDisc) {
		//int j=-1;
		int i;
		int positionDiscCherche = 0;
		//boolean trouve=false;
		boolean conditionArret=true;
		for (i=0; i<listeDisc.size(); i++) {
			if((listeDisc.get(i).getIdDisc()==nouvDisc.getIdDisc())&&conditionArret) {
				positionDiscCherche=i;
				System.out.println("Employe à modifier = "+listeDisc.get(positionDiscCherche));
				//trouve=true;
				conditionArret=false;
			}

		}
		
		/*
		 *
	
	/*
	 *
	private String nomDisc;
	private double nbHBudget;
	private String dateFinDisc;
	
	 */
		 
		
		if(estDanslaBaseDonneeDisc(nouvDisc.getIdDisc(), listeDisc)) {
			int positionDiscAmodifier=chercherPositionDiscTrouve(nouvDisc.getIdDisc(), listeDisc);
			Discipline discAmodifier=listeDisc.get(positionDiscAmodifier);
			if(discAmodifier.getIdDisc().equals(nouvDisc.getIdDisc())){  //Pour éviter de modifier l'ID
				
				if(!discAmodifier.getNomDisc().equals(nouvDisc.getNomDisc())){
					discAmodifier.setNomDisc(nouvDisc.getNomDisc());
				}
				
				if(discAmodifier.getNbHBudget()!=(nouvDisc.getNbHBudget())){
					discAmodifier.setNbHBudget(nouvDisc.getNbHBudget());
				}
				if(discAmodifier.getDateFinDisc()!=(nouvDisc.getDateFinDisc())){
					discAmodifier.setDateFinDisc(nouvDisc.getDateFinDisc());
				}
				
				listeDisc.set(positionDiscCherche, nouvDisc);
				System.out.println("nouvelle liste : "+listeDisc.toString());
				
				JsonJava.convertirListeEnJson(listeDisc);
				return nouvDisc;
			}else {
				System.out.println("Id inexistant");
				return discAmodifier;
			}
		}
		
		return nouvDisc;
		
	}
	
	/*
	private List<Employe> listeEmplSurDisc;
	private List<Discipline> disciplines;
	
	 */
	
	public void ajouterEmplADisc(Employe empl) {
		if(!Employe.estDanslaBaseDonneeEmpl(empl.getIdEmpl(), this.listeEmplSurDisc)) {
			this.listeEmplSurDisc.add(empl);
		}
	}
	
	public void retirerEmplADisc(Employe empl) {
		int positionAsupprimer = Employe.chercherPositionEmplTrouve(empl.getIdEmpl(), this.listeEmplSurDisc);
	    if (positionAsupprimer != -1) {
	    	this.getListeEmplSurDisc().remove(positionAsupprimer);
	        //creerListeDiscJson(liste);
	    }
	}
	
	/*
	public void ajouterTauxSuppEmpl(Taux taux) {
		if(!Taux.estDanslaBaseDonneeEmpl(taux.getIdTx(), this.tauxSupp)) {
			this.tauxSupp.add(taux);
		}
	}
	
	
	public void ajouterPointEmpl(Pointage pointage) {
		if(!Pointage.estDanslaBaseDonneeDisc(pointage.getIdPoint() , this.listePointage)) {
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
	*/
	
	
	
	/*
	public void ajouterEmplADisc(Employe empl) {
		if(!Employe.estDanslaBaseDonneeDisc(empl.getIdEmpl() , this.listeDiscAttr)) {
		this.listeDiscAttr.add(disc);
		}
	}
	*/
	
	/*
	public Projet DesactiverProjet() {
		this.setEstActif(false);
		return this;
	}
	
	
	public void retirerDiscEmpl(Discipline disc) {
		int positionAsupprimer = Discipline.chercherPositionDiscTrouve(disc.getIdDisc(), this.listeDiscAttr);
	    if (positionAsupprimer != -1) {
	    	this.listeDiscAttr.remove(positionAsupprimer);
	        //creerListeDiscJson(liste);
	    }
	}
	*/
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


	public double calculerAvancementDisc() {
		return this.nbHTrav/this.nbHBudget;
	}
	
	
	
	
	
	
	

}
