package Practice;

import java.util.Stack;

public class Stackp {
private ListNode top;
private int length;
public class ListNode{
	private int data;
	private ListNode next;
	public ListNode(int data) {
		super();
		this.data = data;
	}
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length==0;
		
	}
	public void Stackp() {
	 length=0;
		top =null;
	}
	public void pushe(int data) {
		ListNode temp= new ListNode(data);
	    temp.next=top;
	    top=temp;
	    length++;
	}	}
	public static void main(String[] args) {
      
      Stack st=new Stack();
      st.push(15);
      st.push(56);
	}


}
