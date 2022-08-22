package com.learning.micro.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.learning.micro.account.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{
	

}
