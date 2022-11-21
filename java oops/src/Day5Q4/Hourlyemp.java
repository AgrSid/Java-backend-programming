package Day5Q4;

public class Hourlyemp {
	double hours;
	double wages;
	public double getWages() {
		return wages;
	}
	public void setWages(double wages) {
		this.wages = wages;
	}
	public Hourlyemp(double hours, double wages) {
		super();
		this.hours = hours;
		this.wages = wages;
	}
	double salary() {
		
		double salary= hours * wages;
		
		return salary;
		
	}
	@Override
	public String toString() {
		return "Hourlyemp [hours=" + hours + ", wages=" + wages + "]";
	}
}
