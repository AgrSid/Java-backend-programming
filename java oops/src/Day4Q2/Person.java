package Day4Q2;

public class Person {
int age;
String name;
void readPerson(String name, int age) {
	this.age=age;
	this.name=name;
}
void display() {
	System.out.println(age+name);
}
}
