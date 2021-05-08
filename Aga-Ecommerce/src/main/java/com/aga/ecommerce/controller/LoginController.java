package com.aga.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class LoginController {
	
	@GetMapping("/login")
	public String getLogin() {
		return "Login Success";
	}
	
}
