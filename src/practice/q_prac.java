package practice;

import java.util.LinkedList;
import java.util.ListIterator;

public class q_prac {
	//dsd
	public static void main(String[] args) {
		q_prac ex = new q_prac();
		ex.checkLinkedList();
	}
	
	public void checkLinkedList() {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("apple");
		System.out.println(ll);
		
		ll.add("black");
		System.out.println(ll);
		
		ll.addFirst("couple");
		System.out.println(ll);
		
		ll.add(1, "danger");
		System.out.println(ll);
		
		System.out.println(ll.set(0, "egg") + "is changed to egg");
		
		System.out.println(ll);
		
		System.out.println("ll.getFirst() = " + ll.getFirst());
		
		System.out.println("ll.indexOf(\"egg\" ) = " + ll.indexOf("danger"));
		
		System.out.println("ll.removeFirst() = "+ll.removeFirst());
		
		System.out.println(ll);
		
		System.out.println();
		
		ListIterator<String> li=  ll.listIterator();
		if(li.hasNext()) {
			System.out.println("li.next() = " + li.next());
		}
		
		System.out.println("li.next() = " + li.next());
		
		System.out.println("li.previous() = " + li.previous());
		
		System.out.println("li.previous() = " + li.previous());
		
		
		
	}

}
