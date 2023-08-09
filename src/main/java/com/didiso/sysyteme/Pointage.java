package com.didiso.sysyteme;

import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import Generique.JsonJava;

public class Pointage {
	private String idPoint;
	private Date datePointage;
	private int nbH;
	private Projet projet;
	private Discipline discipline;
	private double nbTotal;
	/**
	 * @param datePointage
	 * @param nbTotal
	 */
	public Pointage(String idPoint, Date datePointage, double nbTotal) {
		super();
		this.idPoint = idPoint;
		this.datePointage = datePointage;
		this.nbTotal = nbTotal;
	}
	/**
	 * 
	 */
	public Pointage() {
		super();
	}
	/**
	 * @return the datePointage
	 */
	public Date getDatePointage() {
		return datePointage;
	}
	/**
	 * @param datePointage the datePointage to set
	 */
	public void setDatePointage(Date datePointage) {
		this.datePointage = datePointage;
	}
	/**
	 * @return the nbH
	 */
	public int getNbH() {
		return nbH;
	}
	/**
	 * @param nbH the nbH to set
	 */
	public void setNbH(int nbH) {
		this.nbH = nbH;
	}
	/**
	 * @return the projet
	 */
	public Projet getProjet() {
		return projet;
	}
	/**
	 * @param projet the projet to set
	 */
	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	/**
	 * @return the discipline
	 */
	public Discipline getDiscipline() {
		return discipline;
	}
	/**
	 * @param discipline the discipline to set
	 */
	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}
	/**
	 * @return the nbTotal
	 */
	public double getNbTotal() {
		return nbTotal;
	}
	/**
	 * @param nbTotal the nbTotal to set
	 */
	public void setNbTotal(double nbTotal) {
		this.nbTotal = nbTotal;
	}
	/**
	 * @return the idPoint
	 */
	public String getIdPoint() {
		return idPoint;
	}
	/**
	 * @param idPoint the idPoint to set
	 */
	public void setIdPoint(String idPoint) {
		this.idPoint = idPoint;
	}
	
	
	public static boolean estDanslaBaseDonneePoint(String idPointCherche, List<Pointage> listePoint){
		boolean trouve=false;
		for (int i=0; i<listePoint.size(); i++) {
			if(listePoint.get(i).getIdPoint().equals(idPointCherche)) {
				trouve=true;
				return trouve;
			}
		}
		return trouve;
	}
	
	
	public void ajouterPoint(List<Pointage> listePoint) {
		if(!estDanslaBaseDonneePoint(this.idPoint, listePoint)) {
			listePoint.add(this);
			JsonJava.convertirListeEnJson(listePoint);
		}else {
			JOptionPane.showMessageDialog(null, "Ce projet est deja dans la base de donnee", "Info", JOptionPane.CLOSED_OPTION);
		}
	}
	@Override
	public String toString() {
		return "Pointage [idPoint=" + idPoint + ", datePointage=" + datePointage + ", nbH=" + nbH + ", projet=" + projet
				+ ", discipline=" + discipline + ", nbTotal=" + nbTotal + "]";
	}
	
		
}
