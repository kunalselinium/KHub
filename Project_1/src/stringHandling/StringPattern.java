package stringHandling;

import java.util.ArrayList;
import java.util.List;

public class StringPattern {
	
	String s="abcde";
	int l=s.length();
	
	
	public StringPattern(){
		for(int i=0;i<l;i++){
			for(int j=0;j<=i;j++){
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	/*	
		int i = 0;
		StringBuilder sb = new StringBuilder();
		List<String> list = new ArrayList<>();
		
		while(i < s.length()){
			sb.append(s.charAt(i));
			list.add(sb.toString());
			i++;
		}
		
		list.stream().forEach(System.out::print);
		
		*/
		
	}
	
	public static void main(String[] args) {
		new StringPattern();
	}
	

}
