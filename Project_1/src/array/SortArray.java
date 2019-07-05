package array;

public class SortArray {
	public static void main(String[] args) {
			int a[]=new int[]{5, 4, 3, 2, 1};
			int l=a.length;
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
//			for (int i=1;i<l;i++){
//				//System.out.println(a.length);
//				//int temp=a[i];
//				for(int j=i;j>0;j--){
//					//System.out.println(a[j+1]);
//					if (a[j]<a[j-1]){
//					temp=a[j];
//					a[j]=a[j-1];
//					a[j-1]=temp;
//					}
//					
//				}
//			}
				
				for(int k=0;k<l;k++){
					System.out.println(a[k]);
				}
				
			}
			
	}


