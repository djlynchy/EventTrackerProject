package com.skilldistillery.eventtracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class PlaceholderController {

	@GetMapping("ping")
	public String ping() {
		return "pong";
		
	}
	
	
}