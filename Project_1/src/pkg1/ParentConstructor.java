package pkg1;

public class ParentConstructor {

	public ParentConstructor() 
	{
	    this(9,3,8);
		System.out.println("Default Parent constructor");	
	}
	
	public ParentConstructor(int a) 
	{
	    this();
		System.out.println("1 Parameter Parent constructor");	
	}
	
	public ParentConstructor(int a,int b)
	{
		this(1);
	    System.out.println("2 Parameter Parent constructor");	
	}
	
	public ParentConstructor(int a,int b,int c)
	{
	
		System.out.println("3 Parameter Parent constructor");	
	}
		
}
