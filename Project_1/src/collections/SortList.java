package collections;

import java.util.ArrayList;
import java.util.List;

public class SortList {
	int temp;

	public SortList(int n){
		//List<Integer> list=new ArrayList<Integer>();
		//List list=new ArrayList<Integer>();
		//List<Integer> list=new ArrayList();
//		List <Integer>list=new ArrayList();
//		list.add(15);
//		list.add(5);
//		list.add(10);
//		list.add(20);
//		list.add(2);
		List <Integer>list= 10,25,12,4,16};
		
		
		for (int i=0;i<list.size();i++){
			for (int j=i+1;j<list.size();j++){
				if(list.get(i)>list.get(j)){
					temp=list.get(i);
					list.set(i,list.get(j));
					list.set(j,temp);
					
				}
			}
		}
		System.out.println(list);
	    System.out.println(list.get(list.size()-n));
		
	}

	public static void main(String[] args) {
		new SortList(3);
	}
}
