package Practice;

import java.util.Stack;

public class Reversestack {
public static String Reverse(String str) {
	Stack<Character> st=new Stack<>();
   
    char[] chars=  str.toCharArray();
    for(char c:chars)
    	st.push(c);
    for (int i=0;i<str.length();i++)
    {	chars[i]=st.pop();
    }
    
    return new String(chars);
    }
    
public static void main(String[] args) {
	String str="absc";
	
	System.out.println(str);
	System.out.println(str.charAt(1));
	System.out.println(Reverse(str));
}	
}

