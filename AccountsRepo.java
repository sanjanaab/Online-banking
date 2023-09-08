package com.example.bankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bankapp.model.Accounts;

@Repository
public interface AccountsRepo extends JpaRepository<Accounts, Integer> {
	

}
