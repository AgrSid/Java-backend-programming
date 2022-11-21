package Day4Q3;

public class Hourlyemp {
int salary;
Hourlyemp(int salary) {
this.salary=salary;	
}
public int getsalary() {
	return salary;
}
public void setsalary(int newsalary) {
	
	this.salary=newsalary;
}
public void computegrosspay(int salary) {
	double grosspay=salary+salary*(.01*35);
	System.out.println("gross salary of Temporary emp"+grosspay);
}
public void computenetpay(int i) {
	double netpay=  (salary + salary*(.01*85))-(salary + salary*(.01*85)*.4);
	System.out.println("net pay of Temporary emp"+netpay);
}
public void print() {
	
	System.out.println("Temporary emp"+salary);
	computegrosspay(getsalary());
	computenetpay(getsalary());
}

}
