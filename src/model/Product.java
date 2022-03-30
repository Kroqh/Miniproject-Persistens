package model;

public class Product {
	private String name; 
	private String countryOfOrigin;
	private double purchasePrice;
	private double salesPrice;
	private double rentPrice;
	private int minStock;
	
	public Product(String name, String countryOfOrigin, double purchasePrice, double salesPrice, double rentPrice, int minStock) {
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

	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(int salesPrice) {
		this.salesPrice = salesPrice;
	}

	public double getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(int rentPrice) {
		this.rentPrice = rentPrice;
	}

	public int getMinStock() {
		return minStock;
	}

	public void setMinStock(int minStock) {
		this.minStock = minStock;
	}
	
	
}
