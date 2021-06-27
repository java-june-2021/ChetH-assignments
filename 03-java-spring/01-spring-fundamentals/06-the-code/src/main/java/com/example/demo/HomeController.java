package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller

public class HomeController {
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String index(@ModelAttribute("errors") String errors) {
		return "login.jsp";
	}
	
	@RequestMapping(path="/login", method=RequestMethod.POST)
    public String login(@RequestParam(value="password") String password) {
		if(!password.equals("bushido")) { // incorrect password, display error
			return "redirect:/errors";
		}
		else { // correct password entered
			return "redirect:/code";
		}
	}
	
    @RequestMapping("/errors")
    public String errors(RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("errors", "You must train harder!");
        return "redirect:/";
    }
    
    @RequestMapping(path="/code", method=RequestMethod.GET)
	public String code() {
		return "code.jsp";
	}
    
	
}
