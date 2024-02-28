package com.app.SpringBootApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.SpringBootApp.model.Client;
import com.app.SpringBootApp.pojo.ClientRequest;
import com.app.SpringBootApp.service.ClientService;



@Controller
@RequestMapping("/users")
public class ClientController {
	
	@Autowired
	ClientService clientService;

	public ClientController(ClientService clientService) {
		super();
		this.clientService = clientService;
	}
	

	@GetMapping("{idClient}")
	public Client getClientDetails(@PathVariable("idClient") String idClient) {
		return clientService.getClient(Integer.parseInt(idClient));
	}
	
	//Read all Clients
	@GetMapping()
	public List<Client> getAllClientDetails() {
		return clientService.getAllClients(); 
	}
	
	@PostMapping("/add")
	public String addClient(@RequestParam("id") Integer id,
            @RequestParam("nume") String nume,
            @RequestParam("prenume") String prenume,
            @RequestParam("adresa") String adresa,
            @RequestParam("judet") String judet,
            @RequestParam("cnp") String cnp) {

		clientService.createClient(id, nume, prenume, adresa, judet, cnp);
		return "redirect:/index";

			
}
	
	@PutMapping
	public String updateClient(@RequestBody Client client) {
		clientService.updateClient(client);
		return "Update Succes!";
	}
	
	@DeleteMapping("{idClient}")
	public String deleteClient(@PathVariable String idClient) {
		clientService.deleteClient(Integer.parseInt(idClient));
		return "Delete Succes!";
	}
}