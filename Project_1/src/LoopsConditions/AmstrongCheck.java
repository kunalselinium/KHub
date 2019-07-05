package LoopsConditions;

public class AmstrongCheck {
	public static void main(String[] args) {
//		int a=153;
//		String s=String.valueOf(a);
//		System.out.println(s);
//		int l=s.length();
//		int n=0;
//		for(int i=0;i<l;i++){
//		 n=(s.charAt(i))*(s.charAt(i))*(s.charAt(i));
//		}
//		System.out.println(n);
		
		int c=0,a,temp;  
	    int n=153;//It is the number to check armstrong  
	    temp=n;  
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;
	    c=c+(a*a*a);
	      
	    }
	    //System.out.println(n);
	    if(temp==c)  
	    System.out.println("armstrong number");   
	    else  
	        System.out.println("Not armstrong number");   
	   }  
	
	
	}
	
	
	
	
	
	


