package com.learning.micro.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.micro.account.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
