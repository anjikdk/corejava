package oops;

public class Child extends Parent
{
	public static void main(String[] args) 
	{
		Parent p = new Child(); // auto upcasting
		
		p.getName();
	}
	
	public void getName() // Method overridding
	{
		System.out.println("Child name");
	}
}
