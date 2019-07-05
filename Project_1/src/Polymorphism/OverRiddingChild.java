package Polymorphism;

public class OverRiddingChild extends OverRiddingParent
{
	
	public int arthmetic(int x,int y)
	{
		int resc=x-y;
		System.out.println("Child result is "+resc);
		super.arthmetic(5, 3);
		return resc;
	}
	
	
	public static void method1(){
		System.out.println("this is static child method");
	}
	
	

	public static void main(String[] args) {
		OverRiddingChild obj=new OverRiddingChild();
		obj.method1();
		OverRiddingParent obj1=new OverRiddingParent();
		obj1.method1();
		//obj.arthmetic(5, 2);
		//System.out.println("Child result is "+rec);
	}

}
