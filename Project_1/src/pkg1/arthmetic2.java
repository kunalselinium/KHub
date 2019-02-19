package pkg1;

public class arthmetic2 {

	//((((10+2)+2)-2)*2)/2)
	
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public int sub (int a, int b)
	{
		int c=a-b;
		return c;
	}
	
	public int mul (int a ,int b)
	{
		int c=a*b;
		return c;
	}
	
	public void div (int a ,int b)
	{
		int c=a/b;
		System.out.println("Final result is "+c);
	}
	
	public static void main(String[] args) {
		arthmetic2 arth2=new arthmetic2();
		int sum_result1=arth2.sum(10, 2);
		int sum_result2=arth2.sum(sum_result1, 2);
		int sub_result=arth2.sub(sum_result2, 2);
		int mul_result=arth2.mul(sub_result, 2);
		arth2.div(mul_result, 2);
		
		
	}
}
