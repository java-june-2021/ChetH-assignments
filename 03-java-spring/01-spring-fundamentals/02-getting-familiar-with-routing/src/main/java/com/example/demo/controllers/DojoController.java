package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DojoController {
	@RequestMapping(value="/dojo")
	public String dojo() {
		return "The dojo is awesome!";
	}
	
	@RequestMapping(value="/dojo/{loc}")
	public String location(@PathVariable("loc") String dojolocation) {
	    if(dojolocation.equals("burbank")) {
	    	return "Burbank Dojo is in Southern California";
	    }
	    else if(dojolocation.equals("san-jose")) {
	    	return "SJ dojo is the headquarters";
	    }
	    else { return "Look for future expansion of dojo";}
	}
}
