package com.example.bankapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bankapp.model.Accounts;
import com.example.bankapp.repository.AccountsRepo;

@Service
public class AccountsService {
	
	@Autowired
	AccountsRepo accountsRepo;
	
	public Accounts saveAccounts(Accounts a)
	{
		return accountsRepo.save(a);
	}

}
