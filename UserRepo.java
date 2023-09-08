package com.example.bankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bankapp.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	
}