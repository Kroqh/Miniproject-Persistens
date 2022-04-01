package controller;

import db.DataAccessException;

//This class exists sorely to execute the program with hardcoded data to test the systems execution of inserting data onto the database

public class Start {
	
	private static OrderController oc;

	public static void main(String[] args) throws DataAccessException {
		start();
	}

	private static void start() throws DataAccessException {
		int phoneno = 12345678;
		int quantity = 2;
		int quantity2 = 1;
		String productName = "Revolver";
		String productName2 = "fredspipe";
		String paymentDate = "I dag";
		String deliveryDate = "Imorgen";
		boolean delivery = true;
		oc = new OrderController();
		oc.createOrder();
		oc.findCustomerByPhone(phoneno);
		oc.findProductByName(productName, quantity2);
		oc.findProductByName(productName2, quantity);
		oc.setPaymentDate(paymentDate);
		oc.setDeliveryStatus(delivery);
		oc.setDevliveryDate(deliveryDate);
		oc.orderSave();
	}

}
