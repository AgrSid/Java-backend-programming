package Day4Q4;

public class Authormain {
	public static void main(String []args)
	{
	Author ob= new Author("aay","sasisil" , false);
	Book obj=new Book(ob,"sid" , 10, 554);
	obj.dispbook();
	ob.dispauthor();
	obj.toString();
	ob.toString();}
}
