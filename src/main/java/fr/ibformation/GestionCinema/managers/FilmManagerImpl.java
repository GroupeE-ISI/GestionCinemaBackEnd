package fr.ibformation.GestionCinema.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.GestionCinema.bean.Film;
import fr.ibformation.GestionCinema.dao.FilmDao;

@Service
public class FilmManagerImpl implements FilmManager {
	
	@Autowired
	private FilmDao filmDAO;	
	
	@Override
	public Film create(Film film) {
		return filmDAO.save(film);
	}

	@Override
	public Iterable<Film> findAll() {
		return filmDAO.findAll();
	}
}