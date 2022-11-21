package employee;

import java.util.Scanner;

public class Student {
int id;
String name;
int mark;
String result;


public  void readData() {
	Scanner s=new Scanner (System.in);
	id =s.nextInt();
	name=s.next();
	mark=s.nextInt();

}
public void dataDisplay() {
	 System.out.println(id);
	 System.out.println(name);
	 System.out.println(mark);
	
}
	public void findresult() {
		if (mark>=40) {
			result ="Pass";
		}
		else {
			result="Fail";
		}
		 System.out.println(result);	
	}
	 
	 public static void main(String []args)
	 {
	 	Student e=new Student();
	 	e.readData();
	 	e.dataDisplay();
	 	e.findresult();
	 }
}
