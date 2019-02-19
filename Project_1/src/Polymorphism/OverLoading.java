package Polymorphism;

public class OverLoading {
	
	public int arthmetic(int a ,int b) {
		int res1=a+b;
		return res1;
		
	}
	
	public float arthmetic(int x,int y,int z) {
		int res2=x+y-z;
		//float f=res2;
		return res2;
		
	}

	public static void main(String[] args) {
	 OverLoading ovl=new OverLoading();
	 int re1=ovl.arthmetic(2, 5);
	 System.out.println(re1);
	 float re2=ovl.arthmetic(2, 3, 3);
	 System.out.println(re2);
	 

	}

}
