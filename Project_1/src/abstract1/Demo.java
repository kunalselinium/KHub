package abstract1;

 abstract class Demo {

	public int a;
	Demo(){
		a=10;
	}
	abstract public void set();
	abstract final public void get();
}

 class Test extends Demo{

	
	public void set(int a) {
		
		this a=a;
	}

	
	 final void get() {
		System.out.println("a= "+a);
		
	}
	
	public static void main(String[] args) {
		Test obj=new Test();
		obj.set(20);
		obj.get();
		
	}

	
}
