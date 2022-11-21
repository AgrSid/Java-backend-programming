package Day7;

public class Employe {
String name;
int sid;
int marks;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public Employe(String name, int sid, int marks) {
	super();
	this.name = name;
	this.sid = sid;
	this.marks = marks;
}
@Override
public String toString() {
	return "Employe [name=" + name + ", sid=" + sid + ", marks=" + marks + "]";
}

}
