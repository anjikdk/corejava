package exception;

public class ArrayIndexOutofBoundExcpetionExample {

	public static void main(String[] args) {
		
		System.out.println("main method start");
		String[] s = {"abc","xyz","aaa"};
		
		try
		{
			String s1 = s[10];
			System.out.println(s1);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
		
		System.out.println("main method end");
	}
}
