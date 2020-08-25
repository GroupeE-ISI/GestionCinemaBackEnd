package fr.ibformation.GestionCinema.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.GestionCinema.bean.Categorie;
import fr.ibformation.GestionCinema.dao.CategorieDao;

@Service
public class CategoryManagerImpl implements CategoryManager {

	@Autowired
	private CategorieDao categoryDAO;
	
	@Override
	public Categorie create(Categorie category) {
		return categoryDAO.save(category);
	}

	@Override
	public Iterable<Categorie> findAll() {
		return categoryDAO.findAll();
	}
}