package db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Clothing;
import model.Equipment;
import model.GunReplica;
import model.Product;

public class ProductDB {
	

	public Product findProductByName(String productName) throws DataAccessException {
		Connection con = DBConnection.getInstance().getConnection();
		Product product = null;
		
		String baseSelect = "select id, name, color, size, material, calibre, type, description, purchasePrice, salesPrice, rentPrice, minStock, currentStock from Products ";
		baseSelect += "left outer join Clothing on Products.id = Clothing.fk_ProductId ";
		baseSelect += "left outer join Equipment on Products.id = Equipment.fk_ProductId ";
		baseSelect += "left outer join GunReplica on Products.id = GunReplica.fk_ProductId ";
		baseSelect += "where name = " + "'" +productName + "';";
		
		ResultSet rs = null;
		String name = null;
		String color = null;
		int size = 0;
		String material = null;
		String calibre = null;
		String type = null;
		String description = null;
		float purchasePrice = 0;
		float salesPrice = 0;
		float rentPrice = 0;
		int minStock = 0;
		int currentStock = 0;
		int productID = 0;
		
		try {
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery(baseSelect);
			rs.next();
			name = rs.getString("name");
			color = rs.getString("color");
			size = rs.getInt("size");
			material = rs.getString("material");
			calibre = rs.getString("calibre");
			type = rs.getString("type");
			description = rs.getString("description");
			purchasePrice = rs.getFloat("purchasePrice");
			salesPrice = rs.getFloat("salesPrice");
			rentPrice = rs.getFloat("rentPrice");
			minStock = rs.getInt("minStock");
			currentStock = rs.getInt("currentStock");
			productID = rs.getInt("id");
			
			
			stmt.close();
			
			if (color != null) {
				product = new Clothing(size, color, name, purchasePrice, salesPrice, rentPrice, minStock, currentStock, productID);
			}
			else if (material != null) {
				product = new GunReplica(calibre, material, name,  purchasePrice, salesPrice, rentPrice, minStock, currentStock, productID);
			}
			else if (type != null) {
				product = new Equipment(type, description, name, purchasePrice, salesPrice, rentPrice, minStock, currentStock, productID);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return product;
	}
}
