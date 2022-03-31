package model;

public class Product {
	private String name; 
	private float purchasePrice;
	private float salesPrice;
	private float rentPrice;
	private int minStock;
	private int currentStock;
	private int productID;
	
	public Product(String name, float purchasePrice, float salesPrice, float rentPrice, int minStock, int currentStock, int productID) {

		this.name = name;
		this.purchasePrice = purchasePrice;
		this.salesPrice = salesPrice;
		this.rentPrice = rentPrice;
		this.minStock = minStock;
		this.currentStock = currentStock;
		this.productID = productID;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(float purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public float getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(float salesPrice) {
		this.salesPrice = salesPrice;
	}

	public float getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(float rentPrice) {
		this.rentPrice = rentPrice;
	}

	public int getMinStock() {
		return minStock;
	}

	public void setMinStock(int minStock) {
		this.minStock = minStock;
	}
	
	public int getCurrentStock() {
		return currentStock;
	}

	public void setCurrentStock(int currentStock) {
		this.currentStock = currentStock;
	}
	
	
}
