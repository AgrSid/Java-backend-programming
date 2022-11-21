package Day4Q1;

public class Savings extends Account2{
 public Savings(int accno, float amount, int totalbal) {
		super(accno, amount, totalbal);
		// TODO Auto-generated constructor stub
	}


double interestrate=0.2;
 
	
	public void add() {
		totalbal*=interestrate;
		System.out.println(totalbal);
	}
}
