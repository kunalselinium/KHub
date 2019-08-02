package stringHandling;

public class SortString {
	
	String s="eDcba";
	char[] c=s.toCharArray();
	int l=c.length;
	char temp;
	
	public SortString(){
		for(int i=0;i<l;i++){
			for(int j=i+1;j<l;j++){
				if(c[i]>c[j]){
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
					
				}
			}
		}
		for(int k=0;k<l;k++){
			System.out.print(c[k]);
		}
	}
	public static void main(String[] args) {
		new SortString();
		
	}
	

}
