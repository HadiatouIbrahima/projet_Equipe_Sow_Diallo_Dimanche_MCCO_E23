package com.didiso.sysyteme;

import java.util.List;

import javax.swing.JOptionPane;

import Generique.JsonJava;



public class Projet {
	
	private String idProj;
	private String nomProj;
	private String dateDebProj;
	private String dateFinProj;
	private int nbHeureBudgProj;
	private List<Employe> listeEmplProj;
	private boolean estActif;
	private List<Discipline> disciplineProjet;
	//private List<Projet> listeProjet;
	/**
	 * 
	 */
	
	public Projet() {
		super();
	}
	/**
	 * @param idProj
	 * @param nomProj
	 * @param dateDebProj
	 * @param dateFinProj
	 * @param nbHeureBudgProj
	 */
	
	public Projet(String idProj, String nomProj, String dateDebProj, String dateFinProj, int nbHeureBudgProj) {
		super();
		this.idProj = idProj;
		this.nomProj = nomProj;
		this.dateDebProj = dateDebProj;
		this.dateFinProj = dateFinProj;
		this.nbHeureBudgProj = nbHeureBudgProj;
	}
	/**
	 * @return the idProj
	 */
	
	public String getIdProj() {
		return idProj;
	}
	/**
	 * @param idProj the idProj to set
	 */
	
	public void setIdProj(String idProj) {
		this.idProj = idProj;
	}
	/**
	 * @return the nomProj
	 */
	
	public String getNomProj() {
		return nomProj;
	}
	/**
	 * @param nomProj the nomProj to set
	 */
	
	public void setNomProj(String nomProj) {
		this.nomProj = nomProj;
	}
	/**
	 * @return the dateDebProj
	 */
	
	public String getDateDebProj() {
		return dateDebProj;
	}
	/**
	 * @param dateDebProj the dateDebProj to set
	 */
	
	public void setDateDebProj(String dateDebProj) {
		this.dateDebProj = dateDebProj;
	}
	/**
	 * @return the dateFinProj
	 */
	
	public String getDateFinProj() {
		return dateFinProj;
	}
	/**
	 * @param dateFinProj the dateFinProj to set
	 */
	
	public void setDateFinProj(String dateFinProj) {
		this.dateFinProj = dateFinProj;
	}
	/**
	 * @return the nbHeureBudgProj
	 */
	
