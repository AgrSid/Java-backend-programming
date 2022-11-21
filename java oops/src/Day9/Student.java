package Day9;

import java.io.Serializable;

public class Student implements Serializable{
@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", subject=" + subject + "]";
	}

int id;
String name;
float marks;
String subject;
public Student (String name, int id, float marks, String subject) {
    this.name = name;
    this.marks =marks ;
    this.id =id ;
    this.subject=subject;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public float getMarks() {
    return marks;
}

public void setMarks(Float marks) {
    this.marks = marks;
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}


}
