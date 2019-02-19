package pkg1;

public class arthmetic1 {

	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public int sub (int a,int b)
	{
		int c=a-b;
		return c;		
	}
	
	public int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	
	public void div(int a,int b)
	{
		int c=a/b;
		System.out.println("Final result is "+c);
	}
	
	public static void main(String[] args) {
		
		arthmetic1 arth1=new arthmetic1();
		int sum1_result=arth1.sum(10, 2);
		int sub_result=arth1.sub(sum1_result,2);
		int sum2_result=arth1.sum(sub_result,2);
		int mul_result=arth1.mul(sum2_result, 2);
		arth1.div(mul_result, 2);

		
				
	}
}

