import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class DeliveryDatabase implements Serializable{
		  /**
	 * 
	 */
		public   ArrayList<Customer> ListCustomers; //Customer list	
		  public   ArrayList<DeliveryPerson> ListDeliveryPerson ; //Delivery person list
		  public   ArrayList<Magazine> ListMagazine; //Magazine list
		  public   Manager manager ;
		  
		  public DeliveryDatabase(){
			  ListCustomers = new ArrayList<>();
			  ListDeliveryPerson = new ArrayList<>();
			  ListMagazine = new ArrayList<>();
			  ListMagazine = new ArrayList<>();
			  manager = null;
		  }
		  
}


