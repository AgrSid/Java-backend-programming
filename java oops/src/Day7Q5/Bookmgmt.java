package Day7Q5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Bookmgmt {
public static void reduce(HashMap<Integer,Book> hm) {
for(Map.Entry<Integer, Book> m:hm.entrySet()){
	int key = m.getKey();
    Book b=m.getValue();  
     System.out.println(b.getAuthor() + " " + b.getPrice() * 0.9);
}    
}
}
//	public static void display(HashMap<Integer,Book> hm){
//		for(Map.Entry<Integer,Book> m:hm.entrySet())
//		{	System.out.println(m.getKey());
//		
//		Book b = m.getValue();
//	System.out.println(b.toString());
//		}	
//		}
//
//	public static void dispkey(HashMap<Integer, Book> hm) {
//		for(Map.Entry<Integer,Book> m:hm.entrySet())
//		{	System.out.println(m.getKey());
//		Scanner s=  new Scanner(System.in);
//		int key=s.nextInt();
//		Book b = m.getValue();
//	System.out.println(b.toString());
//		}
//		
//	}

	
