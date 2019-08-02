package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class NthHighestElementwithTreeSet {
	/*{
		System.out.println("I am ini");
	}
	public NthHighestElementwithTreeSet()
	{
		System.out.println("I am constructor");
	}*/

	int a[] = { 21, 45, 89, 11, 28 };
	int l = a.length;
	/*Map<Integer, Integer> m = new HashMap<>();
	{
		m.put(12, 23);
		m.put(10, 90);
		m.put(0, 9);
		m.put(9000, 9);
		System.out.println(m);
		Map<Integer, Integer> tMap = new TreeMap<>(m);
		System.out.println(tMap);
	}
	*/

	Map<Integer, Integer> tm = new TreeMap<>();
	Set<Integer> ts = new TreeSet();
	List<Integer> al = new ArrayList();

	public void NthHighestElementwithTreeSet1(int n) {
		for (int i = 0; i < l; i++) {
			tm.put(i, a[i]);
			// ts.add(a[i]);
		}
		// al.addAll(ts);
		// System.out.println(tm.size());
		System.out.println(tm);
		// System.out.println(al.get(l-n));
		// System.out.println(tm.get(n));
	}
	
	public void NthHighestArrayElement(int n){
		for(int i=0;i<l;i++){
			ts.add(a[i]);
		}
		System.out.println("Elements in the treeset are: "+ts);
		al.addAll(ts);
		int l1=al.size();
		System.out.println("List size is: "+l1);
		System.out.println(n+"th highest element in the array is: "+al.get(l1-n));
	}
	
	public void NthHighestArrayElement1(int n){
		for(int i=0;i<l;i++){
			al.add(a[i]);
		}
	System.out.println(al);
	Collections.sort(al);
	Collections.reverse(al);
	System.out.println(al);
	int l1=al.size();
	//System.out.println(n+"th highest element in the array is: "+al.get(l1-n));
	}

	public static void main(String[] args) {
		NthHighestElementwithTreeSet nh=new NthHighestElementwithTreeSet();
		nh.NthHighestArrayElement1(3);
		
	}

}
