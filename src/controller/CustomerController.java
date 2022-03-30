package controller;

import db.CustomerDB;
import model.Customer;

public class CustomerController {
	
	private CustomerDB customerDB;
	
	public CustomerController() {
		customerDB = new CustomerDB();
	}
	public Customer addCustomerByPhone(int phoneno) {
		
		Customer customer = customerDB.findCustomerByPhone(phoneno);
		return customer;
	}
	
}
