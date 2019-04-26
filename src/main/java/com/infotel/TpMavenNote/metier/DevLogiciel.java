package com.infotel.TpMavenNote.metier;

public class DevLogiciel {
	
	private Dev developpeur;
	private Dev chefdeveloppeur;
	public Dev getDeveloppeur() {
		return developpeur;
	}
	public void setDeveloppeur(Dev developpeur) {
		this.developpeur = developpeur;
	}
	public Dev getChefdeveloppeur() {
		return chefdeveloppeur;
	}
	public void setChefdeveloppeur(Dev chefdeveloppeur) {
		this.chefdeveloppeur = chefdeveloppeur;
	}
	@Override
	public String toString() {
		return "DevLogiciel [developpeur=" + developpeur + ", chefdeveloppeur=" + chefdeveloppeur + "]";
	}

}
