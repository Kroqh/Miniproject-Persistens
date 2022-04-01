package model;

public class OrderLine {
	
	private Product product;
	private int quantity;

	public OrderLine(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public int getProductID() {
		return product.getProductID();
	}
}
