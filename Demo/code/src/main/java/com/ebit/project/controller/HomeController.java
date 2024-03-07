package com.ebit.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/a")
	public String display(){
		return "Hello";
	}
	
	@GetMapping("/b")
	public String getMessage() {
		return "How are you?";
	}
	
	@GetMapping("/c")
	public String getData() {
		return "Thank You!";
	}
}
