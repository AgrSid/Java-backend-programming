package Day8;

import java.util.LinkedList;

public class Linklist {
	public static void main(String[] args) {
		
		LinkedList <Integer>list  = new LinkedList <>();
		list.add(100);
		list.add(1500);
		list.add(1,220);
		list.add(750);
		list.addFirst(200);
		list.addLast(300);
		for (Integer e: list)
			System.out.println(e);
		for (Integer e: list)
			System.out.println(e);
		list.set(1,440);
		for (Integer e: list)
			System.out.println(e);
		list.remove(1);
		for (Integer e: list)
			System.out.println(e);
		list.removeFirst();
		for (Integer e: list)
			System.out.println(e);
		list.removeLast();
		for (Integer e: list)
			System.out.println(e);
		list.add(1000);
		list.add(500);
		list.add(600);
		
	  ((Object) list).reverse();
		for (Integer e: list)
			System.out.println(e);
	}}

