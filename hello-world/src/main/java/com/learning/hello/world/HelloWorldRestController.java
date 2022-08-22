package com.learning.hello.world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {
	
	
	@GetMapping(value="/hello")
	public String saysHello()
	{
		return "Hello, welcome to spring boot";
	}

}
