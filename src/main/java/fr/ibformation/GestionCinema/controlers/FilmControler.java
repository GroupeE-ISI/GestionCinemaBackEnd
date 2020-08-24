package fr.ibformation.GestionCinema.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformation.GestionCinema.bean.Film;
import fr.ibformation.GestionCinema.managers.FilmManager;

@RestController
@RequestMapping("/film")
@CrossOrigin("http://localhost:4200")
public class FilmControler {
	
	@Autowired
	private FilmManager filmManager;
	
	@GetMapping("/lister")
	public List<Film> lister(){
		return (List<Film>) filmManager.findAll();
	}

	@PostMapping("/ajoutFilm")
	public void ajoutFilm(@RequestBody Film film) {
		filmManager.create(film);
	}
}