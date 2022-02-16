package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String getHello () {
		return "Hello World!!!";
	}
	
	@GetMapping("/bsm")
	public String getBsm () {
		return "Muita persistência, atenção aos detalhes e mentalidade de crescimento!";
	}
	
	@GetMapping("/obj")
	public String getObj () {
		return "Rever POO e treinar muito Spring!";
	}
}
