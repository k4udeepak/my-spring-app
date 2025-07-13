package com.example.myspringbootjenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControllerJenkins {
	@GetMapping("/jenkins")
	public String showMessage() {
		return "Here i am, your first Spring project automated and deployed on docker/kubernetes/aws through Jenkins";
	}

}
