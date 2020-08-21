package fr.ibformation.GestionCinema.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.rest.core.config.Projection;



@Projection(name = "p1",types = {fr.ibformation.GestionCinema.bean.Seance.class})
public interface Selection {
	public int getId();
	public LocalDateTime getHoraire();
	public LocalDate getDateSeance();
	public Film getFilm();
	public Salle getSalle();
	//public double getPrix();
	public List<Reservation> getReservations();
	

}
