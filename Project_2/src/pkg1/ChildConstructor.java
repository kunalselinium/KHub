package pkg1;

public class ChildConstructor extends ParentConstructor
{


	public ChildConstructor()
	{
		super(25,45);
		System.out.println("Default Child Constructor");
	}
	
	public ChildConstructor(int a) {
		this(8,6);
		System.out.println("1 Parameter Child Constructor");
	}
	
	public ChildConstructor(int a,int b) {
		this();
		System.out.println("2 Parameter Child Constructor");
	}
	
	public ChildConstructor(int a,int b,int c) {
		this(5);
		System.out.println("3 Parameter Child Constructor");
	}
	
	public static void main(String[] args) {
		new ChildConstructor(2,1,3);
	}
}
