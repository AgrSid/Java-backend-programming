package employee;

import java.util.Scanner;

public class Electricitybill {
int customerno;
String cname;
float unit;


 public  void readData() {
	Scanner s=new Scanner (System.in);
	customerno =s.nextInt();
	cname=s.next();
	unit=s.nextFloat();

}
 public void dataDisplay() {
	 System.out.println(customerno);
	 System.out.println(cname);
	 System.out.println(unit);
	
	
	
 }
 public void computebill() {
	 double bill;
	 if (unit<=100)
			 {	 bill=1.2*unit;
			 }
	 else if (unit <=300)
	 {
		bill= 1.2*100+2*(unit-100);
	 }
	 else if (unit<=600)
	 {bill= 120+400+(unit-300)*3;
	 }
	 else 
	 {
		 bill=120+400+900+(unit-600)*5;
		 
	 }
	 System.out.println(bill);
	 }
 
public static void main(String []args)
{
	Electricitybill e=new Electricitybill();
	e.readData();
	e.dataDisplay();
	e.computebill();
}
}