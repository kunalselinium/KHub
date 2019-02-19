package staticUse;

public class StaticVariable {
	
	 static int a;
	
	public void method1()
	{
		a=a+2;
	    System.out.println(a);
	}
	
	public void method2()
	{
		a=a+3;
		System.out.println(a);
	}

	public static void main(String[] args) {
		int b=StaticVariable.a;
		System.out.println(b);
		StaticVariable obj1=new StaticVariable();
		obj1.method1();
		StaticVariable obj2=new StaticVariable();
		obj2.method2();
		obj2.method2();
	
		
	}
   
}
