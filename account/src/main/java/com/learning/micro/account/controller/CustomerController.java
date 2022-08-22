package com.learning.micro.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.micro.account.model.Account;
import com.learning.micro.account.model.Customer;
import com.learning.micro.account.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	
	// API to get customer by customer id;
	
	@GetMapping("{id}")
	public Customer getCustomerById(@PathVariable("id") int customerId)
	{

		Customer customer = customerService.findCustomerById(customerId);
		if (customer != null) {
			System.out.println(customer);
			return customer;
			
		} else {
			return null;
		}
	}
	
	
	// API to get all accounts for a customer
	@GetMapping("{id}/accounts")
	public List<Account> getAllAccountsForCustomer(@PathVariable("id") int customerId)
	{
		return customerService.findAllAccountsForCustomer(customerId);
	}

}
