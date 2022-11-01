package com.example.demo.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.bean.Account;

@Repository
public class AccDAO {
	
	
	    List<Account>   accs = Arrays.asList(
	    		 new  Account("1234567898","Srini","saving"),
	    		 new  Account("8765454343","max","current"),
	    		 new  Account("4354343232","navin","current")
	    		 );
	     
	     public  List<Account>  getAllAcc(){
	    	 return accs;
	     }
	     
	     public Account getAccById(String id) {
	    	Account   c =  accs.stream().filter(acc -> id.equals(acc.getAccId())).findAny().orElse(null);
	    	return c;
	     }

}
