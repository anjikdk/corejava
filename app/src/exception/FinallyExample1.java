package exception;

public class FinallyExample1 {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Opening connections");
			int i = 10/5;
			System.out.println(i);
			
		}
		finally
		{
			System.out.println("closing connections in finally block");
		}
	}
}
