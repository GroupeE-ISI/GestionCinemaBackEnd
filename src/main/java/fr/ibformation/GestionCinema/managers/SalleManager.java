package fr.ibformation.GestionCinema.managers;


import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;

import fr.ibformation.GestionCinema.bean.Salle;
@CrossOrigin("*")
public interface SalleManager {
	public Salle createOrUpdate(Salle salle);
	public List<Salle> findAll();
}
