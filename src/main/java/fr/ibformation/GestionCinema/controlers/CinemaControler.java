package fr.ibformation.GestionCinema.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformation.GestionCinema.bean.Cinema;
import fr.ibformation.GestionCinema.managers.CinemaManager;

@RestController
@RequestMapping("/cinema")
@CrossOrigin("*")
public class CinemaControler {
	
	@Autowired
	private CinemaManager cinemaManager;
	
	@GetMapping("/lister")
	public List<Cinema> lister(){
		return (List<Cinema>) cinemaManager.findAll();
	}
	
	@PostMapping("/ajouterCinema")
	public void ajouterCinema(@RequestBody Cinema cinema) {
		cinemaManager.create(cinema);
	}

}
