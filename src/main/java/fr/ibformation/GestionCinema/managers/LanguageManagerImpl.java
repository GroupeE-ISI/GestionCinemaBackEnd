package fr.ibformation.GestionCinema.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.GestionCinema.bean.Language;
import fr.ibformation.GestionCinema.dao.LanguageDao;

@Service
public class LanguageManagerImpl implements LanguageManager {

	@Autowired
	private LanguageDao languageDao;
	
	@Override
	public Language create(Language language) {
		return languageDao.save(language);
	}

	@Override
	public Iterable<Language> findAll() {
		return languageDao.findAll();
	}
}