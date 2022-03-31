package db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Customer;

public class CustomerDB {
	

	public Customer findCustomerByPhone(int phoneno) throws DataAccessException{

			Connection con = DBConnection.getInstance().getConnection();
			Customer customer = null;
			int customerID = 0;

			String baseSelect = "select * from Customers ";
			baseSelect += "where phoneno = " + phoneno;
			 
			ResultSet rs = null;
			String firstName = null;
			String surName = null;
			String street = null;
			String houseno = null;
			String floor = null;
			int zipcode = 0;
			int customerId = 0;
			
			 
			try {
				Statement stmt = con.createStatement();
				rs = stmt.executeQuery(baseSelect);
				rs.next();
				firstName = rs.getString("firstName");
				surName = rs.getString("surName");
				street = rs.getString("street");
				houseno = rs.getString("houseno");
				floor = rs.getString("floor");
				zipcode = rs.getInt("fk_Zipcode");
				customerId = rs.getInt("id");
				
				stmt.close();
				System.out.println(firstName + " " + surName + " " + street + " " + houseno + " " + floor + " " + zipcode + " " + customerId);
				customer = new Customer(firstName, surName, street, houseno, floor, zipcode, phoneno, customerId);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return customer;
	}
	
	
}
