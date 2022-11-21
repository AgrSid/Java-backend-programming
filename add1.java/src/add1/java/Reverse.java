package add1.java;

public class Reverse {
public static void main(String []args)
{	rev(123);
	}

public static void rev(int n) {
	while(n>0)
	{int r,s=0;
	r=n%10;
	n=n/10;
	s=s*10+r;
	}
	char[] s = null;
	System.out.println(s);
}}