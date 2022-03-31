package model;

public class Product {
	private String name; 
	private String countryOfOrigin;
	private double purchasePrice;
	private double salesPrice;
	private double rentPrice;
	private int minStock;
	
	public Product(String name, String countryOfOrigin, float purchasePrice, float salesPrice, float rentPrice, int minStock) {
		this.name = name;
		this.countryOfOrigin = countryOfOrigin;
		this.purchasePrice = purchasePrice;
		this.salesPrice = salesPrice;
		this.rentPrice = rentPrice;
		this.minStock = minStock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
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
	
	
}
