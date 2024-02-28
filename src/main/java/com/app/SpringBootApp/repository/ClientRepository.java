package com.app.SpringBootApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.SpringBootApp.model.Client;



public interface ClientRepository extends JpaRepository<Client, Integer>{
	
}
