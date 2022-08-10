package com.sumedh.java.forms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumedh.java.forms.model.User;
import com.sumedh.java.forms.serviceimpl.UserServiceImpl;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	@Autowired
	UserServiceImpl registrationService;
	

	@PostMapping("/createuser")
	public User createUser(@RequestBody User user) {
		return registrationService.createUser(user);
	}
 
}
