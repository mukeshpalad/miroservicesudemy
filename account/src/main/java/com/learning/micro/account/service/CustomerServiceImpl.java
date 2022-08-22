package com.learning.micro.account.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.micro.account.model.Account;
import com.learning.micro.account.model.Customer;
import com.learning.micro.account.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;
	
	
	@Override
	public Customer findCustomerById(int customerId) {
		Optional<Customer> customer = customerRepository.findById(customerId);
		return customer.get();
	}


	@Override
	public List<Account> findAllAccountsForCustomer(int customerId) {
		
		List<Account> accounts;
		
		Optional<Customer> customer = customerRepository.findById(customerId);
		if(customer.isPresent())
		{
			accounts =  customer.get().getAccounts();
		}else 
		{
			accounts= null;
		}
		return accounts;
	}

}
