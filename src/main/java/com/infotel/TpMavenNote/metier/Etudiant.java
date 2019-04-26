package com.infotel.TpMavenNote.metier;

import org.springframework.stereotype.Component;

@Component
public class Etudiant {
	
	private int IdEtudiant;
	private String nom;
	private String prenom;
	private Formation formation;
	public int getIdEtudiant() {
		return IdEtudiant;
	}
	@Override
	public String toString() {
		return "Etudiant [IdEtudiant=" + IdEtudiant + ", nom=" + nom + ", prenom=" + prenom + ", formation=" + formation
				+ "]";
	}
	public void setIdEtudiant(int idEtudiant) {
		IdEtudiant = idEtudiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Formation getFormation() {
		return formation;
	}
	public void setFormation(Formation formation) {
		this.formation = formation;
	}
	

}
