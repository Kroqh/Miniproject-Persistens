package model;

public class Equipment extends Product {
	
	public Equipment(String type, String description, String name, float purchasePrice, float salesPrice, float rentPrice,
			int minStock, int currentStock) {
		super(name, purchasePrice, salesPrice, rentPrice, minStock, currentStock);
		this.type = type;
		this.description = description;

	}
	private String type;
	private String description;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
