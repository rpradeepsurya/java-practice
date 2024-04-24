package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ALSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("pradeep");
		al.add("Surya");
		al.add("John");
		al.add("Doe");
		al.add("Surya");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("pradeep");
		al2.add("Surya");
		al2.add("John");
		
		al.addAll(al2);
		
		//System.out.println(al);
		
		// Using Iterator to iterate ArrayList
		// to iterate in both forward and backward, use list iterator
		Iterator<String> it = al.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
