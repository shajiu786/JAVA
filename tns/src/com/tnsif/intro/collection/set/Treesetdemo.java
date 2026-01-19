package com.tnsif.intro.collection.set;
import java.util.TreeSet;
public class Treesetdemo {
	public static void main(String args[]) {
		TreeSet<String> Tset=new TreeSet<String>();
		/// adding elements
		Tset.add("shaji");
		Tset.add("sri");
		Tset.add("sainath");
		System.out.println("TreeSet Elements are: "+Tset);
		/// trying to add duplicate element
		Tset.add("shaji");
		System.out.println("After adding duplicate TreeSet Elements are: "+Tset);
		/// removing elements
		Tset.remove("sainath");
		System.out.println("After removing TreeSet Elements are: "+Tset);
		///checking element
		System.out.println("TreeSet contains sri: "+Tset.contains("shaji"));
	}

}
