package com.tnsif.intro.collection.map;
import java.util.HashMap;
public class hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		//adding elements
		map.put(1,"shaji");
		map.put(2,"sri");
		map.put(3,"sainath");
		System.out.println("HashMap Elements are: "+map);
		//accessing element
		System.out.println("Value at key 2: "+map.get(2));
		//updating element
		map.put(2, "anushka");
		System.out.println("After updating HashMap Elements are: "+map);
		//removing element
		map.remove(3);
		System.out.println("After removing HashMap Elements are: "+map);
		///checking element
		System.out.println("HashMap contains key 1: "+map.containsKey(1));
		System.out.println("HashMap contains value sri: "+map.containsValue("sri"));
		///size of map
		System.out.println("Size of HashMap: "+map.size());

	}

}
