package SuperMethod;

public class ChildMethod extends ParentMethod 

{
	
	public void chmethod() 
	{
		char cc=super.c='A';
		int ca= super.a=24;
		System.out.println(ca);
		super.prmethod();
		System.out.println(cc);
		System.out.println("I am child method");
	
	}

	public static void main(String[] args) {
		ChildMethod chm=new ChildMethod();
		chm.chmethod();
		
	}

}
