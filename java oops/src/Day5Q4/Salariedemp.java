package Day5Q4;

public class Salariedemp {
	double basicsalary;
	double salary() {
		double salary= basicsalary*1.5;
		
		return salary;
	}
	public Salariedemp(double basicsalary) {
		super();
		this.basicsalary = basicsalary;
	}
	@Override
	public String toString() {
		return "Salariedemp [basicsalary=" + basicsalary + "]";
	}
	
	public double getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(double basicsalary) {
		this.basicsalary = basicsalary;
	}
}
