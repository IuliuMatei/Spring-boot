package com.app.SpringBootApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
	
	@Id
	private Integer idClient;
	private String clientName;
	private String clientPrenume;
	private String adress;
	private String county;
	private String cnp;
	
	
	public Client() {
		
	}

	public Client(Integer idClient, String clientName, String clientPrenume, String adress, String county, String cnp) {
		super();
		this.idClient = idClient;
		this.clientName = clientName;
		this.clientPrenume = clientPrenume;
		this.adress = adress;
		this.county = county;
		this.cnp = cnp;
	}
	
	public Integer getIdClient() {
		return idClient;
	}
	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientPrenume() {
		return clientPrenume;
	}
	public void setClientPrenume(String clientPrenume) {
		this.clientPrenume = clientPrenume;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getCnp() {
		return cnp;
	}
	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

}
