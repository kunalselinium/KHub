package stringHandling;
// Reverse word in String
public class StringHandling2 {
	
	
	public StringHandling2()
	{
		String s="my name is deepak";
		String[] s1=s.split(" ");
		//System.out.println(s1);
		int l=s1.length;
		for(int i=0;i<l;i++)
		{
			String s2=s1[i];
			int l1=s2.length(); 
			
			for(int k=l1-1;k>=0;k--)
			{
		System.out.print(s2.charAt(k));	
			}
			System.out.print(" ");
		}
		
	}
	
	public static void main(String[] args) {
		new StringHandling2();
	}

}
