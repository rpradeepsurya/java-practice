package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tSet = new TreeSet<String>();
		tSet.add("pradeep");
		tSet.add("Surya");
		tSet.add("John");
		tSet.add("Doe");
		tSet.add("Surya");
		
		// treeset contains elements in ascending order. For String, uppercase takes precedence over lowercase
		Iterator<String> it = tSet.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
