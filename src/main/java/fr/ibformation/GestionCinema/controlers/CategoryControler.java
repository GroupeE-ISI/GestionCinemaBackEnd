package fr.ibformation.GestionCinema.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformation.GestionCinema.bean.Categorie;
import fr.ibformation.GestionCinema.managers.CategoryManager;

@RestController
@RequestMapping("/category")
@CrossOrigin("http://localhost:4200")
public class CategoryControler {
	
	@Autowired
	private CategoryManager categoryManager ;

	@GetMapping("/list")
	public List<Categorie> lister(){
		return (List<Categorie>) categoryManager.findAll();
	}

	@PostMapping("/addCategory")
	public void ajoutFilm(@RequestBody Categorie Category) {
		categoryManager.create(Category);
	}
}