package com.smartopo.controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartopo.DAO.ClientDAO;
import com.smartopo.entities.Client;

@RestController
@RequestMapping(value = "/clients/")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {


		@Autowired
		private ClientDAO clientDAO;
		
		@GetMapping(value = "all")
		public List<Client> getClients(){
			return clientDAO.findAll();
		}
		
		@GetMapping(value = "all/{id}")
		public Optional<Client> getArticle(@PathVariable Long id) {
			return clientDAO.findById(id);
		} 
		@DeleteMapping(value = "delete/{id}")
		public boolean deleteArticle(@PathVariable Long id) {
			clientDAO.deleteById(id);
			return true;
		}
		@PutMapping(value = "update")
		public Client updateClient(@RequestBody Client client) {
			return clientDAO.save(client);
		}
		@PostMapping(value = "new")
		public Client createClient(@RequestBody Client client) {
			return clientDAO.save(client);
		}
	}


