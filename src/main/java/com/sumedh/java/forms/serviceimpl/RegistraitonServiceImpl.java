package com.sumedh.java.forms.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumedh.java.forms.model.Registration;
import com.sumedh.java.forms.repository.RegistraitonRepository;

@Service
public class RegistraitonServiceImpl {

	@Autowired
	private RegistraitonRepository registraitonRepository;

	//register user
	public Registration registerUser(Registration registration) {
		return registraitonRepository.save(registration);
	}
	
	
}
