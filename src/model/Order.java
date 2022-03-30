package model;

import java.util.ArrayList;

public class Order {
	
	private ArrayList<OrderLine> orderLines = new ArrayList<OrderLine>();
	private String date;
	private Customer customer;
	private boolean deliveryStatus;
	private String deliveryDate;
	
	public void addCustomer(Customer customer) {
		this.customer = customer;
	}
	public ArrayList<OrderLine> getOrderlines(){
		return orderLines;
	}
	public void addOrderline(Product product, int quantity) {
		orderLines.add(new OrderLine(product, quantity));
	}
	public double getTotal() {
		double amount = 0;
		for (OrderLine ol : orderLines) {
			amount += ol.getQuantity() * ol.getProduct().getPurchasePrice(); 
		}
		return amount;
	}

}
