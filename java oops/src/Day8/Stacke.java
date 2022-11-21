package Day8;

import java.util.Stack;

public class Stacke {

public static void main(String[] args) {
	Stack <Integer>s=new Stack <>();

s.add(10);
s.add(2);
s.add(4);
for (Integer e : s)
	System.out.println(e);
s.pop();
for (Integer e : s)
	System.out.println(e);
s.push(20);

}
}