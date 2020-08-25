package fr.ibformation.GestionCinema.managers;

import java.util.List;

import fr.ibformation.GestionCinema.bean.Place;

public interface PlaceManager {

	public List<Place> findAll();

	public Place create(Place place);

}
