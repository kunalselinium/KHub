package abstract1;

public class AbstractChildClass extends AbstractClass{

	
	public void method1() {
		System.out.println("abstract method body");
		
	}
	
	public void method() {
	}
	public static void main(String[] args) {
		AbstractClass ac=new AbstractChildClass();
		//AbstractChildClass ac=new AbstractChildClass();
		ac.method1();
		ac.method2();
		System.out.println(ac.a);
	}
	
	

}
