package db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import model.OrderLine;

public class OrderLineDB {
	
	public void orderLineSave(OrderLine orderLine, int orderId) throws DataAccessException {
		
		Connection con = DBConnection.getInstance().getConnection();
		
		String baseInsert = "insert into OrderLines (fk_OrderID, fk_ProductID, quantity) values ";
		baseInsert += "(" + orderId + ", " + orderLine.getProductID() + ", " + orderLine.getQuantity() + ");";
		System.out.println(baseInsert);
		
		try {
			PreparedStatement pStmt = con.prepareStatement(baseInsert, Statement.RETURN_GENERATED_KEYS);
			DBConnection.getInstance().executeInsertWithIdentity(pStmt);
			pStmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
