package com.example.demo.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.models.Language;
import com.example.demo.services.LanguageService;

@Controller
public class LanguagesController {
	private final LanguageService languageService;
	
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Language> languages = languageService.allLanguages();
		model.addAttribute("languages", languages);
		model.addAttribute("newLanguage", new Language());
		return "/languages/index.jsp";
//		return "redirect:/languages/new";
	}
	
	@RequestMapping("/languages/{index}")
	public String findLanguageByIndex(Model model, @PathVariable("index") Long index) {
		Language language = languageService.findById(index);
		model.addAttribute("language", language);
//		model.addAttribute("newLanguage", new Language());
		return "/languages/show.jsp";
	}
	
	@RequestMapping("/languages/new")
	public String newLanguage(@ModelAttribute("language") Language language) {
		return "/languages/index.jsp";
	}

	@RequestMapping(value="/languages/new", method=RequestMethod.POST)
	public String addLanguage(@Valid @ModelAttribute("newLanguage") Language language, BindingResult result) {
		if (result.hasErrors()) {
			return "/languages/index.jsp";
		} else {
			languageService.createLanguage(language);
    		return "redirect:/";
		}
	}
	
    @RequestMapping("/languages/edit/{id}")
    public String editLanguage(@PathVariable("id") Long id, Model model) {
        Language language = languageService.findById(id);
        if (language != null){
            model.addAttribute("language", language);
            return "/languages/edit.jsp";
        }else{
    		return "redirect:/";
        }
    }
    
    @PostMapping("/languages/edit/{id}")
    public String updateLanguage(@PathVariable("id") Long id, @Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "/languages/edit.jsp";
        }else{
            List<Language> languages = languageService.allLanguages();
            languageService.updateLanguage(id, language, languages);
    		return "redirect:/";
        }
    }

    @RequestMapping(value="/languages/delete/{id}")
    public String destroyLanguage(@PathVariable("id") Long id, @ModelAttribute("language") Language language) {
        List<Language> languages = languageService.allLanguages();
    	languageService.destroyLanguage(id, language, languages);
		return "redirect:/";
    }
}