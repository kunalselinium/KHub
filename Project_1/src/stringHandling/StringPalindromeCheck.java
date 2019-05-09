package stringHandling;

import java.util.Scanner;

public class StringPalindromeCheck {
	
	public StringPalindromeCheck()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String ");
		String s =sc.next();
		//System.out.println("Enter String is "+s);
		int l=s.length();
		int i;
		String s1="S";
		for(i=l-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
			s1=String.valueOf(s.charAt(i));	
			
			if (s.equals(s1))
			{
				System.out.println("Entered String is Palindrome String");
			}
			else
			{
				System.out.println("Entered String is not a Palindrome String");
			}
		}
		
		
		
		//char s1 =s.charAt(i);
		//System.out.println(s1);
			
	}
	
	public static void main(String[] args) {
		new StringPalindromeCheck();
	}

}