	public int getNbHeureBudgProj() {
		return nbHeureBudgProj;
	}
	/**
	 * @param nbHeureBudgProj the nbHeureBudgProj to set
	 */
	public void setNbHeureBudgProj(int nbHeureBudgProj) {
		this.nbHeureBudgProj = nbHeureBudgProj;
	}
	/**
	 * @return the listeEmplProj
	 */
	public List<Employe> getListeEmplProj() {
		return listeEmplProj;
	}
	/**
	 * @param listeEmplProj the listeEmplProj to set
	 */
	public void setListeEmplProj(List<Employe> listeEmplProj) {
		this.listeEmplProj = listeEmplProj;
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
	 * @return the disciplineProjet
	 */
	public List<Discipline> getDisciplineProjet() {
		return disciplineProjet;
	}
	/**
	 * @param disciplineProjet the disciplineProjet to set
	 */
	public void setDisciplineProjet(List<Discipline> disciplineProjet) {
		this.disciplineProjet = disciplineProjet;
	}
	@Override
	public String toString() {
		return "Projet [idProj=" + idProj + ", nomProj=" + nomProj + ", dateDebProj=" + dateDebProj + ", dateFinProj="
				+ dateFinProj + ", nbHeureBudgProj=" + nbHeureBudgProj + ", listeEmplProj=" + listeEmplProj
				+ ", estActif=" + estActif + ", disciplineProjet=" + disciplineProjet + "]";
	}
	

	
	public static boolean estDanslaBaseDonneeProj(String idProjCherche, List<Projet> listeProj){
		boolean trouve=false;
		for (int i=0; i<listeProj.size(); i++) {
			if(listeProj.get(i).getIdProj().equals(idProjCherche)) {
				trouve=true;
				return trouve;
			}
		}
		return trouve;
	}
	
	public static int chercherPositionProjTrouve(String idProjCherche, List<Projet> listeProj){
		if(estDanslaBaseDonneeProj( idProjCherche, listeProj)) {
			for (int i=0; i<listeProj.size(); i++) {
				if(listeProj.get(i).getIdProj().equals(idProjCherche)) {
					return i;
				}
			}
		}
		return -1;
	}
	
	
	public static Projet  trouverProj(String idProjCherche, List<Projet> listeProj) {
		Projet projet=new Projet();	
		boolean arret=true;
		for (int i=0; i<listeProj.size(); i++) {
			System.out.println(listeProj.get(i).getIdProj());
			System.out.println(idProjCherche);
			if( (listeProj.get(i).getIdProj().equals(idProjCherche))&&(arret) ) {
				arret=false;
				projet=listeProj.get(i);
				System.out.println(listeProj.get(i).toString());
				
			}else {
				
			}
		}
		return projet;

	}
	
	public void ajouterProj(List<Projet> listeProj) {
		if(!estDanslaBaseDonneeProj(this.idProj, listeProj)) {
			listeProj.add(this);
			JsonJava.convertirListeEnJson(listeProj);
		}else {
			JOptionPane.showMessageDialog(null, "Ce projet est déjà dans la base de donnée", "Info", JOptionPane.CLOSED_OPTION);
		}
	}

	public static void supprimerProjet(String idProjAsupprimer, List<Projet> listeProj) {
		//int position=chercherPositionProjTrouve(idProjAsupprimer, listeProj);
		if(estDanslaBaseDonneeProj(idProjAsupprimer, listeProj)) {
			listeProj.remove(chercherPositionProjTrouve(idProjAsupprimer, listeProj));
			System.out.println("Nouvelle liste : "+listeProj.toString());
			JsonJava.convertirListeEnJson(listeProj);
		}
	}

	
	
	public static Projet modifierProj(String idProjAmodifier, List<Projet> listeProj, Projet nouvProj) {
		//int j=-1;
		int i;
		int positionProjCherche = 0;
		//boolean trouve=false;
		boolean conditionArret=true;
		for (i=0; i<listeProj.size(); i++) {
			if((listeProj.get(i).getIdProj()==idProjAmodifier)&&conditionArret) {
				positionProjCherche=i;
				System.out.println("Projet à modifier = "+listeProj.get(positionProjCherche));
				//trouve=true;
				conditionArret=false;
			}

		}
		
		if(estDanslaBaseDonneeProj(idProjAmodifier, listeProj)) {
			int positionProjAmodifier=chercherPositionProjTrouve(idProjAmodifier, listeProj);
			Projet projAmodifier=listeProj.get(positionProjAmodifier);
			if(projAmodifier.getIdProj().equals(nouvProj.getIdProj())){  
				
				if(!projAmodifier.getNomProj().equals(nouvProj.getNomProj())){
					projAmodifier.setNomProj(nouvProj.getNomProj());
				}
				
				if(!projAmodifier.getDateFinProj().equals(nouvProj.getDateFinProj())){
					projAmodifier.setDateFinProj(nouvProj.getDateFinProj());
				}
				if(projAmodifier.getNbHeureBudgProj()!=(nouvProj.getNbHeureBudgProj())){
					projAmodifier.setNbHeureBudgProj(nouvProj.getNbHeureBudgProj());
				}
				listeProj.set(positionProjCherche, nouvProj);
				System.out.println("nouvelle liste : "+listeProj.toString());
				
				JsonJava.convertirListeEnJson(listeProj);
				return nouvProj;
			}else {
				System.out.println("Id inexistant");
				return projAmodifier;
			}
		}
		
		return nouvProj;
		
	}
	
	/*
	 * private List<Employe> listeEmplProj;
	private boolean estActif;
	private List<Discipline> disciplineProjet;
	 */
	public void ajouterEmployeAProjet(Employe employe) {
		if(!Employe.estDanslaBaseDonneeEmpl(employe.getIdEmpl(), this.listeEmplProj)) {
			this.listeEmplProj.add(employe);
		}
	}
	
	public void retirerEmployeProj(Employe employe) {
		//implementer chercherPositionEmplTrouve dans la classe Empl
		  int positionAsupprimer = Employe.chercherPositionEmplTrouve(employe.getIdEmpl(), this.getListeEmplProj());
		    
		    if (positionAsupprimer != -1) {
		    	this.getListeEmplProj().remove(positionAsupprimer);
		        //creerListeEmplJson(liste);
		    }
	}
	
	public void ajouterDiscProjet(Discipline disc) {
		if(!Discipline.estDanslaBaseDonneeDisc(disc.getIdDisc() , this.disciplineProjet)) {
		this.disciplineProjet.add(disc);
		}
	}
	
	public Projet DesactiverProjet() {
		this.setEstActif(false);
		return this;
	}
	
	public void retirerDiscProjet(Discipline disc) {
		int positionAsupprimer = Discipline.chercherPositionDiscTrouve(disc.getIdDisc(), this.getDisciplineProjet());
	    if (positionAsupprimer != -1) {
	    	this.getListeEmplProj().remove(positionAsupprimer);
	        //creerListeDiscJson(liste);
	    }
	}
	
	public double calculerNbHeureTravProj() {
		double nbH =0;
		for(Discipline disc : this.disciplineProjet) {
			double nbDisc = disc.getNbHTrav();
			//System.out.println("disc : " + nbDisc);
			nbH = nbH + nbDisc;
			//System.out.println("nbHT : " + nbH);
		}
		return nbH;
	}
	
	
	public double calculerAvancementProj() {
		double nbH = calculerNbHeureTravProj();
		System.out.println("Total : "+ this.getNbHeureBudgProj());
		double avancementProj = nbH/this.getNbHeureBudgProj();
		return avancementProj;
	}

}


