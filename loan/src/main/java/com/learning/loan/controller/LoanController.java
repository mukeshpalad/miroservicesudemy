package com.learning.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.loan.model.Customer;
import com.learning.loan.model.Loan;
import com.learning.loan.repository.LoanRepository;

@RestController
public class LoanController {
	
	@Autowired
	LoanRepository loanRepository;
	@GetMapping("/myLoans")
	public List<Loan> getLoans(@RequestBody Customer customer)
	{
		List<Loan> loans = loanRepository.findByCustomerId(customer.getCustomerId());
		
		if (loans != null) {
			return loans;
		} else {
			return null;
		}
		
	}

}
