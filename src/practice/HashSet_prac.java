package practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_prac {

	public static void main(String[] args) {
//		String[] al = {
//				"A", "B", "C", "D", "D", "E", "F", "G"
//		};
		String[] al_sp = {
				 "D", "E", "F", "G", "A", "B", "C", "D"
		};
		Set<String> hashSet = new HashSet<>();
		
		for(String ha : al_sp) {
			hashSet.add(ha);
		}
		
		Iterator<String> iter = hashSet.iterator();
		
		while(iter.hasNext()) {
			System.out.println("  "+iter.next());
		}
		
		if(hashSet.contains("A")) {
			hashSet.remove("A");
			System.out.println("A removed");
		}
		
		Iterator<String> after_iter = hashSet.iterator();
		while(after_iter.hasNext()) {
			System.out.println(" after "+after_iter.next());
		}
		
	}

}
