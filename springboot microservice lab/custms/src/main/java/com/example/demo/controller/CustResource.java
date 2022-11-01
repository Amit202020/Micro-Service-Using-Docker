package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.bean.AccountList;
import com.example.demo.bean.Cust;
import com.example.demo.bean.CustList;
import com.example.demo.config.CustServiceConfig;
import com.example.demo.config.Properties;
import com.example.demo.service.CustService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;


@RestController
public class CustResource {
	
	
//	@Autowired
//	RestTemplate restTemplate;
//	
//	
//	@GetMapping("/allAccounts")
//	public AccountList getAllAccount() {
//		
//		AccountList   alist= restTemplate.getForObject("http://localhost:8083/allAcc", AccountList.class);
//		return alist;
//		
//	}
	
	

	@Autowired
	CustService service;

	@GetMapping("/allCust")
	public CustList getAllCust() {
		CustList clist = new CustList();
		clist.setCustList(service.getAllCust());
		return clist;
	}

	@GetMapping("/cust/{id}")
	public Cust getCustById(@PathVariable("id") String id) {

		return service.getCustById(id);

	}
	
	@Autowired
	CustServiceConfig  csc;

	@GetMapping("/cust/properties")
	public String getPropertiesDetails()throws JsonProcessingException{
                         ObjectWriter ow=new ObjectMapper().writer();
                         Properties properties=new Properties(csc.getMessage(),
                        		 			csc.getBuildversion(),
                                            csc.getMail(),
                                            csc.getSubject());
                         String obj=ow.writeValueAsString(properties);
                         return obj;
                    }

}
