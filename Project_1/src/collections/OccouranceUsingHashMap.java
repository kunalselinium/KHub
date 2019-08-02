package collections;

import java.util.*;

public class OccouranceUsingHashMap {
	
	public OccouranceUsingHashMap(){
	List<String> list=new ArrayList();
	list.add("geeks");
	list.add("of");
	list.add("geeks");
	list.add("for");
	list.add("geeks");
	list.add("of");
	list.add("geeks");
	list.add("for");
	
	String s="Today is monday and monday is first working day of the week no one likes coming to office on monday";
	String s3="abcabdhsbcd";
	char[] c1=s3.toCharArray();
	String[] s1=s.split(" ");
	//System.out.println(c1);
	
	Map<String,Integer> hm=new HashMap();
	Map<String,Integer> hm1=new HashMap();
	Map<Character,Integer> hm2=new HashMap();
	
	for (char c2:c1){
		hm2.put(c2, (hm2.get(c2)== null)? 1 : hm2.get(c2)+1);
	}
	//System.out.println(hm2);
//	for(String s2:s1){
//		hm1.put(s2, (hm1.get(s2) == null) ? 1 : hm1.get(s2) + 1);
//	}
	
	
//	for (String i:list){
//		//int n=hm.get(i);
//		hm.put(i, (hm.get(i) == null) ? 1 : hm.get(i) + 1);
//		//hm.merge(i, 1, Integer::sum);
//	}
	
//	for (String i:list){
//		if(hm.containsKey(i)){
//			hm.put(i, hm.get(i)+1);
//		}
//		else{
//			hm.put(i, 1);
//		}
//	}
	
	System.out.println(hm2);
//	for (Map.Entry<Integer, Integer> m:hm.entrySet()){
//		System.out.println("Element "+m.getKey()+" is present "+m.getValue()+"times");
//	}

}
	public static void main(String[] args) {
     new OccouranceUsingHashMap();
//		String[] a = new String[2];
//		a[0] = "adarsh";
//		a[1] = "adarsh";
//		
//		List<String> al = new ArrayList<>();
//		
//		al.add("adarsh");
//		al.add("adarsh");
//		
//		
//		System.out.println(a[0] == a[1]);
//		System.out.println(al.get(0) == al.get(1));
//		String a = "adarsh";
//		String b = new String("adarsh");
//		
//		System.out.println(a==b);
//		//String p = b.intern();
//		System.out.println(a== b.intern());
		
		
		
	}
}
