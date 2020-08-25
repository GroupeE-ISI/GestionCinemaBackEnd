package fr.ibformation.GestionCinema.managers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.GestionCinema.bean.Reservation;
import fr.ibformation.GestionCinema.dao.ReservationDao;

@Service
public class resrvationManagerImpl implements ReservationManager {

	@Autowired
	private ReservationDao reservationDao;

	@Override
	public List<Reservation> findAll() {
		return reservationDao.findAll();
	}

	@Override
	public Reservation create(Reservation reservation) {
		return reservationDao.save(reservation);
	}
	
}
