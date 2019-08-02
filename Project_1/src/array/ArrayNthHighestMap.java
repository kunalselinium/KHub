package array;

import java.util.TreeMap;

public class ArrayNthHighestMap {

	int a[]={21,45,89,11,28};
	int l=a.length;
	TreeMap<Integer,Integer> tm=new TreeMap();
	
	public ArrayNthHighestMap(int n){
		for(int i=0;i<l;i++){
			tm.put(i, a[i]);
	}
		System.out.println(tm);
		int l1=tm.size();
		System.out.println(l1);
		System.out.println(tm.get(l1-n));
	
}
	public static void main(String[] args) {
		ArrayNthHighestMap anmap=new ArrayNthHighestMap(2);
	}
}
