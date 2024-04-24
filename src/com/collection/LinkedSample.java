package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("pradeep");
		ll.add("Surya");
		ll.add("John");
		ll.add("Doe");
		ll.add("Surya");
		
		ListIterator<String> lit = ll.listIterator();
		
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		System.out.println("==========");
		
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
		// ArrayList is using binary search to search

	}

}
