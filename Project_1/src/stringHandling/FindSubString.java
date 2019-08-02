package stringHandling;

public class FindSubString {
	
	static String s1="I had a good had dayha";
	int l=s1.length();
	static String s2="had";
	int l1=s2.length();
	static int count=0;
	
	public void FindSubString1(){
		for(int i=0;i<=l-l1;i++){
			int j;
			for ( j=0;j<l1;j++){
				if(s1.charAt(i+j)!=s2.charAt(j)){
					break;
			}
			}
			System.out.println(j);
				if(j==l1){
					count++;
					//return true;
				}
			}	
			
		
			
		//System.out.println(s2);
		//return false;
}
	public static void main(String[] args) {
		FindSubString fss=new FindSubString();
		//boolean res=
				fss.FindSubString1();
		
//		if(res==true){
//			System.out.println("Substring is present: " +s2);
//		}
//		else
//		{
//
//			System.out.println("Substring is not present");
//		}
		System.out.println("Count of sub string is "+count);
	}
}
