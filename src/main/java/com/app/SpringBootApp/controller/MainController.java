package com.app.SpringBootApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("addClient")
	public String addClients() {
		return "addClient";
	}
}
