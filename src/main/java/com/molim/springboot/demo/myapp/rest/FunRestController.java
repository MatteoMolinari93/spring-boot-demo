package com.molim.springboot.demo.myapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@Value("${custom.name}")
	private String customName;

	@GetMapping("/")
	public String helloWorld() {
		return "Hello World! Time on Server is: " + LocalDateTime.now();
	}
	
	@GetMapping("/test-dev-tools")
	public String testDevTools() {
		return "Test dev tools. Time on Server is: " + LocalDateTime.now();
	}
	
	@GetMapping("/test-custom-property")
	public String tesCustomProperty() {
		return customName;
	}
	
}
