package com.didiso.sysyteme;

import java.util.Arrays;

public class Admin {
	private String idAdmin;
	private String nomAdmin;
	private String nasAdmin;
	//private String [] infoConAdmin;   //username, password, statut, 
	private String nomUtilisateur;
	private String motDePasse;
	private String statut;
	private boolean estConnecte;
	private boolean estActif;
	
	/**
	 * Constructeur sans arguments
	 */
	public Admin() {
		//super();
	}


	/**
	 * @param idAdmin
	 * @param nomAdmin
	 * @param nasAdmin
	 * @param nomUtilisateur
	 * @param motDePasse
	 * @param statut
	 * @param estConnecte
	 * @param estActif
	 */
	public Admin(String idAdmin, String nomAdmin, String nasAdmin, String nomUtilisateur, String motDePasse,
			String statut) {
		super();
		this.idAdmin = idAdmin;
		this.nomAdmin = nomAdmin;
		this.nasAdmin = nasAdmin;
		this.nomUtilisateur = nomUtilisateur;
		this.motDePasse = motDePasse;
		this.statut = statut;
		this.estConnecte = false;
		this.estActif = true;
	}


	/**
	 * @return the idAdmin
	 */
	public String getIdAdmin() {
		return idAdmin;
	}


	/**
	 * @param idAdmin the idAdmin to set
	 */
	public void setIdAdmin(String idAdmin) {
		this.idAdmin = idAdmin;
	}


	/**
	 * @return the nomAdmin
	 */
	public String getNomAdmin() {
		return nomAdmin;
	}


	/**
	 * @param nomAdmin the nomAdmin to set
	 */
	public void setNomAdmin(String nomAdmin) {
		this.nomAdmin = nomAdmin;
	}


	/**
	 * @return the nasAdmin
	 */
	public String getNasAdmin() {
		return nasAdmin;
	}


	/**
	 * @param nasAdmin the nasAdmin to set
	 */
	public void setNasAdmin(String nasAdmin) {
		this.nasAdmin = nasAdmin;
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


	@Override
	public String toString() {
		return "Admin [idAdmin=" + idAdmin + ", nomAdmin=" + nomAdmin + ", nasAdmin=" + nasAdmin + ", nomUtilisateur="
				+ nomUtilisateur + ", motDePasse=" + motDePasse + ", statut=" + statut + ", estConnecte=" + estConnecte
				+ ", estActif=" + estActif + "]";
	}
	
	
	
	
}


	
