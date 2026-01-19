package com.tnsif.intro.collection.list;
import java.util.ArrayList;
public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		/// adding names
		list.add("shaji");
		list.add("sri");
		list.add("sainath");
		System.out.println("Array Elements are: "+list);
		/// accessing elements
		System.out.println("Element at index 0: "+list.get(0));
		/// removing elements
		list.remove(1);
		System.out.println("After removing Array Elements are: "+list);
		///updating elements
		list.set(1, "virat");
		System.out.println("After updating Array Elements are: "+list);
		///size of arraylist
		System.out.println("Size of ArrayList: "+list.size());
		
		
	}

}
