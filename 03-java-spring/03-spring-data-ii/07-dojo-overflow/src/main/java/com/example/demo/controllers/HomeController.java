package com.example.demo.controllers;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Answer;
import com.example.demo.models.Question;
import com.example.demo.services.ForumService;
import com.example.demo.validators.TagValidator;

@Controller
public class HomeController {
	private final ForumService forumService;
	private final TagValidator validator;
	
	public HomeController(ForumService forumService, TagValidator validator) {
		this.forumService = forumService;
		this.validator = validator;
	}

	@RequestMapping("/")
	public String index(Model viewModel) {
		viewModel.addAttribute("questions", forumService.allQuestions());
		return "questions.jsp";
	}
	
	@RequestMapping("/newQuestion")
	public String newQuestion(@ModelAttribute("newQuestion") Question question) {
		return "newquestion.jsp";
	}
	
	@PostMapping("/newQuestion")
	public String addQuestion(@Valid @ModelAttribute("newQuestion") Question question, BindingResult result) {
		validator.validate(question, result);
		if(result.hasErrors()) {
			return "newquestion.jsp";
		} 
		this.forumService.createQuestion(question);
		return "redirect:/";
	}
	
	@RequestMapping("/show/{id}")
	public String show(@PathVariable("id") Long id, Model viewModel, @ModelAttribute("answer") Answer answer) {
		viewModel.addAttribute("question", forumService.getOneQuestion(id));
		return "showanswer.jsp";
	}
	
	@RequestMapping("/addAnswer")
	public String addAnswer(@Valid @ModelAttribute("answer") Answer answer, BindingResult result, Model viewModel) {
		if(result.hasErrors()) {
			viewModel.addAttribute("question", forumService.getOneQuestion(answer.getQuest().getId()));
			return "showanswer.jsp";
		}
		forumService.createAnswer(answer);
		return "redirect:/show/" + answer.getQuest().getId();
	}
	
}