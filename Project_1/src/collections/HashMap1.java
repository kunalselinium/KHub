package collections;

import java.util.HashMap;
import java.util.Set;

public class HashMap1 {
	
	HashMap<Integer,String> hm;
	public HashMap1(){
		 hm = new HashMap<Integer,String>();
		 //HashMap<String, Integer> hash_map = new HashMap<String, Integer>;
		 //hash_map.put(key, value)
		 hm.put(12, "Kunal");
		 hm.put(15, "My");
		 hm.put(25, "Name");
		 hm.put(22, "Sharma");
		 hm.put(8, "is");
		Set<Integer> khm=hm.keySet();
		//System.out.println(khm);
		int l=khm.size();
		//for (int i=0;i<l;i++){
//		for(int e:khm){
//			System.out.println(e);
//		}
//		
//		
//		 
//		 
	 System.out.println(hm.get(25));
//		 System.out.println(hm);
	}
	public static void main(String[] args) {
		new HashMap1();
		
		
	}

}
