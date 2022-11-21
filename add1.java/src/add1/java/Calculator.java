package add1.java;

public abstract class Calculator {
	public static void main(String []args) {
		int n=1;
		calc(n);
	}
	public static void calc(int k)
	{int a = 10,b = 10,cal=0;
		switch(k)
		{case 1:
			cal=a+b;
			break;
		case 2:
			cal=a-b;
			break;
			
		case 3:
			cal=a*b;
			break;
			
		case 4:
			cal=a/b;
			break;
		}
		System.out.println(cal);
			
	
	}
}

