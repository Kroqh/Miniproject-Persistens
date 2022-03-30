package model;

public class OrderLine {
	
	private Product product;
	private int amount;

	public OrderLine(Product product, int amount) {
		this.product = product;
		this.amount = amount;
	}
	public int getQuantity() {
		return amount;
	}
	
	public Product getProduct() {
		return product;
	}
}
