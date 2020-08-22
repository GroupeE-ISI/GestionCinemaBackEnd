package fr.ibformation.GestionCinema.controlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformation.GestionCinema.managers.FilmManager;

@RestController
@RequestMapping("/film")
public class FilmControler {
	
	private FilmManager filmManager;
	

}