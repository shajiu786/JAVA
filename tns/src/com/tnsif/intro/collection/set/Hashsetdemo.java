package com.tnsif.intro.collection.set;
import java.util.HashSet;
public class Hashsetdemo {
	public static void main(String args[]) {
		///creating hashset
		HashSet<String> set=new HashSet<String>();
		/// adding elements
		set.add("shaji");
		set.add("sri");
		set.add("sainath");
		System.out.println("HashSet Elements are: "+set);
		/// trying to add duplicate element
		set.add("sri");
		System.out.println("After adding duplicate HashSet Elements are: "+set);
		/// removing elements
		set.remove("sainath");
		System.out.println("After removing HashSet Elements are: "+set);
		///checking element
		System.out.println("HashSet contains sri: "+set.contains("sri"));
	}

}
