package com.sumedh.java.forms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumedh.java.forms.model.Registration;
import com.sumedh.java.forms.serviceimpl.RegistraitonServiceImpl;

@RestController
@RequestMapping("/api/v1/register")
public class RegistrationController {

	@Autowired
	RegistraitonServiceImpl registrationService;
	
	@GetMapping(value ="/hello")
	public String hello() {
		return "hello";
	}
	
	@PostMapping("/createuser")
	public Registration createUser(@RequestBody Registration registration) {
		return registrationService.registerUser(registration);
	}
 
}
