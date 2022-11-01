package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Account;
import com.example.demo.bean.AccountList;
import com.example.demo.config.AccountServiceConfig;
import com.example.demo.config.Properties;
import com.example.demo.service.AccService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;


@RestController
public class AccResource {
	
	
	@Autowired
	AccService   service;
	
	
	@GetMapping("/allAcc")
	public AccountList getAllCust() {
		AccountList clist = new AccountList();
		clist.setAlist(service.getAllAcc());
		return clist;
	}

	@GetMapping("/acc/{id}")
	public Account getAccById(@PathVariable("id") String id) {

		return service.getAccById(id);

	}
	
	
	@Autowired
	AccountServiceConfig  asc;

	@GetMapping("/account/properties")
	public String getPropertiesDetails()throws JsonProcessingException{
                         ObjectWriter ow= new ObjectMapper().writer();
                         Properties properties=new Properties(asc.getMessage(),asc.getBuildversion(),asc.getMail(),asc.getSubject());
                         String obj=ow.writeValueAsString(properties);
                         return obj;
    }
	

}
