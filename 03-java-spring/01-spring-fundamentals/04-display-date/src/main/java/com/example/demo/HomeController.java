package com.example.demo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
	
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/date", method=RequestMethod.GET)
	public String date(Model model) {
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("cccc', the 'dd' of 'MMMM', 'yyyy");
		String currentDate = date.format(formatter);
		model.addAttribute("currentDate", currentDate);
		return "date.jsp";
	}
	
	@RequestMapping(value="/time", method=RequestMethod.GET)
	public String time(Model model) {
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a");
		String currentTime = date.format(formatter);
		model.addAttribute("currentTime", currentTime);
		return "time.jsp";
	}
}