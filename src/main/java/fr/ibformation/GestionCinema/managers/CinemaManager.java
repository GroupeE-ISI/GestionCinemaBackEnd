package fr.ibformation.GestionCinema.managers;

import java.util.List;

import fr.ibformation.GestionCinema.bean.Cinema;

public interface CinemaManager {

	public List<Cinema> findAll();

	public Cinema create(Cinema cinema);
	
}
