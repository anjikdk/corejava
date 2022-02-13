package exception;

public class NullpointerExceptionExample {

	public static void main(String[] args) {

		System.out.println("main method start");
		String s = null;
		
		try 
		{
			int k = s.length();
			System.out.println(k);
		}
		catch (ArithmeticException e) {
			System.out.println("1");
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			System.out.println("2");
			e.printStackTrace();
		}

		System.out.println("main method end");
	}
}
