package com.learning.loan.repository;

import org.springframework.stereotype.Repository;

import com.learning.loan.model.Loan;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface LoanRepository extends CrudRepository<Loan, Long>{
	
	List<Loan> findByCustomerId(int customerId);

}
