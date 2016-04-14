import java.util.*;
import java.io.Serializable;
import java.lang.*;


public class DeliveryPerson implements Serializable{
	
	//Class members
	private String UserID;
	private String Password;
	private double monthlyPayroll;
	
	
	//Constructor for DeliveryPerson
	public DeliveryPerson(String UserID,String Password)
	{
		this.UserID = UserID;
		this.Password = Password;
		monthlyPayroll = 0.0;
	}
	//End of the constructor
	
	
	//Function to get User ID
	public String getUserID()
	{
	  return UserID;
		
	}
	//End of the function getUserID()
	
	
	//Function to set User ID
	public void setUserID(String UserID)
	{
	  this.UserID=UserID;	
		
	}
	//End of the function setUserID()
	
	
	//Function to get password
	public String getPassword()
	{
		return Password;	
			
	}
	//End of the function getPassword()

	
	//Function to set User password
	public void setPassword(String Password)
	{
		this.Password=Password;	
			
	}
	//end of the function setPassword()
	
	
	//Function to get monthlyPayroll
	public double getmonthlyPayroll()
		{
			return monthlyPayroll;	
				
		}
		//End of the function getmonthlyPayroll()

		
		//Function to set monthlyPayroll
	public void setMonthlyPayroll(double monthlyPayroll)
		{
			this.monthlyPayroll = monthlyPayroll;	
				
		}
		//end of the function setPassword()
	
	
	
	
	
	
	//Function to check Daily list
	public void SeeDailyList(NAAS window, DeliveryDatabase deliveryDatabase)
	{
		window.all_address_subscription(deliveryDatabase.ListDeliveryPerson.indexOf(this));
		
		
	}
	//End of the function SeeDailyList()
	
	
	
	//Function to login to the system
	public int Login(String UserID,String Password, DeliveryDatabase deliveryDatabase)
	{
		
	     int flag=-1;
	     int index=0;
		
		 for(DeliveryPerson x:deliveryDatabase.ListDeliveryPerson)
         {  
 	           if(x.UserID.equals(UserID))
 	          { 
 	        	 
 	        	 if(x.Password.equals(Password))  
 	        	 {
 	        		 flag=index;
 	        		 break;
 	        	 }
 	            
 	          }
 	           index++;
 	           
          }
		//end of for loop
		
		
		 return flag;

		
	}
	//End of the function Login()
	
	
	//Function to check the allotted address list
    public void SeeAllottedAddressList(NAAS window, DeliveryDatabase deliveryDatabase)
    {
    	window.alloted_address_subscription(deliveryDatabase.ListDeliveryPerson.indexOf(this));
    	
    }
    //End of the function SeeAllottedAddressList()
    
    
    //Function to compute the monthly payroll
    public void ComputeMonthlyPayRoll(DeliveryDatabase deliveryDatabase)
    {
    	monthlyPayroll = 0.0;
    	for(Customer customer : deliveryDatabase.ListCustomers){
    	
    		if(getUserID() != null && customer.GetSubscriptions().getDeliveryBoyAssignedID()!=null && customer.GetSubscriptions().getDeliveryBoyAssignedID().equals(this.getUserID())){
    			customer.ComputeBill();
    			monthlyPayroll += customer.GetBill()*0.025;
    			System.out.println(customer.GetBill());
    		}
    	}
    	
    }
    //End of the function ComputeMonthlyPayRoll()
    
    
}
//End of the class DeliveryPerson

