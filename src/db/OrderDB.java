package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import model.Order;

public class OrderDB {

	public int orderSave(Order order) throws DataAccessException {
		int insertedKey = 1;
		Connection con = DBConnection.getInstance().getConnection();
		
		int customerId = order.getCustomerId();
		String date = order.getDate();
		boolean deliveryStatus = order.getDeliveryStatus();
		String deliveryDate = order.getDeliveryDate();
		String paymentDate = order.getPaymentDate();
		
		
		String baseInsert = "insert into SaleOrders (fk_customerID, date, deliveryStatus, deliveryDate, paymentDate) values ";
		baseInsert += "(" + customerId + ", '" + date + "', '" + deliveryStatus + "', '" + deliveryDate + "', '" + paymentDate + "')";
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
