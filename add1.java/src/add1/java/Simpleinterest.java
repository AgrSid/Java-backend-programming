package add1.java;

public class Simpleinterest {
public static void main(String[] args)
{  float p=1000,r=5,t=2;
	interest(p,r,t);
}
public static void interest(float p,float r,float t){

	float i;
	i=p*r*t;
	i=i/100;
	
	System.out.println(i);
}
}
