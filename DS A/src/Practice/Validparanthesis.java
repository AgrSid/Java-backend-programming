package Practice;

import java.util.Stack;

public class Validparanthesis {
	static boolean isValid (String s) {
	Stack<Character> st= new Stack<>();
	for(char c:s.toCharArray()) {
		if(c=='('||c=='{'||c=='[') {
			st.push(c);
			}
			else {
				if(st.isEmpty()) {
					return false;
				}
				else {
					char top=st.peek();
					if((c==')'&&top=='(')||
					(c==']'&&top=='[')||
					(c=='}'&&top=='{')) {
						st.pop();					
				}
			}
		}
	}
	return false;
	
}
public static void main(String[] args) {
   String s="({})";
		   if (isValid(s)) {
			   System.out.println("valid");
		   }
   
   
}
}
