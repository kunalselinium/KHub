package stringHandling;

public class StringUpperLowerCase {
	
	String s="dhjsgdugdjdsdjhdgudc";
	String s2="dhJsGdUgDjDsDjHdGuDc";
	int l=s.length();
	int l1=s2.length();
	char c;
	char c1;
	String s1="";
	String s3="";
	int ascii=0;
	public void StringUpLower(){
		for(int i=0;i<l1;i++){
			c1=s2.charAt(i);
			//ascii=s.charAt(i);
			if(Character.isUpperCase(c1)){
				c1=Character.toLowerCase(c1);
				s3+=c1;
				//c=(char) (ascii-32);
			//s1=s1 + String.valueOf(c);
			}
			else{
				c1=Character.toUpperCase(c1);
				s3+=c1;
				//c=(char) (ascii+32);
			//s1=s1+ String.valueOf(c);
			}
		}
		System.out.println(s3);
	}
	
	public void StringUpLower1(){
		for(int i=0;i<l;i++){
			c=s.charAt(i);
			if(i%2==0){
				c=Character.toUpperCase(c);
				s1=s1+c;
			}
			else{
				c=Character.toLowerCase(c);
				s1=s1+c;
			}
		}
		System.out.println(s1);
	}
	public static void main(String[] args) {
		StringUpperLowerCase sul=new StringUpperLowerCase();
		//sul.StringUpLower1();
		sul.StringUpLower();
	}
			

}
