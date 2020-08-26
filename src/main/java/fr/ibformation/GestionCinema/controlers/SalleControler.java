package fr.ibformation.GestionCinema.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import fr.ibformation.GestionCinema.bean.Place;
import fr.ibformation.GestionCinema.bean.Salle;
import fr.ibformation.GestionCinema.managers.SalleManager;

@RestController
@RequestMapping("/salle")
@CrossOrigin("*")
public class SalleControler {
	
	@Autowired
	private SalleManager salleManager;
	
	@GetMapping("/lister")
	public List<Salle> lister(){
		return (List<Salle>) salleManager.findAll();
	}
	
	@GetMapping("/ajouter")
	public ModelAndView ajouter() {
		
		return new ModelAndView("ajouterSalle","salle", new Salle());
	}
	
	@PostMapping("/ajouter")
	public ModelAndView ajouter(@ModelAttribute("salle") Salle salle) {
		salleManager.createOrUpdate(salle);
		return ajouter();
	}

}
