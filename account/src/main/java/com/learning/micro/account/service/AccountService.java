package com.learning.micro.account.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learning.micro.account.model.Account;


public interface AccountService {
	
	Account findAccountById(int accountId);

}
