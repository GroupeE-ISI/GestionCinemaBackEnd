package fr.ibformation.GestionCinema.managers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.GestionCinema.bean.Cinema;
import fr.ibformation.GestionCinema.dao.CinemaDao;

@Service
public class CinemaManagerImpl implements CinemaManager {
	
	@Autowired
	private CinemaDao cinemaDao;

	@Override
	public List<Cinema> findAll() {
		return cinemaDao.findAll();
	}

	@Override
	public Cinema create(Cinema cinema) {
		return cinemaDao.save(cinema);
		
	}

}
