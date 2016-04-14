import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class DeliveryPersonTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestSetUserID(){
        System.out.println("SetUserID");
        String UserID = "Ravi";
        DeliveryPerson deliveryPerson = new DeliveryPerson("Aniket","Ani");
        deliveryPerson.setUserID(UserID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
	}
	@Test
	public void TestSetPassword(){
        System.out.println("SetPassword");
        String Password = "asd";
        DeliveryPerson deliveryPerson = new DeliveryPerson("Aniket","Ani");
        deliveryPerson.setPassword(Password);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
	}
	@Test
	public void TestSetMonthlyPayroll(){
        System.out.println("SetMonthlyPayroll");
        double monthlyPayroll = 20.0;
        DeliveryPerson deliveryPerson = new DeliveryPerson("Aniket","Ani");
        deliveryPerson.setMonthlyPayroll(monthlyPayroll);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
	}

	  @Test
	    public void TestGetUserID() {
	        System.out.println("GetUserID");
	        DeliveryPerson deliveryPerson = new DeliveryPerson("Aniket","Ani");
	        String expResult = "Aniket";
	        String result = deliveryPerson.getUserID();
	        assertEquals(expResult, result);
	        // TODO review the generated test code and remove the default call to fail.
	        //fail("The test case is a prototype.");
	    }
	  @Test
	    public void TestGetPassword() {
	        System.out.println("GetPassword");
	        DeliveryPerson deliveryPerson = new DeliveryPerson("Aniket","Ani");
	        String expResult = "Ani";
	        String result = deliveryPerson.getPassword();
	        assertEquals(expResult, result);
	        // TODO review the generated test code and remove the default call to fail.
	        //fail("The test case is a prototype.");
	    }
	  @Test
	    public void TestGetMonthlyPayroll() {
	        System.out.println("GetMonthlyPayroll");
	        DeliveryPerson deliveryPerson = new DeliveryPerson("Aniket","Ani");
	        Double expResult = deliveryPerson.getmonthlyPayroll();
	        Double result = deliveryPerson.getmonthlyPayroll();
	        assertEquals(expResult, result);
	        // TODO review the generated test code and remove the default call to fail.
	        //fail("The test case is a prototype.");
	    }
}
