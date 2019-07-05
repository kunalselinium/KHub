package stringHandling;

public class StringCount {
	
	String s="mynameisdeepak";
	int count=0;
	int l=s.length();
	char c='e';
	public StringCount()
	{
		
		System.out.println(l);
		for (int i=0;i<=l-1;i++){
			if (s.charAt(i)==c){
				count++;
			}
			
			
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		new StringCount();
	}

}
