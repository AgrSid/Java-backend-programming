package Day6Q2;

public class Tryfinally {
public static void main(String[] args) {
	try {
		int a=10/0;
	}
	catch(NullPointerException e){  
		System.out.println(e);  
		}    
	finally {
		System.out.println("this will execute in final block");
	}
	System.out.println("rest of code");
}
}
