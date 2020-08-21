package fr.ibformation.GestionCinema.managers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.GestionCinema.bean.Salle;
import fr.ibformation.GestionCinema.dao.SalleDao;

@Service
public class SalleManagerImpl implements SalleManager{

	@Autowired
	private SalleDao salleDao;
	
	@Override
	public Salle createOrUpdate(Salle salle) {

		return salleDao.save(salle);
	}

	@Override
	public List<Salle> findAll() {
		return (List<Salle>) salleDao.findAll();
	}

}
