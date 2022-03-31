package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
	
	private ArrayList<OrderLine> orderLines = new ArrayList<OrderLine>();
	private String date;
	private Customer customer;
	private boolean deliveryStatus;
	private String deliveryDate;
	private float totalPrice;
	private String paymentDate;
	
	public Order() {
		setDate();
	}
	
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	public void addCustomer(Customer customer) {
		this.customer = customer;
	}
	public ArrayList<OrderLine> getOrderlines(){
		return orderLines;
	}
	public void addOrderline(Product product, int quantity) {
		orderLines.add(new OrderLine(product, quantity));
	}
	public float getTotalPrice() {
		totalPrice = 0;
		for (OrderLine ol : orderLines) {
			totalPrice += ol.getQuantity() * ol.getProduct().getPurchasePrice(); 
		}
		return totalPrice;
	}
	
	public int getCustomerId() {
		return customer.getCustomerId();
	}
	public String getDate() {
		return date;
	}
	
	public void setDate() {
		LocalDate dateTime = LocalDate.now();
		date = dateTime.toString();
	}
	public boolean getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(boolean deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

}
