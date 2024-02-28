package com.app.SpringBootApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/index")
	public String paginaDePornire() {
		return "index";
	}
	
	@GetMapping("/addClient")
	public String adaugaClient() {
		return "addClient";
	}
	
	
}
