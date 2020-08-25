package fr.ibformation.GestionCinema.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformation.GestionCinema.bean.Language;
import fr.ibformation.GestionCinema.managers.LanguageManager;

@RestController
@RequestMapping("/language")
@CrossOrigin("http://localhost:4200")
public class LanguageControler {
	
	@Autowired
	private LanguageManager languageManager;
	
	@GetMapping("/list")
	public List<Language> lister(){
		return (List<Language>) languageManager.findAll();
	}

	@PostMapping("/addmovie")
	public void ajoutFilm(@RequestBody Language language) {
		languageManager.create(language);
	}
}