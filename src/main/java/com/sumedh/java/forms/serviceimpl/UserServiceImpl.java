package com.sumedh.java.forms.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumedh.java.forms.model.User;
import com.sumedh.java.forms.repository.UserRepository;

@Service
public class UserServiceImpl {

	@Autowired
	private UserRepository userRepository;

	//create user
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	
}
