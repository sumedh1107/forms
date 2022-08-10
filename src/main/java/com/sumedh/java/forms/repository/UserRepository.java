package com.sumedh.java.forms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumedh.java.forms.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
