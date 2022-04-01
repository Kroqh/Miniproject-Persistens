package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import model.SaleOrder;

public class OrderDB {

	public int orderSave(SaleOrder order) throws DataAccessException {
		int insertedKey = 1;
		Connection con = DBConnection.getInstance().getConnection();
		

		String baseInsert = "insert into SaleOrders (fk_customerID, date, deliveryStatus, deliveryDate, paymentDate) values ";
		baseInsert += "(" + order.getCustomerId() + ", '" + order.getDate() + "', '" + order.getDeliveryStatus() + "', '" + order.getDeliveryDate() + "', '" + order.getPaymentDate() + "')";
		System.out.println(baseInsert);

		
		try {
			PreparedStatement pStmt = con.prepareStatement(baseInsert, Statement.RETURN_GENERATED_KEYS);
			insertedKey = DBConnection.getInstance().executeInsertWithIdentity(pStmt);
			pStmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Inserted key: " + insertedKey);
		return insertedKey;
	}
	
}
