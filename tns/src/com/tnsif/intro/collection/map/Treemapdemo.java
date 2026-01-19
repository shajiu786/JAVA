package com.tnsif.intro.collection.map;
import java.util.TreeMap;
public class Treemapdemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
		/// adding elements
		tmap.put(1,"RCB");
		tmap.put(2,"CSK");
		tmap.put(3,"MI");
		System.out.println("TreeMap Elements are: "+tmap);
		///accessing element
		System.out.println("Value at key 2: "+tmap.get(2));
		///updating element
		tmap.put(2, "SRH");
		System.out.println("After updating TreeMap Elements are: "+tmap);
		///removing element
		tmap.remove(3);
		System.out.println("After removing TreeMap Elements are: "+tmap);
		///checking element
		System.out.println("TreeMap contains key 1: "+tmap.containsKey(1));
		System.out.println("TreeMap contains value CSK: "+tmap.containsValue("CSK"));
		///size of map
		System.out.println("Size of TreeMap: "+tmap.size());
		///acessing first and last key
		System.out.println("First Key: "+tmap.firstKey());
		System.out.println("Last Key: "+tmap.lastKey());
		
	}

}
