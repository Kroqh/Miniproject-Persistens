package controller;

import model.Customer;
import model.Order;
import model.OrderLine;
import model.Product;
import db.OrderDB;
import db.OrderLineDB;

public class OrderController {
	
	private CustomerController customerController;
	private ProductController productController;
	private OrderDB orderDB;
	private OrderLineDB orderLineDB;
	private Order currentOrder;
	
	public OrderController() {
		customerController = new CustomerController();
		productController = new ProductController();
		orderDB = new OrderDB();
		orderLineDB = new OrderLineDB();
	}
	
	public void addProductByID(int productID, int quantity) {
		Product product = productController.addProductByID(productID);
		addOrderLine(product, quantity);
	}
	
	public void addCustomerByPhone(int phoneno) {
		Customer customer = customerController.addCustomerByPhone(phoneno);
		currentOrder.addCustomer(customer);
	}
	public void orderSave() {
		orderDB.orderSave(currentOrder);
		for (OrderLine ol : currentOrder.getOrderlines()) {
			orderLineDB.orderLineSave(ol);
		}

	}
	
	public void createOrder() {
		currentOrder = new Order();
	}
	public Order getOrder() {
		return currentOrder;
	}
	
	private void addOrderLine(Product product, int quantity) {
		currentOrder.addOrderline(product, quantity);
	}
	
	public double getTotal() {
		return currentOrder.getTotal();
	}

}
