package fr.ibformation.GestionCinema.managers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.GestionCinema.bean.Ville;
import fr.ibformation.GestionCinema.dao.VilleDao;

@Service
public class VilleManagerImpl implements VilleManager {

	@Autowired
	private VilleDao villeDao;

	@Override
	public List<Ville> findAll() {
		return villeDao.findAll();
	}

	@Override
	public Ville create(Ville ville) {
		return villeDao.save(ville);
	}
}
