package Day5Q4;

public class Comissionemp {
double sales;
double comission;
double salary() {
	double salary= sales*0.4+comission;
	return salary;
}
public double getSales() {
	return sales;
}
public void setSales(double sales) {
	this.sales = sales;
}
public double getComission() {
	return comission;
}
public void setComission(double comission) {
	this.comission = comission;
}
public Comissionemp(double sales, double comission) {
	super();
	this.sales = sales;
	this.comission = comission;
}
@Override
public String toString() {
	return "Comissionemp [sales=" + sales + ", comission=" + comission + "]";
}

}
