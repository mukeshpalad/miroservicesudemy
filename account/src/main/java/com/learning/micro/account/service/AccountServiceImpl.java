package com.learning.micro.account.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.micro.account.model.Account;
import com.learning.micro.account.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	AccountRepository accountRepository;
	
	
	@Override
	public Account findAccountById(int accountId)
	{
		Optional<Account> account = accountRepository.findById(accountId);
		return account.get();
	}


}
