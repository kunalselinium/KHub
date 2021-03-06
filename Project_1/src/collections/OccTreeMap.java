package collections;
import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 
import java.util.*; 


public class OccTreeMap {
	// Java program to count frequencies of elements 
	// using HashMap. 

		public static void countFrequencies(ArrayList<String> list) 
		{ 

			TreeMap<String, Integer> tmap = new TreeMap<String, Integer>(); 
			for (String t : list) { 
				Integer c = tmap.get(t); 
				tmap.put(t, (c == null) ? 1 : c + 1); 
			} 

			for (Map.Entry<String, Integer> m : tmap.entrySet()) 
				System.out.println("Frequency of " + m.getKey() + " is " + m.getValue()); 
		} 

		public static void main(String[] args) 
		{ 
			ArrayList<String> list = new ArrayList<String>(); 
			list.add("Geeks"); 
			list.add("for"); 
			list.add("Geeks"); 
			countFrequencies(list); 
		} 
	} 


}
