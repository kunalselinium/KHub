package array;

import java.util.HashSet;
import java.util.Set;

public class RemovingDuplicateArray {
	
	int[] a={1,2,3,1,3,4,4,5,6,7};
	int l=a.length;
	int[] b=new int[l];
	HashSet<Integer> hs=new HashSet<>();
	
	public void RemoveDuplicateArray(){
        for(int i=0;i<l;i++){
        	for(int j=i+1;j<=l-1;j++){
        	if (a[i]==a[j]){
        		b[i]=a[i];
        	}
        	else{
        		b[i]=a[i];
        		b[j]=a[j];
        	}
        	}
        }
        for(int k=0;k<b.length;k++){
        	System.out.print(b[k]);
        }
	}
	
	public void RemoveDuplicateArray1(){
		for(int i=0;i<l;i++){
			hs.add(a[i]);
		}
		System.out.println(hs);
	}
			
		
	
	
	public static void main(String[] args) {
		RemovingDuplicateArray rd=new RemovingDuplicateArray();
		//rd.RemoveDuplicateArray();
		rd.RemoveDuplicateArray1();
		
	}

}
