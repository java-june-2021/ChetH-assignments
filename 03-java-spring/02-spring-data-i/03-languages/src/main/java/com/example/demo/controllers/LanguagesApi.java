package com.example.demo.controllers;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Language;
import com.example.demo.services.LanguageService;
@RestController
public class LanguagesApi {
	//defining our LanguagesServices field
	private LanguageService languageService;
	
	//we can initialize our LanguageService object in the LanguagesApi constructor, using Dependency Injection
	public LanguagesApi(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@RequestMapping("/api/languages")
	public List<Language> index() {
		return languageService.allLanguages();
	}
	
	@RequestMapping(value="/api/languages", method=RequestMethod.POST)
	public Language create(@RequestParam(value="name") String name,
		@RequestParam(value="creator") String creator,
		@RequestParam(value="version") String version) {
		Language language = new Language(name, creator, version);
		return languageService.createLanguage(language);
	}
	
	@RequestMapping("/api/languages/{id}")
	public Language show(@PathVariable("id") Long id) {
		Language language = languageService.findById(id);
		return language;
	}
	
    @RequestMapping(value="/api/languages/{id}", method=RequestMethod.PUT)
    public Language update(@PathVariable("id") Long id, @RequestParam(value="name") String name,
    		@RequestParam(value="creator") String creator,
    		@RequestParam(value="version") String version) {
    	Language editLanguage = new Language(name, creator, version);
    	List<Language> languages = languageService.allLanguages();
    	languageService.updateLanguage(id, editLanguage, languages);
        return editLanguage;
    }
    
    @RequestMapping(value="/api/languages/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id, @RequestParam(value="name") String name,
    		@RequestParam(value="creator") String creator,
    		@RequestParam(value="language") String version) {
    		List<Language> languages = languageService.allLanguages();
    		Language language = new Language(name, creator, version);
        languageService.destroyLanguage(id, language, languages);
    }

}