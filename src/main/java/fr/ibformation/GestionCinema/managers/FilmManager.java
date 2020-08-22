package fr.ibformation.GestionCinema.managers;

import fr.ibformation.GestionCinema.bean.Film;

public interface FilmManager {
	public Film create(Film film);
	public Iterable<Film> findAll();	
}