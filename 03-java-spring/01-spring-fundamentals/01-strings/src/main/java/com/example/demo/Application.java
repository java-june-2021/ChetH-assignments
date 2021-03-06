package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RequestMapping("/")
	public String hello() {
		return "Hello Dave, I'm afraid I can't open the pod bay doors...";
	}
	
	@RequestMapping("/random")
	public String hello2() {
		return "Just kidding!  Opening pod bay doors now.";
	}
}
