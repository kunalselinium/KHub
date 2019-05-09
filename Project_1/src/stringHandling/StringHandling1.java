package stringHandling;
//Reverse String
public class StringHandling1 {

	public StringHandling1()
	{
		String s="my name is deepak";
		//System.out.println(s);
		String s1[]=s.split(" ");
		int l=s1.length;
		System.out.println("Total Words "+l);
		for(int i=l-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
		
		
	}
	public static void main(String[] args) {
		new StringHandling1();
	}
}
