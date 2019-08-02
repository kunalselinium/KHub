package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MergeLists {
	public static void main(String[] args) {
		List<Integer> al1=new ArrayList<>(Arrays.asList(2,5,1,7,8,5,77,88));
		List<Integer> al2=new ArrayList<>(Arrays.asList(31,55,12,7,8,2,79,96));
		Set<Integer> lhs=new LinkedHashSet();
		lhs.addAll(al1);
		lhs.addAll(al2);
		System.out.println(lhs);
	}
	

}
