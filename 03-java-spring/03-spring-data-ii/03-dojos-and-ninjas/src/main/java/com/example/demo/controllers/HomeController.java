package com.example.demo.controllers;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.models.Dojo;
import com.example.demo.models.Ninja;
import com.example.demo.services.BootcampService;

@Controller
public class HomeController {
	private final BootcampService bootcampService;
	
	public HomeController(BootcampService bootcampService) {
		this.bootcampService = bootcampService;
	}

	@RequestMapping("/")
	public String index() {
		return "redirect:/dojos/new";
	}
	
	@RequestMapping("/dojos/{index}")
	public String findNinjaByIndex(Model model, @PathVariable("index") Long index) {
		Dojo showDojo = bootcampService.getOneDojo(index);
		model.addAttribute("dojo", showDojo);
		return "/show.jsp";
	}
	
	@RequestMapping("/dojos/new")
	public String newDojo(@ModelAttribute("newDojo") Dojo dojo) {
		
		return "/newdojo.jsp";
	}

	@RequestMapping(value="/dojos/new", method=RequestMethod.POST)
	public String addDojo(@Valid @ModelAttribute("newDojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "/newdojo.jsp";
		} else {
			bootcampService.createDojo(dojo);
    		return "redirect:/";
		}
	}
	
	@ModelAttribute("dojoList")
	public List<Dojo> getDojoList() {
		List<Dojo> dojoList = bootcampService.allDojos();
		return dojoList;
	}
	
	@RequestMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("newNinja") Ninja ninja) {
		
		return "/newninja.jsp";
	}

	@RequestMapping(value="/ninjas/new", method=RequestMethod.POST)
	public String addNinja(@Valid @ModelAttribute("newNinja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "/newninja.jsp";
		} else {
			bootcampService.createNinja(ninja);
    		return "redirect:/";
		}
	}
}