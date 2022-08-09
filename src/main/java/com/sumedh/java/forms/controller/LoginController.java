package com.sumedh.java.forms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/login")
public class LoginController {

	// login
	@GetMapping(value = "/getLoginDetails")
	public String login() {
		return "Hello controller";
	}
	
	
}
