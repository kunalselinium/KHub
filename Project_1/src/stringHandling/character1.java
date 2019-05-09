package stringHandling;

public class character1 {
	
	public character1() {
		String s="Kunal";
		int l=s.length();
		System.out.println(l);
		for(int i=l-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		
		
	}
	
	public static void main(String[] args) {
		new character1();
	}

}
