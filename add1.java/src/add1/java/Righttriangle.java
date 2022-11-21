package add1.java;

public class Righttriangle {
public static void main(String []args) {
	int n=4;
	right(n);
}
	
	public static void right(int k) {
		
	for (int i=1;i<k;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
			
		}System.out.println(" ");
	}
}
}
