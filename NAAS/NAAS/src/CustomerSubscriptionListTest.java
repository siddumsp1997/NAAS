import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CustomerSubscriptionListTest {

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
	public void TestSetCustomerID(){
        System.out.println("SetCustomerID");
        String CustomerID = "Sid";
        CustomerSubscriptionList customerSubscriptionList = new CustomerSubscriptionList("Aniket");
        customerSubscriptionList.setCustomerID(CustomerID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
	}
	@Test
	public void TestSetDeliveryBoyAssignedID(){
        System.out.println("SetDeliveryBoyAssignedID");
        String DeliveryBoyAssignedID = "Shemal";
        CustomerSubscriptionList customerSubscriptionList = new CustomerSubscriptionList("Aniket");
        customerSubscriptionList.setDeliveryBoyAssignedID(DeliveryBoyAssignedID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
	}
	  @Test
	    public void TestGetCustomerID() {
	        System.out.println("GetCustomerID");
	        CustomerSubscriptionList customerSubscriptionList = new CustomerSubscriptionList("Aniket");
	        String expResult = "Aniket";
	        String result = customerSubscriptionList.getCustomerID();
	        assertEquals(expResult, result);
	        // TODO review the generated test code and remove the default call to fail.
	        //fail("The test case is a prototype.");
	    }
	  @Test
	    public void TestGetDeliveryBoyAssignedID() {
	        System.out.println("GetDeliveryBoyAssignedID");
	        CustomerSubscriptionList customerSubscriptionList = new CustomerSubscriptionList("Aniket");
	        customerSubscriptionList.setDeliveryBoyAssignedID("Shemal");
	        String expResult = "Shemal";
	        String result = customerSubscriptionList.getCustomerID();
	        assertEquals(expResult, result);
	        // TODO review the generated test code and remove the default call to fail.
	        //fail("The test case is a prototype.");
	    }
	  

}
