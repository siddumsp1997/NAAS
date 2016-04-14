import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CustomerTest {

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
	public void TestSetName(){
        System.out.println("SetName");
        String Name = "Ravi";
        Customer customer = new Customer("Aniket","Ani","E-411");
        customer.SetName(Name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
	}
	
	@Test
	public void TestSetCustomerID(){
        System.out.println("SetCustomerID");
        String CustomerID = "CoolDude";
        Customer customer = new Customer("Aniket","Ani","E-411");
        customer.SetName(CustomerID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
	}
	
	@Test
	public void TestSetAddress(){
        System.out.println("SetAddress");
        String Address = "E-311";
        Customer customer = new Customer("Aniket","Ani","E-411");
        customer.SetName(Address);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
	}
	
	@Test
	public void TestSetNoOfSubscription(){
        System.out.println("SetNoOfSubscription");
        int NoOfSubscription = 0;
        Customer customer = new Customer("Aniket","Ani","E-411");
        customer.SetNoOfSubscription(NoOfSubscription);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
	}

	@Test
	public void TestSetBill(){
        System.out.println("SetBill");
        double Bill = 100.0;
        Customer customer = new Customer("Aniket","Ani","E-411");
        customer.SetBill(Bill);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
	}
	  @Test
	    public void TestGetName() {
	        System.out.println("GetName");
	        Customer customer = new Customer("Aniket","Ani","E-411");
	        String expResult = "Aniket";
	        String result = customer.GetName();
	        assertEquals(expResult, result);
	        // TODO review the generated test code and remove the default call to fail.
	        //fail("The test case is a prototype.");
	    }
	  @Test
	    public void TestGetCustomerID() {
	        System.out.println("GetCustomerID");
	        Customer customer = new Customer("Aniket","Ani","E-411");
	        String expResult = "Ani";
	        String result = customer.GetCustomerID();
	        assertEquals(expResult, result);
	        // TODO review the generated test code and remove the default call to fail.
	        //fail("The test case is a prototype.");
	    }
	  @Test
	    public void TestGetBill() {
	        System.out.println("GetBill");
	        Customer customer = new Customer("Aniket","Ani","E-411");
	        Double expResult = customer.GetBill();
	        Double result = customer.GetBill();
	        assertEquals(expResult, result);
	        // TODO review the generated test code and remove the default call to fail.
	        //fail("The test case is a prototype.");
	    }
	  @Test
	    public void TestGetNoOfSubscription() {
	        System.out.println("GetNoOfSubscription");
	        Customer customer = new Customer("Aniket","Ani","E-411");
	        Integer expResult = customer.GetNoOfSubscription();
	        Integer result = customer.GetNoOfSubscription();
	        assertEquals(expResult, result);
	        // TODO review the generated test code and remove the default call to fail.
	        //fail("The test case is a prototype.");
	    }
	  
	  @Test
	    public void TestGetAddress() {
	        System.out.println("GetAddress");
	        Customer customer = new Customer("Aniket","Ani","E-411");
	        String expResult = "E-411";
	        String result = customer.GetAddress();
	        assertEquals(expResult, result);
	        // TODO review the generated test code and remove the default call to fail.
	        //fail("The test case is a prototype.");
	    }
}
