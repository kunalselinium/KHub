package Polymorphism;

public class OverRiddingParent 
{

	public int arthmetic(int a,int b)
	{
		int resp=a+b;
		System.out.println("Parent result is "+resp);
		return resp;
	}
	public static void method1(){
		System.out.println("this is static parent method");
	}
	public final void method2(){
		System.out.println("this is final parent method");
	}
	
	public final static void method3(){
		System.out.println("this is final static parent method");
	}
	
	public static void main(String[] args) {
		OverRiddingParent obj1=new OverRiddingParent();
		obj1.method1();
		//obj.arthmetic(5, 2);
		//System.out.println("Child result is "+rec);
	}
}
