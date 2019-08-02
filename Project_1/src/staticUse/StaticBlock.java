package staticUse;

public class StaticBlock {
	
	public StaticBlock(){
	System.out.println("This is default constructor");
	}
	static{
		System.out.println("This is static block1");
		int i=5;
		System.out.println("Value of i: "+i);
	}
	
	static{
		System.out.println("This is static block2");
		int i=10;
		System.out.println("Value of i: "+i);
	}
	
	public static void main(String[] args) {
		//System.out.println("This is main method");
		new StaticBlock();
	}

}
