package com.app.SpringBootApp.service.impl;

import java.util.List;


import org.springframework.stereotype.Service;

import com.app.SpringBootApp.model.Client;
import com.app.SpringBootApp.repository.ClientRepository;
import com.app.SpringBootApp.service.ClientService;



@Service
public class ClientServiceImpl implements ClientService {

	ClientRepository clientRepository;
	
	public ClientServiceImpl(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}


	public void createClient(Integer idClient, String clientName, String clientPrenume, String adress, String county, String cnp) {
		Client client = new Client(idClient, clientName,clientPrenume,adress,county,cnp);
		clientRepository.save(client);
	}


	public String updateClient(Client client) {
		clientRepository.save(client);
		return "Succes Update!";
	}


	public String deleteClient(Integer idClient) {
		clientRepository.deleteById(idClient);
		return "DeletedSucces!";
	}

	@Override
	public Client getClient(Integer idClient) {
		return clientRepository.findById(idClient).get();
	}


	public List<Client> getAllClients() {
		return clientRepository.findAll();
	}

}
