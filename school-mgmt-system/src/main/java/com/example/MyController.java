package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping(value = "/welcome-message")
	public String getWelcomeMsg() {
		System.out.println("In sidegetWelcomeMsg() method.");
		System.out.println("Added second line.");
		return "Hello";
	}
}
