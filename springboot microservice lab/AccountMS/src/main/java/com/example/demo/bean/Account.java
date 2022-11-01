package com.example.demo.bean;

public class Account {
	
	private String accId;
	private String accName;
	private String accType;
	
	
	public Account() {
		super();
	}
	public Account(String accId, String accName, String accType) {
		super();
		this.accId = accId;
		this.accName = accName;
		this.accType = accType;
	}
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accName=" + accName + ", accType=" + accType + "]";
	}
	
	
	

}
