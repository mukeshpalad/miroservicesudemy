package com.learning.card.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.learning.card.model.Card;
import com.learning.card.model.Customer;
import com.learning.card.repository.CardRepository;

@RestController

public class CardController {
	
	@Autowired
	CardRepository cardRepository;
	
	@GetMapping("/myCards")
	public List<Card> getCards(@RequestBody Customer customer)
	{
		List<Card> cards = cardRepository.findByCustomerId(customer.getCustomerId());
		if (cards != null) {
			return cards;
		} else {
			return null;
		}
	}

}
