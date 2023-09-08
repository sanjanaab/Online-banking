package com.example.bankapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bankapp.model.User;
import com.example.bankapp.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo userRepo;
	
	public User saveUser(User u) {
		User obj = userRepo.save(u);
		return obj;
	}
	
}
