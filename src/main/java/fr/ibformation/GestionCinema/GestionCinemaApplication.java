package fr.ibformation.GestionCinema;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import fr.ibformation.GestionCinema.bean.Film;
import fr.ibformation.GestionCinema.bean.Reservation;


@SpringBootApplication
public class GestionCinemaApplication implements CommandLineRunner{
	// pour afficher des id cachés!,
	@Autowired
	private RepositoryRestConfiguration restConfiguration; 

	public static void main(String[] args) {
		SpringApplication.run(GestionCinemaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// pour afficher des id cachés
		restConfiguration.exposeIdsFor(Film.class, Reservation.class); 
		
	}

}
