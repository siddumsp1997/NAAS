import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;


public class Customer implements Serializable {
private String Name;
private String CustomerID;
private String Address;
private int NoOfSubscription;
private CustomerSubscriptionList Subscriptions;
private double Bill;
Date DateTillBillPaid;

public Customer(String Name, String CustomerID, String Address){
	this.Name = Name;
	this.CustomerID = CustomerID;
	this.Address = Address;
	this.NoOfSubscription = 0;
	this.Subscriptions = new CustomerSubscriptionList(CustomerID);
	this.Bill = 0.0;
	this.DateTillBillPaid = new Date();
	
}
public String GetName(){
    return Name;
}
public String GetCustomerID(){
    return CustomerID;
}
public String GetAddress(){
    return Address;
}
public int GetNoOfSubscription(){
    return NoOfSubscription;
}
public CustomerSubscriptionList GetSubscriptions(){
    return Subscriptions;
}
public double GetBill(){
    return Bill;
}
public Date GetDateTillBillPaid(){
	return DateTillBillPaid; 
}

public void SetName(String Name){
    this.Name = Name;
}
public void SetCustomerID(String CustomerID){
    this.CustomerID = CustomerID;
}
public void SetAddress(String Address){
    this.Address = Address;
}
public void SetNoOfSubscription(int NoOfSubscription){
    this.NoOfSubscription = NoOfSubscription;
}
public void SetSubscriptions(CustomerSubscriptionList Subscriptions){
    this.Subscriptions = Subscriptions;
}
public void SetBill(double Bill){
    this.Bill = Bill;
}

public void modifySubscriptions(Magazine magazine, DeliveryDatabase deliveryDatabase){
	this.GetSubscriptions().getListSubscription().add(magazine);
}
public void payBill(double inAmount){
	DateTillBillPaid.setTime(DateTillBillPaid.getTime() + 10 * 1000 * 60 * 60 * 24); //10 days
	DateTillBillPaid.setTime(DateTillBillPaid.getTime() + 10 * 1000 * 60 * 60 * 24);//10 days
	DateTillBillPaid.setTime(DateTillBillPaid.getTime() + 10 * 1000 * 60 * 60 * 24);//10 days

}
public void ComputeBill(){
	Bill = 0.0;
	for(Magazine temp : this.Subscriptions.getListSubscription()){
		Bill += temp.GetCost()*30;
	}
}
}
