package abstract1;

public abstract class AbstractClass {
	int a=10;
	public AbstractClass(){
		System.out.println("Hello");
	}
	public abstract void method1();
	public void method2(){
		System.out.println("non abstract method");
	}
	
	public static void main(String[] args) {
		//AbstractClass ac=new AbstractClass();
	}
}