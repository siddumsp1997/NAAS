import java.io.Serializable;

/**
 * 
 */

/**
 * @author Aniket
 *
 */
public class Magazine implements Serializable {
private String Title;
private int Code;
private String Publisher;
private String Type;
private double Cost;

public Magazine(String Title, int Code, String Publisher, String Type, double Cost){
	this.Title = Title;
	this.Code = Code;
	this.Publisher = Publisher;
	this.Type = Type;
	this.Cost = Cost;
}
public void SetTitle(String Title){
    this.Title = Title;
}
public void SetCode(int Code){
    this.Code = Code;
}
public void SetPublisher(String Publisher){
    this.Publisher = Publisher;
}
public void SetType(String Type){
    this.Type = Type;
}
public void SetCost(double Cost){
    this.Cost = Cost;
}

public String GetTitle(){
    return Title;
}
public int GetCode(){
    return Code;
}
public String GetPublisher(){
    return Publisher;
}
public String GetType(){
    return Type;
}
public double GetCost(){
    return Cost;
}

}