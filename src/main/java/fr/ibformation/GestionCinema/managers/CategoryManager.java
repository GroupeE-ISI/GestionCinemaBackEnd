package fr.ibformation.GestionCinema.managers;

import org.springframework.web.bind.annotation.CrossOrigin;

import fr.ibformation.GestionCinema.bean.Categorie;

@CrossOrigin("*")
public interface CategoryManager {
	public Categorie create(Categorie category);
	public Iterable<Categorie> findAll();
}