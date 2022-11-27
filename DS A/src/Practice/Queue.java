package Practice;

import java.util.NoSuchElementException;

public class Queue {
private ListNode front;
private ListNode rear;
private static int length;
public class ListNode{
	private int data;
	private ListNode next;
	public ListNode(int data) {
		super();
		this.data = data;
		
	}
	
}
public boolean isEmpty(){
	return length==0;
}
public Queue( int length) {
	

	this.length = length;
}
public void enque(int data){
	ListNode temp=new ListNode(data);
	if(isEmpty()) {
		front =temp;
	}
	else {
	rear.next=temp;
	}rear=temp;
	length++;
}
public void print() {
	ListNode current=front;
	while(current!=null) {
		System.out.println(current.data);
		break;
	}
	current=current.next;
}
public int deque() {
	if(isEmpty()) {
		throw new NoSuchElementException("not element");
	}
	
		int result = front.data;
	    front = front.next;
	    if(front ==null)
	         rear=null;
		length--;
		return result;
	}

public static void main(String[] args) {
	Queue q=new Queue(length);
	q.enque(10);
	
	q.print();
	q.deque();
	q.print();
}

}
