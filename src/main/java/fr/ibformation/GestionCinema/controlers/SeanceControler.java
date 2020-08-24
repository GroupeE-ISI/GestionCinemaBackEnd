package fr.ibformation.GestionCinema.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformation.GestionCinema.bean.Seance;
import fr.ibformation.GestionCinema.managers.SeanceManager;

@RestController
@RequestMapping("/seance")
public class SeanceControler {
	
	@Autowired
	private SeanceManager seanceManager;
	
	@GetMapping("/seances")
	public List<Seance> lesSeances(){
		return (List<Seance>) seanceManager.findAll();
	}
	
	@PostMapping("/ajouterSeance")
	public void ajouterSeance(@RequestBody Seance seance) {
		seanceManager.create(seance);
	}
	

}
