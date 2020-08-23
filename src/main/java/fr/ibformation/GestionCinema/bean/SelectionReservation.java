package fr.ibformation.GestionCinema.bean;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p2", types = {fr.ibformation.GestionCinema.bean.Reservation.class})
public interface SelectionReservation {
	
	public int getId();
	public String getNomClient();
	public int GetcodeAchat();
	public double getPrix();
	public boolean getPlaceReservee();
	public Place getPlace();

}
