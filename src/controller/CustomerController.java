package controller;

import db.CustomerDB;
import db.DataAccessException;
import model.Customer;

public class CustomerController {
	
	private CustomerDB customerDB;
	
	public CustomerController() {
		customerDB = new CustomerDB();
	}
	public Customer findCustomerByPhone(int phoneno) throws DataAccessException {
		
		Customer customer = customerDB.findCustomerByPhone(phoneno);
		return customer;
	}
	
}
