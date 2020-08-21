package fr.ibformation.GestionCinema.controlers;

import java.io.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformation.GestionCinema.bean.Film;
import fr.ibformation.GestionCinema.bean.Reservation;
import fr.ibformation.GestionCinema.dao.FilmDao;
import fr.ibformation.GestionCinema.dao.ReservationDao;
import lombok.Data;

@RestController
@CrossOrigin("*")
public class ImagesController {
	
	@Autowired
	private FilmDao filmDao;
	@Autowired
	private ReservationDao reservationDao;
	
	@GetMapping(path="/imageFilm/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
	public byte[] image(@PathVariable(name="id")int id) throws IOException {
	
		Film fi = filmDao.findById(id).get();
		String nomPhoto = fi.getPhoto(); 
		File file = new File(System.getProperty("user.home")+"/cinema/images/"+nomPhoto);
		Path path = Paths.get(file.toURI());
		return Files.readAllBytes(path);
	}
	
	@PostMapping("/payerReservations")
	public List<Reservation> PayerReservations(@RequestBody ReservationForm reservationForm){
		
		List<Reservation> listeReservations = new ArrayList<>();
		reservationForm.getReservations().forEach(idReservation ->{
			
			Reservation reservation = reservationDao.findById(idReservation).get();
			reservation.setNomClient(reservationForm.getNomClient());
			reservation.setPlaceReservee(true);
			reservation.setCodeAchat(reservationForm.getCodeAchat());
			
			reservationDao.save(reservation);
			
			listeReservations.add(reservation); // cumuler les reservations	
		});
		return listeReservations;
	}
	
}
@Data
class  ReservationForm{
	private String nomClient;
	private int codeAchat;
	private List<Integer> reservations = new ArrayList<>();
}

