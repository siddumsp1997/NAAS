import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MagazineTest {

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
	public void TestSetTitle(){
        System.out.println("SetTitle");
        String Title = "Brunch";
        Magazine magazine = new Magazine("a",0,"S.Chand","Comic",20.0);
        magazine.SetTitle(Title);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
	}
	
	@Test
	public void TestSetCode(){
        System.out.println("SetCode");
        int Code = 78;
        Magazine magazine = new Magazine("a",0,"S.Chand","Comic",20.0);
        magazine.SetCode(Code);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
	}
	
	@Test
	public void TestSetPublisher(){
        System.out.println("SetPublisher");
        String Publisher = "publisher";
        Magazine magazine = new Magazine("a",0,"S.Chand","Comic",20.0);
        magazine.SetTitle(Publisher);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
	}
	
	@Test
	public void TestSetType(){
        System.out.println("SetType");
        String Type = "Action";
        Magazine magazine = new Magazine("a",0,"S.Chand","Comic",20.0);
        magazine.SetTitle(Type);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
	}
	
	@Test
	public void TestSetCost(){
        System.out.println("SetCost");
        double Cost = 100.0;
        Magazine magazine = new Magazine("a",0,"S.Chand","Comic",20.0);
        magazine.SetCost(Cost);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
	}
	
	  @Test
	    public void TestGetTitle() {
	        System.out.println("GetTitle");
	        Magazine magazine = new Magazine("Brunch",0,"S.Chand","Comic",20.0);
	        String expResult = magazine.GetTitle();
	        String result = magazine.GetTitle();
	        assertEquals(expResult, result);
	        // TODO review the generated test code and remove the default call to fail.
	        //fail("The test case is a prototype.");
	    }
	
	  @Test
	    public void TestGetCode() {
	        System.out.println("GetCode");
	        Magazine magazine = new Magazine("Brunch",0,"S.Chand","Comic",20.0);
	        int expResult = 0;
	        int result = magazine.GetCode();
	        assertEquals(expResult, result);
	        // TODO review the generated test code and remove the default call to fail.
	        //fail("The test case is a prototype.");
	    }
	  
	  @Test
	    public void TestGetPublisher() {
	        System.out.println("GetPublisher");
	        Magazine magazine = new Magazine("Brunch",0,"S.Chand","Comic",20.0);
	        String expResult = "S.Chand";
	        String result = magazine.GetPublisher();
	        assertEquals(expResult, result);
	        // TODO review the generated test code and remove the default call to fail.
	        //fail("The test case is a prototype.");
	    }
	  
	  @Test
	    public void TestGetType() {
	        System.out.println("GetType");
	        Magazine magazine = new Magazine("Brunch",0,"S.Chand","Comic",20.0);
	        String expResult = "Comic";
	        String result = magazine.GetType();
	        assertEquals(expResult, result);
	        // TODO review the generated test code and remove the default call to fail.
	        //fail("The test case is a prototype.");
	    }
	  
	  @Test
	    public void TestGetCost() {
	        System.out.println("GetCost");
	        Magazine magazine = new Magazine("Brunch",0,"S.Chand","Comic",20.0);
	        Double expResult = 20.0;
	        Double result = magazine.GetCost();
	        assertEquals(expResult, result);	        
	        // TODO review the generated test code and remove the default call to fail.
	        //fail("The test case is a prototype.");
	    }
}
