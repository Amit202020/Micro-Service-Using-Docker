package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Cust;
import com.example.demo.dao.CustDAO;

@Service
public class CustService {
	
	 @Autowired
	 CustDAO    dao;
	
	 public  List<Cust>  getAllCust(){
		 
		return  dao.getAllCust();
 
     }
	 public Cust  getCustById(String id) {
		 
		 return dao.getCustById(id);
		 
	 }

}
