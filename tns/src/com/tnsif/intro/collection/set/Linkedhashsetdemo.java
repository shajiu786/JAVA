package com.tnsif.intro.collection.set;
import java.util.LinkedHashSet;
public class Linkedhashsetdemo {
	public static void main(String args[]) {
		///creating linkedhashset
		LinkedHashSet<String> LHset=new LinkedHashSet<String>();
		/// adding elements
		LHset.add("shaji");
		LHset.add("sri");
		LHset.add("sainath");
		System.out.println("LinkedHashSet Elements are: "+LHset);
		/// trying to add duplicate element
		LHset.add("sri");
		System.out.println("After adding duplicate LinkedHashSet Elements are: "+LHset);
		/// removing elements
		LHset.remove("sainath");
		System.out.println("After removing LinkedHashSet Elements are: "+LHset);
		///checking element
		System.out.println("LinkedHashSet contains sri: "+LHset.contains("sri"));
		
		
	}
   
}
