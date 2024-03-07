package com.ebit.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebit.project.service.FeignService;

@RestController
public class HomeController {

	@Autowired
	private FeignService service;
	
	@GetMapping("/userA")
	public String getUserA() {
		return service.getUserA();
	}
	
	@GetMapping("/userB")
	public String getUserB() {
		return service.getUserB();
	}
	
	@GetMapping("/userC")
	public String getUserC() {
		return service.getUserC();
	}
	
}
