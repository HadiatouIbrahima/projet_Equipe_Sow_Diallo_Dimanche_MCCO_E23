package com.didiso.sysyteme;

import java.util.List;

import javax.swing.JOptionPane;

import Generique.JsonJava;

public class Taux {
	private String idTx;
	private String dateDebutTx;
	private String dateFinTx;
	private double tauxH;
	private double nbHeure;
	
	
	
	

	/**
	 * 
	 */
	public Taux() {
		super();
	}


	/**
	 * @param idTx
	 * @param dateDebutTx
	 * @param tauxH
	 */
	public Taux(String idTx, String dateDebutTx, double tauxH) {
		super();
		this.idTx = idTx;
		this.dateDebutTx = dateDebutTx;
		this.dateFinTx = "99-99-9999 23:29:29";
		this.tauxH = tauxH;
	}


	/**
	 * @return the idTx
	 */
	public String getIdTx() {
		return idTx;
	}


	/**
	 * @param idTx the idTx to set
	 */
	public void setIdTx(String idTx) {
		this.idTx = idTx;
	}


	/**
	 * @return the dateDebutTx
	 */
	public String getDateDebutTx() {
		return dateDebutTx;
	}

	/**
	 * @param dateDebutTx the dateDebutTx to set
	 */
	public void setDateDebutTx(String dateDebutTx) {
		this.dateDebutTx = dateDebutTx;
	}


	/**
	 * @return the dateFinTx
	 */
	public String getDateFinTx() {
		return dateFinTx;
	}

	/**
	 * @param dateFinTx the dateFinTx to set
	 */
	public void setDateFinTx(String dateFinTx) {
		this.dateFinTx = dateFinTx;
	}
	
	/**
	 * @return the tauxH
	 */
	public double getTauxH() {
		return tauxH;
	}


	/**
	 * @param tauxH the tauxH to set
	 */
	public void setTauxH(double tauxH) {
		this.tauxH = tauxH;
	}
	

	@Override
	public String toString() {
		return "   Taux [idTx=" + idTx + "\n,    dateDebutTx=" + dateDebutTx + "\n,    dateFinTx=" + dateFinTx + "\n,    tauxH=" + tauxH
				+ "]";
	}


	public static boolean estDanslaBaseDonneeTaux(String idTauxCherche, List<Taux> listeTx){
		boolean trouve=false;
		for (int i=0; i<listeTx.size(); i++) {
			if(listeTx.get(i).getIdTx().equals(idTauxCherche)) {
				trouve=true;
				return trouve;
			}
		}
		return trouve;
	}
	
	public void ajouterTaux(List<Taux> listeTx) {
		if(!estDanslaBaseDonneeTaux(this.idTx, listeTx)) {
			listeTx.add(this);
			JsonJava.convertirListeEnJson(listeTx);
		}else {
			JOptionPane.showMessageDialog(null, "Ce projet est déjà dans la base de donnée", "Info", JOptionPane.CLOSED_OPTION);
		}
	}
	
	
	
}

