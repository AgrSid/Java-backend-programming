package Day5Q2;

public class Car {
void speed() {
	System.out.println("speed is ");
}}
public class Maruti extends Car{
	void speed() {
		System.out.println("speed is 60kmph");
	}
}
public class Alto extends Car{
	void speed() {
		System.out.println("speed is 70kmph");
	}
}
public class Breeza extends Car{
	void speed() {
		System.out.println("speed is 80kmph");
	}

public static void main(String[] args){  
	Car c;
	c= new Maruti();
	c.speed();
	c=new Alto();
	c=new Breeza();
	
	c.speed();
	c.speed();
}

}
