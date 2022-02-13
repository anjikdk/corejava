package exception;

public class TryWithMultipleCatchExample {

	public static void main(String[] args) {
		
		String str = "abc";
		try
		{
			// Here i am writing some logic
			
			int i = 10;
			int j = 5;
			
			int k = i/j;
			System.out.println(k);
			
			int len = str.charAt(5);
			System.out.println(len);
			
		}
		catch (ArithmeticException e) {
			
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		catch (RuntimeException e) {
			System.out.println("Runtime");
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("main method end");
	}
}
