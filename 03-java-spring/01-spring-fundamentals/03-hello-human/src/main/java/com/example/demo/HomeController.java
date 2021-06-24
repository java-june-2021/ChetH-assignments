package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
	
public class HomeController {
	@RequestMapping("/")

	public String index(@RequestParam(value="name", required=false) String userName, Model model) {
		if (userName == null) {
			model.addAttribute("userName", "Human");
		}
		else {
			model.addAttribute("userName", userName);
		}
		return "index.jsp";
	}
}
	
//	public String index(Model model) {
//		model.addAttribute("dojoName", "Bellevue");
//		return "index.jsp";
