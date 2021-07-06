package com.example.demo.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.Language;
import com.example.demo.repositories.LanguageRepository;

@Service
public class LanguageService {
	// initialize the languages variable with values
//	private List<Language> languages = new ArrayList<Language>();

	// adding the language repository as a dependency
	private LanguageRepository languageRepository;

	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	// returns all the languages
	public List<Language> allLanguages() {
		return languageRepository.findAll();
	}
	
	// creates a language
	public Language createLanguage(Language b) {
		return languageRepository.save(b);
	}
	
	// retrieves a language
	public Language findById(Long id) {
		Optional<Language> optionalLanguage = languageRepository.findById(id);
		if(optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		} else {
			return null;
		}
	}
	
	// edits a language
    public void updateLanguage(Long id, Language language, List<Language> languages) {
    	if (id <= languages.size()){
            languageRepository.save(language);
        }
    }
    
    // deletes a language
    public void destroyLanguage(Long id, Language language, List<Language> languages) {
        if (id <= languages.size()){
        	languageRepository.deleteById(id);
        }
    }
}