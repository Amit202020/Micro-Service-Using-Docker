package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Account;
import com.example.demo.dao.AccDAO;

@Service
public class AccService {
	
	@Autowired
	AccDAO   dao;
	
	
	public  List<Account>  getAllAcc(){
		 
		return  dao.getAllAcc();
 
     }
	 public Account  getAccById(String id) {
		 
		 return dao.getAccById(id);
		 
	 }

}
