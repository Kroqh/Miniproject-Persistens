package controller;

import model.Customer;
import model.SaleOrder;
import model.OrderLine;
import model.Product;
import db.DataAccessException;
import db.OrderDB;
import db.OrderLineDB;

public class OrderController {
	
	private CustomerController customerController;
	private ProductController productController;
	private OrderDB orderDB;
	private OrderLineDB orderLineDB;
	private SaleOrder currentOrder;
	
	
	public OrderController() {
		customerController = new CustomerController();
		productController = new ProductController();
		orderDB = new OrderDB();
		orderLineDB = new OrderLineDB();
	}
	
	public void findProductByName(String productName, int quantity) throws DataAccessException {
		Product product = productController.findProductByName(productName);
		addOrderLine(product, quantity);
	}
	
	public void findCustomerByPhone(int phoneno) throws DataAccessException {
		Customer customer = customerController.findCustomerByPhone(phoneno);
		currentOrder.addCustomer(customer);
	}
	public void orderSave() throws DataAccessException {
		int orderId = orderDB.orderSave(currentOrder);
		for (OrderLine ol : currentOrder.getOrderlines()) {
			orderLineDB.orderLineSave(ol, orderId);
		}
	}
	
	public void createOrder() {
		currentOrder = new SaleOrder();
	}
	public SaleOrder getOrder() {
		return currentOrder;
	}
	
	private void addOrderLine(Product product, int quantity) {
		currentOrder.addOrderline(product, quantity);
	}
	
	public double getTotal() {
		return currentOrder.getTotalPrice();
	}
	
	public void setDevliveryDate(String deliveryDate) {
		currentOrder.setDeliveryDate(deliveryDate);
	}
	
	public void setPaymentDate(String paymentDate) {
		currentOrder.setPaymentDate(paymentDate);
	}
	
	public void setDeliveryStatus(boolean deliveryStatus) {
		currentOrder.setDeliveryStatus(deliveryStatus);
	}

}
