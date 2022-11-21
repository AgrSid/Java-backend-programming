package Day6Q1;

public class Bankacc extends Bank implements Creditcards  {


public Bankacc(int accid, String sname, int amount) {
		super(accid, sname, amount);
		// TODO Auto-generated constructor stub
	}
public void rupees() {
	System.out.println("payment in rupees"+amount);	
}
public void dollars() {
	System.out.println("payment in dollars"+amount);	
}
public void pounds() {
	System.out.println("payment in pound"+amount);
}

}
