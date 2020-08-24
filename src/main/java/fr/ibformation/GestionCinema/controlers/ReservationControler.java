package fr.ibformation.GestionCinema.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformation.GestionCinema.bean.Reservation;
import fr.ibformation.GestionCinema.managers.ReservationManager;

@RestController
@RequestMapping("/reservation")
public class ReservationControler {
	
	@Autowired
	private ReservationManager reservationManager;
	
	@GetMapping("/lister")
	public List<Reservation> lister(){
		return (List<Reservation>) reservationManager.findAll();
	}
	
	@PostMapping("/ajouterReservation")
	public void ajouterReservation(@RequestBody Reservation reservation) {
		reservationManager.create(reservation);
	}

}
