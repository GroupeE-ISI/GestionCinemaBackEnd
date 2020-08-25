package fr.ibformation.GestionCinema.managers;

import org.springframework.web.bind.annotation.CrossOrigin;

import fr.ibformation.GestionCinema.bean.Langage;

@CrossOrigin("*")
public interface LanguageManager {
	public Langage create(Langage language);
	public Iterable<Langage> findAll();
}