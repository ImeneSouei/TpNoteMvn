package com.infotel.TpMavenNote.dao;

import org.springframework.stereotype.Repository;

import com.infotel.TpMavenNote.metier.Etudiant;
import com.infotel.TpMavenNote.metier.Formation;


@Repository

public class DaoImpl implements Idao {

	@Override
	public int ajouterEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		System.out.println("L'etudiant" + e + " a eté ajoutée");
		return e.getIdEtudiant();
	}

	@Override
	public int ajouterFormation(Formation f) {
		// TODO Auto-generated method stub
		System.out.println("La formation" + f + " a eté ajoutée");
		return  f.getIdFormation();
	}

}
