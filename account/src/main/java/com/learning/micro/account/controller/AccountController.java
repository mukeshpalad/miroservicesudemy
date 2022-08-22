package com.learning.micro.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.micro.account.model.Account;
import com.learning.micro.account.model.Customer;
import com.learning.micro.account.repository.AccountRepository;
import com.learning.micro.account.service.AccountService;

import lombok.extern.java.Log;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
	
	@Autowired
	private AccountService accountService;

	
	// API to get account detail by account id
	@GetMapping("{id}")
	public Account getAccountDetails(@PathVariable("id") int accountId) {

		Account account = accountService.findAccountById(accountId);
		if (account != null) {
			System.out.println(account);
			return account;
			
		} else {
			return null;
		}

	}
	
	
	
	

}
