package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HomeController {

	@RequestMapping("/")
	public String index() {
        return "index.jsp";
	}
	
	@RequestMapping(path="/submit", method=RequestMethod.POST)
    public String submit(HttpSession session,
    		@RequestParam(value="username") String username,
    		@RequestParam(value="location") String location,
    		@RequestParam(value="language") String language,
    		@RequestParam(value="comment") String comment) {
		// set session attributes to POST parameters
		session.setAttribute("username", username);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("comment", comment);
		if(language.equals("Java")) {
			return "redirect:/java";
		}
		return "redirect:/result";
	}
	
	@RequestMapping("/result")
	public String result(HttpSession session, Model model) {
		// retrieve the values in session, casting as necessary
		String username = (String) session.getAttribute("username");
		String location = (String) session.getAttribute("location");
		String language = (String) session.getAttribute("language");
		String comment = (String) session.getAttribute("comment");
		// now set model to those session attributes for page to render
		model.addAttribute("username", username);
		model.addAttribute("location", location);
		model.addAttribute("language", language);
		model.addAttribute("comment", comment);
		return "result.jsp";
	}
	
	@RequestMapping("/java")
	public String java(HttpSession session, Model model) {
		// retrieve the values in session, casting as necessary
		String username = (String) session.getAttribute("username");
		String language = (String) session.getAttribute("language");
		// now set model to those session attributes for page to render
		model.addAttribute("username", username);
		model.addAttribute("language", language);
		return "java.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}