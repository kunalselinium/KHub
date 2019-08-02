package stringHandling;

public class SubStringCount {
	
String s="Thhadehahaddy had what one always hadBut hadThey anythingha";
String sub="had";
int l1=sub.length();
int l=s.length();

int count=0;


public void SubStringCount1(){
	
	for (int i = 0; i<l; i++) {
		
		char c=s.charAt(i);
		for(int j=0;j<l1;j++){
		if (i+2 <= l-1 && s.charAt(i)=='h' && s.charAt(i+1)=='a' && s.charAt(i+2)=='d' ){
			count++;
		}
		
		}
	}
	System.out.println(count);
}

public static void main(String[] args) {
	SubStringCount ssc=new SubStringCount();
	ssc.SubStringCount1();
}


}
