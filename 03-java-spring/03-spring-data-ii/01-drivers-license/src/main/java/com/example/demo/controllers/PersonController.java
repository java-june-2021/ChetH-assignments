package com.example.demo.controllers;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.models.Person;
import com.example.demo.services.PersonService;
import com.example.demo.models.License;
import com.example.demo.services.LicenseService;

@Controller
public class PersonController {
	private final PersonService personService;
	private final LicenseService licenseService;
	
	public PersonController(PersonService personService, LicenseService licenseService) {
		this.personService = personService;
		this.licenseService = licenseService;
	}
	
	@RequestMapping("/")
	public String index() {
//		model.addAttribute("newPerson", new Person());
		return "redirect:/persons/new";
//		return "/index.jsp";
	}
	
	@RequestMapping("/persons/{index}")
	public String findPersonByIndex(Model model, @PathVariable("index") Long index) {
		Person person = personService.findById(index);
		model.addAttribute("person", person);
		return "/show.jsp";
	}
	
	@RequestMapping("/persons/new")
	public String newPerson(@ModelAttribute("newPerson") Person person) {
		return "/newperson.jsp";
	}

	@RequestMapping(value="/persons/new", method=RequestMethod.POST)
	public String addPerson(@Valid @ModelAttribute("newPerson") Person person, BindingResult result) {
		if (result.hasErrors()) {
			return "/newperson.jsp";
		} else {
			personService.createPerson(person);
    		return "redirect:/licenses/new";
		}
	}
}