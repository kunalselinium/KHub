package array;

public class HighestElementArray {
	
	int a[]={21,45,89,11,28};
	int l=a.length;
	int temp;
	
	public int HighestElementArray1(){
		for(int i=0;i<l;i++){
			for(int j=i+1;j<l;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		return a[l-1];
		
		
	}
	public static void main(String[] args) {
		
		HighestElementArray h=new HighestElementArray();
		System.out.println(h.l);
		System.out.println(h.HighestElementArray1());
		

	}

}
