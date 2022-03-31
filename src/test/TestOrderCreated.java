package test;
import static org.junit.Assert.*;
import controller.OrderController;

import org.junit.*;
public class TestOrderCreated {

	OrderController orderController;
	@Before
	public void setUp() {
		orderController = new OrderController();
	}
	
	//If the order has been succesfully created and products has been added, then the price total must equal the precalculated price total
	//(Assuming no price changes)
	@Test
	public void OrderWasCreatedTotalCheck() {
		orderController.createOrder();
		try {
			orderController.findCustomerByPhone(12345678);
			orderController.findProductByName("Revolver", 2);
		}
		catch(Exception e) {
			Assert.fail("Database connection failure");
		}
		Assert.assertEquals(13000, orderController.getTotal(), 0);
	}
		
		
		
}
