package staticUse;

public class StaticMethod {
	
	 static int a;
		
		public static void method1()
		{
			a=a+1;
		    System.out.println(a);
		}
		
		public static void method2()
		{
			a=a+3;
			System.out.println(a);
		}

		public static void main(String[] args) {
			System.out.println(StaticMethod.a);
			StaticMethod.method1();
		    StaticMethod.method2();
		    StaticMethod.method1();
		}


}
