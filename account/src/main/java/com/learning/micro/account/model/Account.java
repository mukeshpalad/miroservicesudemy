package com.learning.micro.account.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class Account implements Serializable{

	
	@Column(name="account_number")
	@Id
	private long accountNumber;
	@Column(name="account_type")
	
	private String accountType;
	
	@Column(name = "branch_address")
	private String branchAddress;
	
	private int customer_id;
	/*
	 * @ManyToOne(cascade=CascadeType.ALL)
	 * 
	 * @JoinColumn(name="customer_id", referencedColumnName = "customer_id") private
	 * Customer customer;
	 */
	 
	
}
