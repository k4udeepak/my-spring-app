package com.example.myspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/hello")
	public String showMessage() {
		return "Here i am, your first Spring project automated";
	}

}   
