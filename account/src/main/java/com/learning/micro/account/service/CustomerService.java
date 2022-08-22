package com.learning.micro.account.service;

import java.util.List;

import com.learning.micro.account.model.Account;
import com.learning.micro.account.model.Customer;

public interface CustomerService {
	
	Customer findCustomerById(int CustomerId);
	List<Account> findAllAccountsForCustomer(int CustomerId);

}
