package add1.java;

public class Evenodd {
public static void main(String []args)
{
	int n=20;
	String result=findoddeven(n);
	System.out.println(result);
	
}
public static String findoddeven(int num){
	String result;
	int val=num%2;
	if(val==0)
		result ="even";
	else
		result= "odd";
	return result;
}
}
