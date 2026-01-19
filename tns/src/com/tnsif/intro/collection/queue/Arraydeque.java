package com.tnsif.intro.collection.queue;
import java.util.ArrayDeque;
public class Arraydeque {

	public static void main(String[] args) {
		ArrayDeque<String> aDeque=new ArrayDeque<String>();
		/// adding elements
		aDeque.add("shaji");
		aDeque.add("sri");
		aDeque.add("sainath");
		System.out.println("ArrayDeque Elements are: "+aDeque);
		///adding element at first position
		aDeque.addFirst("virat");
		System.out.println("After adding first ArrayDeque Elements are: "+aDeque);
		///adding element at last position
		aDeque.addLast("anushka");
		System.out.println("After adding last ArrayDeque Elements are: "+aDeque);
		///removing first element
		aDeque.removeFirst();
		System.out.println("After removing first ArrayDeque Elements are: "+aDeque);
		///removing last element
		aDeque.removeLast();
		System.out.println("After removing last ArrayDeque Elements are: "+aDeque);

	}

}
