package com.demo.devops.cicddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello the world of  devops ";
	}

}
