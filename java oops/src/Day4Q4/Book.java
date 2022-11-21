package Day4Q4;

public class Book {
private Author auth;
private String name;
private double price;
private int qty;
Book (Author auth,String name, double price,int qty)
{   this.auth=auth;


	this.name=name;
name="sid";
	this.price=price;
	this.qty=qty;
	
}
public String getname() {
	return name;
	}
public Author getauth(){
	return auth;
}
public double getprice() {
return price;
}
public void setprice(double newprice) {
	this.price=newprice;
}
public int getqty() {
	return qty;
	}
public void setqty(int newqty) {
	this.qty=newqty;
}
public void dispbook() {
	System.out.println(auth+name+price+qty);
}

}
