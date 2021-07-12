package com.example.demo.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.models.Address;
import com.example.demo.models.Student;
import com.example.demo.services.BootcampService;

@Controller
public class HomeController {
	private final BootcampService bootcampService;
	
	public HomeController(BootcampService bootcampService) {
		this.bootcampService = bootcampService;
	}

	@RequestMapping("/")
	public String index(Model model) {
		List<Student> showStudents = bootcampService.allStudents();
		model.addAttribute("students", showStudents);
		return "/show.jsp";
	}
	
	@RequestMapping("/students/{index}")
	public String findAddressByIndex(Model model, @PathVariable("index") Long index) {
		Student showStudent = bootcampService.getOneStudent(index);
		model.addAttribute("student", showStudent);
		return "/show.jsp";
	}
	
	@RequestMapping("/students/new")
	public String newStudent(@ModelAttribute("newStudent") Student student) {
		return "/newstudent.jsp";
	}

	@RequestMapping(value="/students/new", method=RequestMethod.POST)
	public String addStudent(@Valid @ModelAttribute("newStudent") Student student, BindingResult result) {
		if (result.hasErrors()) {
			return "/newstudent.jsp";
		} else {
			bootcampService.createStudent(student);
    		return "redirect:/students/new";
		}
	}
	
	@ModelAttribute("students")
	public List<Student> getStudentList() {
		List<Student> studentList = bootcampService.allStudents();
		return studentList;
	}
	
	@RequestMapping("/contact/new")
	public String newAddress(@ModelAttribute("newAddress") Address address) {
		
		return "/newaddress.jsp";
	}

	@RequestMapping(value="/contact/new", method=RequestMethod.POST)
	public String addAddress(@Valid @ModelAttribute("newAddress") Address address, BindingResult result) {
		if (result.hasErrors()) {
			return "/newaddress.jsp";
		} else {
			bootcampService.createAddress(address);
    		return "redirect:/contact/new";
		}
	}
}