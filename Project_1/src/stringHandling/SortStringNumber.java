package stringHandling;

public class SortStringNumber {
	
	//input: 010201010100222112 
	//000000011111122222
	
	String s="010201010100222112";
	String s1="";
	String s2="";
	String s3="";
	int l=s.length();
	int ascii;
	char c;
	char c1='5';
	int count0=0;
	int count1=0;
	int count2=0;
	
	public SortStringNumber(){
		for (int i=0;i<l;i++){
		ascii=s.charAt(i);
		c=s.charAt(i);
//		if(ascii== 48){
//			s1=s1+String.valueOf(s.charAt(i));
//		}
//		if(ascii ==49){
//			s2=s2+String.valueOf(s.charAt(i));
//		}
//		if(ascii ==50){
//			s3=s3+String.valueOf(s.charAt(i));
//		}
		
		if(c =='0'){
			s1=s1+String.valueOf(s.charAt(i));
			count0++;
		}
		if( c =='1'){
			s2=s2+String.valueOf(s.charAt(i));
			count1++;
		}
		if(ascii =='2'){
			s3=s3+String.valueOf(s.charAt(i));
			count2++;
		}
		
		}
		System.out.println(s1+s2+s3);
		System.out.println("Count of 0 is: "+count0);
		System.out.println("Count of 1 is: "+count1);
		System.out.println("Count of 2 is: "+count2);
		System.out.println(c1);
		
	}
	
	public static void main(String[] args) {
		new SortStringNumber();
	}

}
