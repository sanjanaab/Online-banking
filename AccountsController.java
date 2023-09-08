package com.example.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bankapp.model.Accounts;
import com.example.bankapp.service.AccountsService;

@RestController
public class AccountsController {
	
	@Autowired
	AccountsService accountsService;
	
	@GetMapping("/saveAccount")
	public void saveAccount(@RequestBody Accounts a) {
		accountsService.saveAccounts(a);
	}

}
