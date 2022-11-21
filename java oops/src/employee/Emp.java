package employee;

import java.util.Scanner;

public class Emp {
int empno;
String empname;
String desig;
String dept;
int salary;
public int sal;



public void readEmpdata() {
	Scanner s= new Scanner(System.in);
	empno=s.nextInt();
	empname=s.next();
	desig=s.next();
	dept=s.next();
	salary=s.nextInt();
	
}
public void displayEmpdata() {
	System.out.println(empno);
	System.out.println(empname);
	System.out.println(desig);
	System.out.println(dept);
	System.out.println(salary);
}
public static void main(String []args)
{
	Emp e1= new Emp();
	
	
	e1.readEmpdata();
	e1.displayEmpdata();
	
}
}
