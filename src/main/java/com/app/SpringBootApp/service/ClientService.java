package com.app.SpringBootApp.service;

import java.util.List;

import com.app.SpringBootApp.model.Client;

public interface ClientService {
	public void createClient(Integer idClient, String clientName, String clientPrenume, String adress, String county, String cnp);
	public String updateClient(Client client);
	public String deleteClient(Integer idClient);
	public Client getClient(Integer idClient);
	public List<Client> getAllClients();
}
