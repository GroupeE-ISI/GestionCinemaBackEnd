package fr.ibformation.GestionCinema.managers;

import java.util.List;

import fr.ibformation.GestionCinema.bean.Ville;

public interface VilleManager {

	public List<Ville> findAll();

	public Ville create(Ville ville);
	

}
