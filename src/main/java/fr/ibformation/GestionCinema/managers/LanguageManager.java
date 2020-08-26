package fr.ibformation.GestionCinema.managers;

import org.springframework.web.bind.annotation.CrossOrigin;

import fr.ibformation.GestionCinema.bean.Language;

@CrossOrigin("*")
public interface LanguageManager {
	public Language create(Language language);
	public Iterable<Language> findAll();
}