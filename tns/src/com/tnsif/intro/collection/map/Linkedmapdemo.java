package com.tnsif.intro.collection.map;
import java.util.LinkedHashMap;
public class Linkedmapdemo {
	public static void main(String args[]) {
		///creating linkedhashmap
	LinkedHashMap<Integer, String> lmap=new LinkedHashMap<Integer, String>();
	/// adding elements
	lmap.put(18, "virat");
	lmap.put(7, "dhoni");
	lmap.put(45, "rohit");
	lmap.put(7, "abd");///dhoni is replaced by abd
	System.out.println("LinkedHashMap Elements are: "+lmap);
	/// removing elements
	lmap.remove(7);
	System.out.println("After removing LinkedHashMap Elements are: "+lmap);
	///checking element
	System.out.println("LinkedHashMap contains key 45: "+lmap.containsKey(45));
	System.out.println("LinkedHashMap contains value virat: "+lmap.containsValue("virat"));
	///accessing element
	System.out.println("Value at key 18: "+lmap.get(18));
	
}
}