package fr.ibformation.GestionCinema.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformation.GestionCinema.bean.Langage;
import fr.ibformation.GestionCinema.managers.LanguageManager;

@RestController
@RequestMapping("/language")
@CrossOrigin("http://localhost:4200")
public class LanguageControler {
	
	@Autowired
	private LanguageManager languageManager;
	
	@GetMapping("/list")
	public List<Langage> lister(){
		return (List<Langage>) languageManager.findAll();
	}

	@PostMapping("/ajoutFilm")
	public void ajoutFilm(@RequestBody Langage language) {
		languageManager.create(language);
	}
}