package fr.ibformation.GestionCinema.managers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.GestionCinema.bean.Acteur;
import fr.ibformation.GestionCinema.dao.ActeurDao;

@Service
public class ActeurManagerImpl implements ActeurManager {
	
	@Autowired
	private ActeurDao acteurDao;

	@Override
	public List<Acteur> findAll() {
		return acteurDao.findAll();
	}

	@Override
	public Acteur create(Acteur acteur) {
		return acteurDao.save(acteur);
	}

}
