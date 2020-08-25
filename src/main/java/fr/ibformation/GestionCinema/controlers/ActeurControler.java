package fr.ibformation.GestionCinema.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformation.GestionCinema.bean.Acteur;
import fr.ibformation.GestionCinema.managers.ActeurManager;

@RestController
@RequestMapping("/acteur")
@CrossOrigin("*")
public class ActeurControler {
	
	@Autowired
	private ActeurManager acteurManager;

	@GetMapping("/lister")
	public List<Acteur> lister(){
		return (List<Acteur>) acteurManager.findAll();
	}

	@PostMapping("/ajoutActeur")
	public void ajouterActeur(@RequestBody Acteur acteur) {
		acteurManager.create(acteur);
	}
}
