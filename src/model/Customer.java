package model;

public class Customer {
	private String firstName;
	private String surName;
	private String street;
	private String houseno;
	private String floor;
	private int zipcode;
	private int phoneno;
	private int customerId;
	
	public Customer(String firstName,
					String surName,
					String street,
					String houseno,
					String floor,
					int zipcode,
					int phoneno,
					int customerId) {
		this.firstName = firstName;
		this.surName = surName;
		this.street = street;
		this.houseno = houseno;
		this.floor = floor;
		this.zipcode = zipcode;
		this.phoneno = phoneno;
		this.customerId = customerId;
		
	}
	
	public String getfullName() {
		return firstName + " " + surName ;
	}
	public int getPhoneno() {
		return phoneno;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
}
