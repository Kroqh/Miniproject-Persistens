package test;

import static org.junit.Assert.*;


import org.junit.*;

//import controllayer.ControlPayStation;
//import controllayer.Currency;
//import controllayer.IPayStation;
//import controllayer.IReceipt;
//import controllayer.IllegalCoinException;

import db.*;


//import static org.junit.Assert.*;

/**
 * Inspired by the book: Flexible, Reliable Software Henrik Bærbak Christensen:
 * Flexible, Reliable Software. Taylor and Francis Group, LLC 2010
 */

public class TestDatabaseAccess {
	
	DBConnection con = null;


	/** Fixture for pay station testing. 
	 * @throws DataAccessException */
	@Before
	public void setUp() throws DataAccessException {
		con = DBConnection.getInstance();
	}
	
	
	@Test
	public void wasConnected() {
		assertNotNull("Connected - connection cannot be null", con);
			
	}

	
	@After
	public void cleanUp() {

		con.disconnect();

	}	

}
