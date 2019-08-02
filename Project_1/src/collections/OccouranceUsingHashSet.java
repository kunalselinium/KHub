package collections;

import java.util.ArrayList;
import java.util.*;

public class OccouranceUsingHashSet {
	
	public OccouranceUsingHashSet(){
		List<String> list=new ArrayList();
		list.add("geeks");
		list.add("of");
		list.add("geeks");
		list.add("for");
		list.add("geeks");
		list.add("of");
		list.add("geeks");
		list.add("for");
		
		Set<String> hs=new HashSet();
		hs.addAll(list);
		for(String s:hs){
			System.out.println(s+": "+Collections.frequency(list, s));
		}
		
	
		
	}
	
	public static void main(String[] args) {
		new OccouranceUsingHashSet();
	}

}
