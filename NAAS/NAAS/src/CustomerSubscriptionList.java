import java.util.*;
import java.io.Serializable;
import java.lang.*;


public class CustomerSubscriptionList implements Serializable
{  

    private String CustomerID;
    private String DeliveryBoyAssignedID;
    private Double Cost;
	private  ArrayList<Magazine> ListSubscription; //Subscription list
	private  ArrayList<Date> ListDateOfSubscription; //Date of Subscription list
	
	
	//CustomerSubscriptionList constructor
	public CustomerSubscriptionList(String CustomerID)
	{
		
		this.CustomerID=CustomerID;
		ListDateOfSubscription=new ArrayList<>();
		ListSubscription=new ArrayList<>();
		DeliveryBoyAssignedID = null;
		Cost = 0.0;
	}
	//End of constructor
	
	
	
	  //Function to get customer ID
	public 	String getCustomerID()
		{
		  return CustomerID;
			
		}
		//End of the function 
		
		
		//Function to set CustomerID
	public 	void setCustomerID(String UserID)
		{
		  this.CustomerID = CustomerID;	
			
		}
		//End of the function 
	
	
		 //Function to get Delivery boy ID
	public 	String getDeliveryBoyAssignedID()
		{
		  return DeliveryBoyAssignedID;
			
		}
		//End of the function 
		
		
		//Function to set Delivery boy ID
	public 	void setDeliveryBoyAssignedID(String DeliveryBoyAssignedID)
		{
		  this.DeliveryBoyAssignedID=DeliveryBoyAssignedID;	
			
		}
		//End of the function 
		
		
		 //Function to get Cost
	public 	double getCost()
		{
		  return Cost;
			
		}
		//End of the function 
		
		
		//Function to set Cost
	public 	void setCost(double Cost)
		{
		  this.Cost=Cost;	
			
		}
		//End of the function 
	public 	ArrayList<Magazine> getListSubscription()
	{
	  return ListSubscription;
		
	}
	//End of the function 
	
	
	//Function to set Cost
public 	void setListSubscription(ArrayList<Magazine> ListSubscription)
	{
	  this.ListSubscription=ListSubscription;	
		
	}
	//End of the function		
		
		
	//Function to subscribe
public 	ArrayList<Date> getListDateOfSubscription()
{
  return ListDateOfSubscription;
	
}
//End of the function 


//Function to set Cost
public 	void setListDateOfSubscription(ArrayList<Date> ListDateOfSubscription)
{
  this.ListDateOfSubscription = ListDateOfSubscription;	
	
}
//End of the function		
	
	
//Function to subscribe

	public 	void Subscribe(int inMagazineCode,DeliveryDatabase deliveryDatabase)
	{
		Magazine magazine = deliveryDatabase.ListMagazine.get(inMagazineCode);
		this.ListSubscription.add(magazine);
		
		
	}
	//End of the function Subscribe()
	
	
	//Function to compute the cost of the subscription
	public 	void ComputeCost()
	{	this.Cost = 0.0;
		for(Magazine magazine : this.ListSubscription){
			Cost += magazine.GetCost();
		}
		
	}
	//End of the function ComputeCost()

}
//End of the class CustomerSubscriptionList