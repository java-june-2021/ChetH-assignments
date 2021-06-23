package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="dojo")
//@RequestMapping(value="/dojo/{location}")

public class DojoController {
//	public String location(@PathVariable("location") String dojolocation) {
//	    if(dojolocation.equals("")) {
//	    	return "The dojo is awesome!";
//	    }
//	    if(dojolocation.equals("burbank")) {
//	    	return "Burbank Dojo is in Southern California";
//	    }
//	    if(dojolocation.equals("san-jose")) {
//	    	return "SJ dojo is the headquarters";
//	    }
//	    return "";
//	}
	@RequestMapping(value="burbank", method=RequestMethod.GET)
	public String location() {
		return "This sucks";
	}
	
}
