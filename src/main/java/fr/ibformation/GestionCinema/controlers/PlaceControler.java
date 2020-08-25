package fr.ibformation.GestionCinema.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformation.GestionCinema.bean.Place;
import fr.ibformation.GestionCinema.managers.PlaceManager;

@RestController
@RequestMapping("/place")
public class PlaceControler {

	@Autowired
	private PlaceManager placeManager;
	
	@GetMapping("/lister")
	public List<Place> lister(){
		return (List<Place>) placeManager.findAll();
	}
	
	@PostMapping("/ajouterPlace")
	public void ajouterPlace(@RequestBody Place place) {
		placeManager.create(place);
	}
	
}
