package stringHandling;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class SeparateCharDigits {
	
	String s="dgasdgahsdjh12313behajsd22eyhqbd";
//	StringBuilder c = new StringBuilder();
//	StringBuilder n = new StringBuilder();
	String s1="";
	String s2="";
	int ascii;
	
	public SeparateCharDigits(){
		
		for (int i=0;i<s.length();i++){
			ascii=s.charAt(i);
			if (ascii>=65 && ascii <=97 || ascii>=97 &&ascii <=122){
				
				//c.append((char)ascii);
				s1=s1 + s.charAt(i);
			}
			else
			{
				//n.append((char)ascii);
				s2=s2 + s.charAt(i);
			}
			
		}
		System.out.println(s1+s2);
		//System.out.println(s2);
		
	}
	
	public static void main(String[] args) {
		new SeparateCharDigits();
	}

}
