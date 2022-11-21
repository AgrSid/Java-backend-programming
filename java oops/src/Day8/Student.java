package Day8;

import java.util.ArrayList;
import java.util.Collections;

class Student1 implements Comparable<Student1> {  
    public String name;  
  public Student1(String name) {  
    this.name = name;  
  }  
  public int compareTo(Student1 person) {  
    return name.compareTo(person.name);  
      
  }   
}  
public class Student {  
  

private char[] name;

public Student(String string) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {  
      ArrayList<Student> al=new ArrayList<Student>();  
      al.add(new Student("Hari"));  
      al.add(new Student("Saurav"));  
      al.add(new Student("Mukesh"));  
      al.add(new Student("Tahir"));  
      
      
     
    for (Student s : al) {  
      System.out.println(s.name);  
    }  
  }  

}  
 