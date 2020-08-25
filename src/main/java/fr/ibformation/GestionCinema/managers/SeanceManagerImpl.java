package fr.ibformation.GestionCinema.managers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.GestionCinema.bean.Seance;
import fr.ibformation.GestionCinema.dao.SeanceDao;

@Service
public class SeanceManagerImpl implements SeanceManager {

	@Autowired
	private SeanceDao seanceDao;
	
	@Override
	public List<Seance> findAll() {
		return seanceDao.findAll();
	}

	@Override
	public Seance create(Seance seance) {
		return seanceDao.save(seance);
	}
}
