package fr.ibformation.GestionCinema.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.GestionCinema.bean.Langage;
import fr.ibformation.GestionCinema.dao.LangageDao;

@Service
public class LanguageManagerImpl implements LanguageManager {

	@Autowired
	private LangageDao languageDao;
	
	@Override
	public Langage create(Langage language) {
		return languageDao.save(language);
	}

	@Override
	public Iterable<Langage> findAll() {
		return languageDao.findAll();
	}
}