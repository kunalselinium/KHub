package array;

public class NthHighestArrayWithoutSort {
//	int a[]={21,45,89,11,28};
	int a[]={6,1,2,3,0,5};
	int l=a.length;
	int max=a[0];
	int min=a[0];
	public void NthHighestArrayWithoutSort1(){
	
	/*for(int i=1;i<l;i++){
		
			if(max<a[i]){
				max=a[i];
				//a[i]=a[j];
				//a[j]=temp;
			}
			
			if(min>a[i]){
				min=a[i];
			}
		}
	System.out.println(max);
	System.out.println(max-1);
	System.out.println(min);*/
		
		int second_max=Integer.MIN_VALUE;
		int third_max=-1;
		
		for(int i =1; i<l;i++){
			if(max < a[i]){
				second_max = max;
				max = a[i];
			}else if(second_max < a[i]){
				second_max = a[i];
			}else if(third_max < a[i]){
				third_max = a[i];
			}
		}
		System.out.println(max);
		System.out.println(second_max);
		System.out.println(third_max);
	}
	public static void main(String[] args) {
		NthHighestArrayWithoutSort nw=new NthHighestArrayWithoutSort();
		nw.NthHighestArrayWithoutSort1();
	}
}


		
	
