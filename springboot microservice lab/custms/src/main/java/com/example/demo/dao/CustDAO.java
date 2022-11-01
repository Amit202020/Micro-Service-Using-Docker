package com.example.demo.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.bean.Cust;

@Repository
public class CustDAO {
	
	     List<Cust>   custs = Arrays.asList(
	    		 new  Cust("1001","Srini","Dev"),
	    		 new  Cust("1002","max","Sales"),
	    		 new  Cust("1003","navin","CEO")
	    		 );
	     
	     public  List<Cust>  getAllCust(){
	    	 return custs;
	     }
	     
	     public Cust  getCustById(String id) {
	    	Cust   c =  custs.stream().filter(cust -> id.equals(cust.getCustId())).findAny().orElse(null);
	    	return c;
	     }

}
