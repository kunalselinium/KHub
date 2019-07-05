package pkg1;

public class ThisConstructor {
	
	public ThisConstructor() {
		this(3,1,9);
		System.out.println("This is default constructor");
		
	}
	
	public ThisConstructor(int a)
	{
		this(5,8);
		System.out.println("This is 1 parmeterized constructor");
	}
	
	public ThisConstructor(int a,int b)
	{
		this();
	System.out.println("This is 2 parameterized constructor");	
	}

	public ThisConstructor(int a,int b,int c)
	{
		System.out.println("This is 3 parameterized constructor");
	}
	
	public static void main(String[] args) {
		ThisConstructor thcon=new ThisConstructor(2);
				
	}
}
