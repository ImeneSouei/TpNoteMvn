package com.infotel.TpMavenNote.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.TpMavenNote.dao.Idao;
import com.infotel.TpMavenNote.metier.Etudiant;
import com.infotel.TpMavenNote.metier.Formation;

@Service
public class ServiceImpl implements Idao {
	
     @Autowired
	private Idao dao;

	@Override
	public int ajouterEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		return dao.ajouterEtudiant(e) ;
	}

	@Override
	public int ajouterFormation(Formation f) {
		// TODO Auto-generated method stub
		return dao.ajouterFormation(f);
	}

}
