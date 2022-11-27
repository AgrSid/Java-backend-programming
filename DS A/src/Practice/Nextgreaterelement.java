package Practice ;

import java.util.Stack;

public class Nextgreaterelement {
static int [] nextgreater(int[] arr) {
    int []result=new int[5];
    Stack <Integer> st= new Stack<>();
    for(int i=arr.length-2;i>=0;i--)
    {
    	if(!st.isEmpty()) {
    		while(!st.isEmpty()&&st.peek()<=arr[i]) {
    			st.pop(); }}   		
    	if(st.isEmpty()) {
    		result[i]=-1;
    		
    	}
    	else {
    		result[i]=st.peek();
    		
    	}st.push(arr[i]);
    	}return result;
	
}
public static void main(String[] args) {
	int arr[]= {4,7,3,4,8,1};
	for(int i:arr)
	    System.out.println(i);
	int[] result = nextgreater( arr);
	for(int i:result)
		System.out.println(i);
}
}
