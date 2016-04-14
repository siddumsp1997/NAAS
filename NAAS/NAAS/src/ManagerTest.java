import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ManagerTest {

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
       Manager manager = new Manager("Aniket","Ani");
        manager.SetUserID(UserID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
	}
	@Test
	public void TestSetPassword(){
        System.out.println("SetPassword");
        String Password = "asd";
        Manager manager = new Manager("Aniket","Ani");
        manager.SetPassword(Password);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
	}
	 @Test
	    public void TestGetUserID() {
	        System.out.println("GetUserID");
	        Manager manager = new Manager("Aniket","Ani");
	        String expResult = "Aniket";
	        String result = manager.GetUserID();
	        assertEquals(expResult, result);
	        // TODO review the generated test code and remove the default call to fail.
	        //fail("The test case is a prototype.");
	    }
	  @Test
	    public void TestGetPassword() {
	        System.out.println("GetPassword");
	        Manager manager = new Manager("Aniket","Ani");
	        String expResult = "Ani";
	        String result = manager.GetPassword();
	        assertEquals(expResult, result);
	        // TODO review the generated test code and remove the default call to fail.
	        //fail("The test case is a prototype.");
	    }
}
