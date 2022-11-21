package Day4Q4;

public class Author {
String name;
String email;
boolean gender;
Author(String name,String email,boolean gender)
{
	this.name=name;
	this.email=email;
	this.gender=gender;
	
}
public String getname() {
	return name;
}
public void setname(String newname) {
	this.name= newname;
	
}
public String  getmail() {
	return email;
}
public void setmail(String newmail) {
	 this.email=newmail;
 }
 public boolean getgender() {
	return gender;
	 
 }
 public void dispauthor() {
	 System.out.println(name+email+gender);
 }

}

