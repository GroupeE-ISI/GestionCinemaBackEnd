package fr.ibformation.GestionCinema.bean;

import java.time.LocalDateTime;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Film {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 50)
	private String titre;
	private String description;
	
	@DateTimeFormat(iso = ISO.TIME)
	private LocalDateTime duree;
	
	@Column(length = 20)
	private String anneeSortie;
	private String photo;
	
	@OneToMany(mappedBy = "film")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Seance> seances;
	@ManyToOne
	private Categorie categorie;
	
	@ManyToMany (cascade = CascadeType.ALL)
	private List<Acteur> acteurs;
	@ManyToOne
	private Langage langage;
}