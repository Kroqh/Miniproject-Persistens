package model;

public class Customer {
	private String firstName;
	private String surName;
	private String street;
	private String houseno;
	private String floor;
	private int zipcode;
	private int phoneno;
	
	public Customer(String firstName,
					String surName,
					String street,
					String houseno,
					String floor,
					int zipcode,
					int phoneno) {
		this.firstName = firstName;
		this.surName = surName;
		this.street = street;
		this.houseno = houseno;
		this.floor = floor;
		this.zipcode = zipcode;
		this.phoneno = phoneno;
		
	}
	
	public String getfullName() {
		return firstName + " " + surName ;
	}
	public int getPhoneno() {
		return phoneno;
	}
	
	
}
