package fr.ibformation.GestionCinema.managers;

import java.util.List;

import fr.ibformation.GestionCinema.bean.Reservation;

public interface ReservationManager {

	public List<Reservation> findAll();

	public Reservation create(Reservation reservation);

}
