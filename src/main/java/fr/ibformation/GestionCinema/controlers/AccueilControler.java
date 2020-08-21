package fr.ibformation.GestionCinema.controlers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@CrossOrigin("http://localhost:4200")
public class AccueilControler {
	
	@GetMapping("/accueil")
	public ModelAndView accueil() {
		return new ModelAndView();
	}
	

}
