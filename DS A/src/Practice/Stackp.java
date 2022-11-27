package Practice;

import java.util.Stack;

public class Stackp {
private ListNode top;
private int length;
public class ListNode{
	private int data;
	private ListNode next;
	public ListNode(int data) {
		this.data=data;
		
	}
	public void push(int data) {
		ListNode temp=new ListNode(data);
		temp.next=top;
		top=temp;
		length++;
		
	}
}
public static void main(String[] args) {
	Stack s=new Stack<Integer>();
	s.push(15);
	s.push(10);
	s.pop();
	s.pop();
	System.out.println(s);
}
}
