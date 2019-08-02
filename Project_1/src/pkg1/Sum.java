package pkg1;

public class Sum {
	public static void main(String[] args) {
		int n=121;
		int c;
		//String s=String.valueOf(a);
		//int l=s.length();
		int temp=n;
		int sum=0;
		while(n>0){
			c=n%10;
			//System.out.println(c);
			sum=sum*10+c;
			n=n/10;			
		}
		System.out.println(sum);
		if(sum==temp){
			System.out.println("Number is palindrome");
		}
		else{
			System.out.println("Number is not palindrome");
		}
	}
	
	
	

}
