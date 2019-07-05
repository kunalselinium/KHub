package collections;

import java.util.ArrayList;
import java.util.List;

public class List1 {
	
	public List1(){
		//List<Integer> list=new ArrayList<Integer>();
		//List list=new ArrayList<Integer>();
		//List<Integer> list=new ArrayList();
		List <Integer>list=new ArrayList();
		//List <Integer>list={15,10,12,16,14};
		list.add(15);
		list.add(5);
		list.add(10);
		list.add(20);
		list.add(2);
		System.out.println(list.get(3));
		//list.clear();
		
		
		System.out.println(list);
//		for(int e:list){
//			System.out.println(e);
//		}
		
	}

	public static void main(String[] args) {
		new List1();
	}
}
