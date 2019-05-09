package stringHandling;
//Reverse word in Reverse String
public class StringHandling3 {
	
	public StringHandling3()
	{
		String s="my name is deepak";
		String[] s1=s.split(" ");
		int l=s1.length;
		for (int i=l-1;i>=0;i--)
		{
			String s2=s1[i];
			int l1=s2.length();
			for (int k=l1-1;k>=0;k--)
			{
				System.out.print(s2.charAt(k));
			}
			System.out.print(" ");
		}
	}
	
	public static void main(String[] args) {
		new StringHandling3();
	}

}
