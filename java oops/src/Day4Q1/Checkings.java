package Day4Q1;

public class Checkings extends Account2 {
public Checkings(int accno, float amount, int totalbal) {
		super(accno, amount, totalbal);
		// TODO Auto-generated constructor stub
	}


int fee=50;


void deductfee() {
	totalbal-=fee;
	System.out.println(totalbal);
}
}
