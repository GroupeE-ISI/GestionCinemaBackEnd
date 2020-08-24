package fr.ibformation.GestionCinema.managers;

import java.util.List;

import fr.ibformation.GestionCinema.bean.Seance;

public interface SeanceManager {

	public List<Seance> findAll();

	public Seance create(Seance seance);

}
