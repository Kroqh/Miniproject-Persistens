package model;

public class GunReplica extends Product {
	
	private String calibre;
	private String material;
	
	public GunReplica(String calibre, String material, String name, float purchasePrice, float salesPrice, float rentPrice, int minStock,
			int currentStock) {
		super(name, purchasePrice, salesPrice, rentPrice, minStock, currentStock);
		this.calibre = calibre;
		this.material = material;
	}
	
	public String getCalibre() {
		return calibre;
	}
	public void setCalibre(String calibre) {
		this.calibre = calibre;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	

}
