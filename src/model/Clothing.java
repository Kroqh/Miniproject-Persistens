package model;

public class Clothing extends Product {
	
	private int size;
	private String color;

	public Clothing(int size, String color, String name, double purchasePrice, double salesPrice, double rentPrice, int minStock,
			int currentStock) {
		super(name, purchasePrice, salesPrice, rentPrice, minStock, currentStock);
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
