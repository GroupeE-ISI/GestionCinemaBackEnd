package fr.ibformation.GestionCinema.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.ibformation.GestionCinema.bean.Language;

@RepositoryRestResource
public interface LanguageDao extends JpaRepository<Language, Integer>{

}
