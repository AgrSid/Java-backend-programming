package Day6Q2;

public class Nestedtry {
public static void main(String[] args) {
	try {
		try {
			try {
				int a=10/0;
				
			    }
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic exc found");
			}
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array out of bound exc found");
		}
	}
	catch(NullPointerException e) {
		System.out.println("null pointer exc");
		
	}
	catch(Exception e) {
		System.out.println("exc is handled");
	}

	}}
