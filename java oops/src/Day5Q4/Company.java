package Day5Q4;

public class Company {
	public static void main(String[] args){  
	Hourlyemp h= new Hourlyemp(100, 100);
	System.out.println(h.toString());
	System.out.println("salary is "+ h.salary());
	
	Salariedemp s= new Salariedemp(20000);
	System.out.println(s.toString());
	System.out.println("salary is "+ s.salary());
	
	Comissionemp c= new Comissionemp(150,10000);
	System.out.println(c.toString());
	System.out.println("salary is "+ c.salary());
	}
}
