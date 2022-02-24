package application;

interface A
{
	public void test();
}

public class IsAnagram {
	
	public static void main(String[] args) {
		
		System.out.println(isAnagram("abc", "cbx"));
	}

	public static boolean isAnagram(String s1, String s2)
	{
		boolean b = false;
		if(s1.length() == s2.length())
		{
			for(int i=0; i<s1.length(); i++)
			{
				if(s2.contains(""+s1.charAt(i)))
				{
					return true;
				}
				else
				{
					return b;
				}
			}
		}
		return b;
	}
}
