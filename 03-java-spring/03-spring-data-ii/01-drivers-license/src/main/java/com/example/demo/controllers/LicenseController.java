package com.example.demo.controllers;
import java.util.List;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.models.License;
import com.example.demo.models.Person;
import com.example.demo.services.LicenseService;
import com.example.demo.services.PersonService;

@Controller
public class LicenseController {
	private final LicenseService licenseService;
	private final PersonService personService;
	
	public LicenseController(LicenseService licenseService, PersonService personService) {
		this.licenseService = licenseService;
		this.personService = personService;
	}
	
	@RequestMapping("/licenses/new")
	public String newLicense(@ModelAttribute("newLicense") License license) {
		
		return "/newlicense.jsp";
	}

	@RequestMapping(value="/licenses/new", method=RequestMethod.POST)
	public String addLicense(@Valid @ModelAttribute("newLicense") License license, BindingResult result) {
		System.out.println("person: " + license.getPerson());
		System.out.println("state: " + license.getState());
		if (result.hasErrors()) {
			System.out.println("has errors, not creating license");
			return "/newlicense.jsp";
		} else {
			System.out.println("no errors, creating license");
			licenseService.createLicense(license);
    		return "redirect:/";
		}
	}
	
	@ModelAttribute("personList")
	public List<Person> getPersonList() {
		List<Person> personList = personService.allPersons();
		return personList;
	}
}