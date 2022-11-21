package Day5Q4;

import java.util.Arrays;

public class Payroll {
	String[] employee = { "jits", "chi", "rags", "sid" };

	void paysalary() {
          
	}

	@Override
	public String toString() {
		return "Payroll [employee=" + Arrays.toString(employee) + "]";
	}

	public String[] getEmployee() {
		return employee;
	}

	public void setEmployee(String[] employee) {
		this.employee = employee;
	}

	public Payroll(String[] employee) {
		super();
		this.employee = employee;
	}
}
