package array;

import java.util.HashMap;
import java.util.Map;

public class DuplicateValuesInArrays {
	
	int[] a={1,1,2,2,3,4,5};
	int[] b={2,2,5,8};
	int l=a.length;
	
	
	public void DuplicateValues(){
		Map<Integer, Boolean> map = new HashMap<>();
		
		
		for(int i = 0; i < a.length;i++){
			map.putIfAbsent(a[i], true);
		}
		
		//find common
		for (int i = 0; i < b.length; i++) {
			if(map.get(b[i]) != null)
				System.out.print(b[i] + " ");
		}
		
		/*for(int i=0;i<l;i++){
			if(a[i]==b[i]){
				System.out.println(a[i]);
			}
		}*/
	}
	public static void main(String[] args) {
		DuplicateValuesInArrays dul=new DuplicateValuesInArrays();
		dul.DuplicateValues();
	}

}
