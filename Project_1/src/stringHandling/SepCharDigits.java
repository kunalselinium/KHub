package stringHandling;

public class SepCharDigits {
	
	String s="sub53od73th";
	int l=s.length();
	StringBuilder c=new StringBuilder();
	public  SepCharDigits()
	{
		for(int i=0;i<l;i++){
			char c1=s.charAt(i);
			int ascii=s.charAt(i);
//			if(Character.isAlphabetic(c1)){
//				c.append(c1);
//			}
			if((ascii>=65 && ascii <=97 || ascii>=97 &&ascii <=122)){
				c.append(c1);
		}
		}
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
	new SepCharDigits();
		
	}

}
