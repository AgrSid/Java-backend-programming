package Day4Q3;

public class Salaryemp {
int salary;
private int grosspay;
Salaryemp(int salary) {
this.salary=salary;	
}

public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getGrosspay() {
	return grosspay;
}

public void setGrosspay(int grosspay) {
	this.grosspay = grosspay;
}
public void computegrosspay(int i) {
	double grosspay=salary+salary*(.01*35);
	System.out.println("gross salary of Salaried emp"+grosspay);
}
public void computenetpay(int i) {
	double netpay1= (salary + salary*(.01*99))-(salary + salary*(.01*99)*.4);
	System.out.println("net pay of Salaried emp"+netpay1);
}

public void print() {
	System.out.println("Temporary emp"+salary);
	computegrosspay(getSalary());
	computenetpay(getSalary());
}
}
