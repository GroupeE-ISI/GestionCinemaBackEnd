package fr.ibformation.GestionCinema.bean;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100)
	private String nomClient;
	private LocalDateTime dateReservation;
	private int codeAchat;
	private double prix;
	private boolean placeReservee;
	@ManyToOne// One to many ? Une réservation peut prendre plusieurs places
	private Place place;
	@ManyToOne
	//@JsonProperty(access = Access.WRITE_ONLY)
	private Seance seance;
}
