package fr.ibformation.GestionCinema.managers;

import org.springframework.web.bind.annotation.CrossOrigin;

import fr.ibformation.GestionCinema.bean.Film;
@CrossOrigin("*")
public interface FilmManager {
	public Film create(Film film);
	public Iterable<Film> findAll();	
}