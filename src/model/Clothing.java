package model;

public class Clothing extends Product {
	
	private int size;
	private String color;

	public Clothing(int size, String color, String name, float purchasePrice, float salesPrice, float rentPrice, int minStock,
			int currentStock, int productID) {
		super(name, purchasePrice, salesPrice, rentPrice, minStock, currentStock, productID);
		this.size = size;
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
