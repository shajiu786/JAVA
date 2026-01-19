package com.tnsif.intro.collection.list;
import java.util.Vector;
public class vector {

	public static void main(String[] args) {
		///creating vecctor
		Vector<String> vec=new Vector<String>();
		/// adding elements
		vec.add("shaji");
		vec.add("sri");
		vec.add("sainath");
		System.out.println("Vector Elements are: "+vec);
		/// accessing elements
		System.out.println("Element at index 0: "+vec.get(0));
		///adding element at specific index
		vec.add(1, "virat");
		/// removing elements
		vec.remove(2);
		System.out.println("After removing Vector Elements are: "+vec);
		///updating elements
		vec.set(1, "anushka");
		System.out.println("After updating Vector Elements are: "+vec);
	}

}
