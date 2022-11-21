package Day4Q1;

public class Account2 {
 int accno;
 float amount;
 int totalbal;

 
 public Account2(int accno, float amount, int totalbal) {
	
	this.accno = accno;
	this.amount = amount;
	this.totalbal = totalbal;
}
public void  display() {
	System.out.println(accno+amount+totalbal);
}
 
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
public int getTotalbal() {
	return totalbal;
}
public void setTotalbal(int totalbal) {
	this.totalbal = totalbal;
}

}
