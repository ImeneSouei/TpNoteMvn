package com.infotel.TpMavenNote.metier;

public class Dev {
	
	private int IdDev;
	private String nom;
	private int experience;
	public int getIdDev() {
		return IdDev;
	}
	public void setIdDev(int idDev) {
		IdDev = idDev;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Dev [IdDev=" + IdDev + ", nom=" + nom + ", experience=" + experience + "]";
	}

}
