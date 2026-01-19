package com.tnsif.intro.collection.queue;
import java.util.PriorityQueue;
public class Priorityqueuedemo {

	public static void main(String[] args) {
		PriorityQueue<String> pQueue=new PriorityQueue<String>();
		/// adding elements
		pQueue.add("shaji");
		pQueue.add("sri");
		pQueue.add("sainath");
		System.out.println("PriorityQueue Elements are: "+pQueue);
		///acessing highest priority element
		System.out.println("Head Element is: "+pQueue.peek());
		///removing elements
		pQueue.poll();
		System.out.println("After removing Head Element PriorityQueue Elements are: "+pQueue);
		
		
	}

}
