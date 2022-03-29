package model;

public class Customer {
	private String name;
	private String address;
	private int zipcode;
	private String city;
	private int phoneno;
	
	public Customer(String name, String address, int zipcode, String city, int phoneno) {
		this.name = name;
		this.address = address;
		this.zipcode = zipcode;
		this.city = city;
		this.phoneno = phoneno;
		
	}
	
	public String getName() {
		return name;
	}
	public int getPhoneno() {
		return phoneno;
	}
	
	
}
