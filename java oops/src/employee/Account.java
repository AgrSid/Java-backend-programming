package employee;

public class Account {
int accno;
String accname;
float amount;

void insert(int a,String n,float amt){  
accno=a;  
accname=n;  
amount=amt;  
}  
void deposit(float amt){  
amount=amount+amt;  
System.out.println(amt+" deposited");  
}  
//withdraw method  
void withdraw(float amt){  
if(amount<amt){  
System.out.println("Insufficient Balance");  
}else{  
amount=amount-amt;  

}  
public interest(float amt) {
	
}
}  
}
