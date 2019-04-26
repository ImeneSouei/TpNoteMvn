package com.infotel.TpMavenNote.metier;

import java.util.List;

import org.springframework.stereotype.Component;

import com.infotel.TpMavenNote.metier.Etudiant;
@Component

public class Formation {
	
	@Override
	public String toString() {
		return "Formation [IdFormation=" + IdFormation + ", nomFormation=" + nomFormation + ", etudiants=" + etudiants
				+ "]";
	}
	public int getIdFormation() {
		return IdFormation;
	}
	public void setIdFormation(int idFormation) {
		IdFormation = idFormation;
	}
	public String getNomFormation() {
		return nomFormation;
	}
	public void setNomFormation(String nomFormation) {
		this.nomFormation = nomFormation;
	}
	public List<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	private int IdFormation;
	private String nomFormation;
	private List<Etudiant> etudiants ;

}
