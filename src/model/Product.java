package model;

public class Product {
	private String name; 
	private double purchasePrice;
	private double salesPrice;
	private double rentPrice;
	private int minStock;
<<<<<<< Updated upstream
	
	public Product(String name, String countryOfOrigin, float purchasePrice, float salesPrice, float rentPrice, int minStock) {
=======
	private int currentStock;

	public Product(String name, double purchasePrice, double salesPrice, double rentPrice, int minStock, int currentStock) {
>>>>>>> Stashed changes
		this.name = name;
		this.purchasePrice = purchasePrice;
		this.salesPrice = salesPrice;
		this.rentPrice = rentPrice;
		this.minStock = minStock;
		this.currentStock = currentStock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(float purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(float salesPrice) {
		this.salesPrice = salesPrice;
	}

	public double getRentPrice() {
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
