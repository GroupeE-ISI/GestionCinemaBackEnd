package fr.ibformation.GestionCinema.managers;

import java.util.List;

import fr.ibformation.GestionCinema.bean.Acteur;

public interface ActeurManager {

	public List<Acteur> findAll();

	public Acteur create(Acteur acteur);

}
