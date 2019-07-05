package array;

public class NtnHighestElementArray {
	int a[]={21,45,89,11,28};
	int l=a.length;
	int temp;

	
	public void NtnHighestElementArray1(int n){
		for(int i=0;i<l;i++){
			for(int j=i+1;j<l;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
//		for(int k=0;k<l;k++){
//			System.out.print(a[k]+" ");
//		}
	
		System.out.println(a[l-n]);
		
		
	}
	public static void main(String[] args) {
		
		NtnHighestElementArray h=new NtnHighestElementArray();
		//System.out.println(h.l);
		h.NtnHighestElementArray1(3);

}
}
