package com.tnsif.intro.collection.list;
import java.util.LinkedList;
public class Linkedlistdemo {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		/// adding names
		list.add("shaji");
		list.add("sri");
		list.add("sainath");
		
		System.out.println("LinkedList Elements are: "+list);
		///changing elements
		list.addFirst("virat");
		list.addLast("anushka");
		System.out.println("After updating LinkedList Elements are: "+list);
		/// accessing elements
		System.out.println("Element at index 0: "+list.get(0));
		/// removing elements
		list.remove(2);
		list.removeFirst();
		list.removeLast();
		System.out.println("After removing LinkedList Elements are: "+list);
		
		
		
	}

}
