package com.molim.springboot.demo.myapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@GetMapping("/")
	public String helloWorld() {
		return "Hello World! Time on Server is: " + LocalDateTime.now();
	}
	
}
