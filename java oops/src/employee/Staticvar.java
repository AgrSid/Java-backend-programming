package employee;

public class Staticvar {
	 int rollno;//instance variable  
	   String name;  
	   static String college ="ITS";//static variable  
	   //constructor  
	   Staticvar(int r, String n){  
	   rollno = r;  
	   name = n; 
	   } 
	   void display (){System.out.println(rollno+" "+name+" "+college);}  
	      
	   public static void main(String args[]){  
		   Staticvar s1 = new Staticvar(111,"Karan");  
		   Staticvar s2 = new Staticvar(222,"Aryan");  

	   s1.display();
	   s2.display();
	   }
}
