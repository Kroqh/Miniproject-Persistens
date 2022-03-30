package controller;

import db.ProductDB;
import model.Product;

public class ProductController {

	private ProductDB productDB;
	
	public ProductController() {
		productDB = new ProductDB();
	}
	public Product addProductByID(int productId) {
		Product product = productDB.findProductById(productId);
		return product;
	}
	
}
