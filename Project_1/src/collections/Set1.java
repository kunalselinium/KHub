package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Set1 {
	public Set1(){
		Set<Integer> list=new HashSet<Integer>();
		list.add(15);
		list.add(5);
		list.add(10);
		list.add(20);
		list.add(2);
		//System.out.println(list.get(3));
		//list.clear();
//		Iterator it=list.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		
		
		System.out.println(list);
		for(int e:list){
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		new Set1();
	}

}
