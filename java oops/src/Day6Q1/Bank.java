package Day6Q1;

public class Bank {
int accid;
String sname;
int amount;

public Bank(int accid, String sname, int amount) {
	super();
	this.accid = accid;
	this.sname = sname;
	this.amount = amount;
}

@Override
public String toString() {
	return "Bank [accid=" + accid + ", sname=" + sname + ", amount=" + amount + "]";
}
public int getAccid() {
	return accid;
}
public void setAccid(int accid) {
	this.accid = accid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}

}
