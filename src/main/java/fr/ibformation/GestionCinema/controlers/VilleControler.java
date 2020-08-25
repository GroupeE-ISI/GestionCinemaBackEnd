package fr.ibformation.GestionCinema.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformation.GestionCinema.bean.Ville;
import fr.ibformation.GestionCinema.managers.VilleManager;

@RestController
@RequestMapping("/ville")
@CrossOrigin("*")
public class VilleControler {
	
	@Autowired
	private VilleManager villeManager;
	
	@GetMapping("/lister")
	public List<Ville> lister(){
		return (List<Ville>) villeManager.findAll();
	}
	
//	@PostMapping("/ajouterVille")
//	public void ajouterVille(@RequestBody Ville ville) {
//		villeManager.create(ville);
//	}

}
