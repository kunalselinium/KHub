package array;

public class ArrayRemoveDuplicates {
	
	public static void main(String[] args) {
		int a[]=new int[]{5,4,3,2,1,4,5,6,1,2};
		int l=a.length;
		int b=0;
		int temp=0;
		for(int i=0;i<l;i++){
			for(int j=i+1;j<l;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		
		//a[b]=a[0];
		//System.out.println(a[b]);
	for (int c = 1; c < l; c++) {
		if(a[b]!=a[c]){
			b++;
			a[b]=a[c];
			
		}
		
//		if(a[b]==a[c]){
//			b++;
//			a[b]=a[c];
//			
//		}
	}
	for (int i = 0; i < b; i++) {
		System.out.print(a[i]);
		
	}
	
	}


}
	
