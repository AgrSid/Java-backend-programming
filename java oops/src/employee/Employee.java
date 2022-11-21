package employee;

public class Employee {
int ssn;
String firstname;
String lastname;

Employee(int ssn,String firstname,String lastname){
	this.ssn=ssn;
	this.firstname=firstname;
	this.lastname=lastname;
}
public int getssn(){
	return ssn;
}
public void setssn(int newssn){
	this.ssn=newssn;
}
public String getfirstname(){
	return firstname;
	
}
public String getlastname(){
	return lastname;
}
public void setfirstname(String newfirstname){
	this.firstname=newfirstname;
}
public void setlastname(String newlastname){
	this.lastname=newlastname;
}
void print(){
	System.out.println(ssn+firstname+lastname);
		}
}
