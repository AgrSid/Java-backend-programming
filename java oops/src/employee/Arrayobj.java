package employee;

public class Arrayobj {
	int id;
	String name;
	
	void read(int id, String name) {
		this.id=id;
		this.name=name;
		
	}
	void display() {
		System.out.println(id +name);
	}
	
	public static void main(String []args)
	{
		Arrayobj []a= new Arrayobj[3];
		for(int i=0;i<a.length;i++)
		{
			a[i]=new Arrayobj();
			a[i].read(101,"sid");
			a[i].display();
			
		}
	}
}
