package fr.ibformation.GestionCinema.managers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.GestionCinema.bean.Place;
import fr.ibformation.GestionCinema.dao.PlaceDao;

@Service
public class PlaceManagerImpl implements PlaceManager {

	@Autowired
	private PlaceDao placeDao;

	@Override
	public List<Place> findAll() {
		return placeDao.findAll();
	}

	@Override
	public Place create(Place place) {
		return placeDao.save(place);
	}
}
