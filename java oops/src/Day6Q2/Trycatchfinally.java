package Day6Q2;

public class Trycatchfinally {
	public static void main(String[] args) {
		
		
		try {
			int d[]=new int [5];
		 d[5]= (30/0);
		System.out.println(d[10]);
			
			
		}
		catch(NullPointerException e) {
			System.out.println("null pointer exc");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of bound exception");
		}
		catch(ArithmeticException e) {
			System.out.println("arithmetic exception ");
		}
		catch(Exception e)
		{
			System.out.println("exception is handled");
		}
		finally {
			System.out.println("this will execute in final block");
		}
		System.out.println("rest of code");
	}
}
