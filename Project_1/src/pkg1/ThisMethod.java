package pkg1;

public class ThisMethod {
	
	public void method1()
	{
		this.method3();
		System.out.println("This is method 1");
		this.method4();
		this.method2();
	}
	public void method2()
	{
		System.out.println("This is method 2");
	}
	public void method3() {
		System.out.println("This is method 3");
	}
	public void method4() {
		System.out.println("This is method 4");
	}
	
	public static void main(String[] args) {
		ThisMethod thmtd=new ThisMethod();
		thmtd.method1();
	}

}
