import java.io.Serializable;


public class Manager implements Serializable{
private String UserID;
private String Password;

public Manager(String UserID, String Password){
this.UserID = UserID;
this.Password = Password;
}
public String GetUserID(){
	return UserID;
}
public String GetPassword(){
	return Password;
}

public void SetUserID(String UserID){
	this.UserID = UserID;
}
public void SetPassword(String Password){
	this.Password = Password;
}
public void SeeMonthlyReport(NAAS window){
	window.SeeMonthlyReport(this);;
}
public int Login(String UserID, String Password, DeliveryDatabase deliveryDatabase)
{  
	// 
	
	int flag=-1;
	
	if(deliveryDatabase.manager.UserID.equals(UserID))
	{
		if(deliveryDatabase.manager.Password.equals(Password))
		{
			flag=1;
		}	
	}
	
  return flag;
}
public void SeePayRoll(int index, DeliveryDatabase deliveryDatabase  ){
	System.out.println(deliveryDatabase.ListDeliveryPerson.get(index).getmonthlyPayroll());
}
public void BillReminder(NAAS window){
window.BillReminder(this);
}
}
