package com.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PQSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// insertion order is random
		PriorityQueue<String> pq = new PriorityQueue<>();
		
		pq.add("Surya");
		pq.add("pradeep");
		pq.add("John");
		pq.add("Doe");
		pq.add("Surya");
		
		System.out.println("Head: " + pq.element()); // if the queue is empty, throws NoSuchElementException
		System.out.println("Head: " + pq.peek()); // if the list is empty, returns null
		
		Iterator<String> pqit = pq.iterator();
		
		while(pqit.hasNext()) {
			System.out.println(pqit.next());
		}
		
		pq.remove(); // if the queue is empty, throws NoSuchElementException
		pq.poll(); // if the list is empty, returns null
		
		System.out.println("After removing two elements ");
		
		Iterator<String> pqit1 = pq.iterator();
		
		while (pqit1.hasNext()) {
			System.out.println(pqit1.next());
		}

	}

}
