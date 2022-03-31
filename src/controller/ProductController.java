package controller;

import db.DataAccessException;
import db.ProductDB;
import model.Product;

public class ProductController {

	private ProductDB productDB;
	
	public ProductController() {
		productDB = new ProductDB();
	}
	public Product findProductByName(String productName) throws DataAccessException {
		Product product = productDB.findProductByName(productName);
		return product;
	}
	
}
