package add1.java;

public class Largest {
	public static void main(String []args)
	{
		int j=1,k=9,l=8,largem;
		largem=large(j,k,l);
		System.out.println(largem);
		
	}
	public static int large(int a,int b,int c) {
		if(a>=b&& a>=c)
			return a;
		else if (b>=a&& b>=c)
			return b;
		else
			return c;
		}
	}
