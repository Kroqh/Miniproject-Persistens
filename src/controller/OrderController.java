package controller;

import model.Customer;
import model.Order;
import model.Product;

public class OrderController {
	
	private CustomerController customerController;
	private ProductController productController;
	
	public OrderController() {
		customerController = new CustomerController();
		productController = new ProductController();
	}
	
	public Product addProductByID(int productID) {
		return null;
	}
	
	public Customer addCustomerByPhone(int phoneno) {
		return null;
	}
	
	public Order createOrder() {
		return null;
	}
	
	public void addOrderLine(Product product) {
	}
	
	public int getTotal() {
		return 0;
	}

}
