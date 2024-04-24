package com.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class VectorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// vector is synchronized, so it is thread safe
		Vector<String> vect = new Vector<String>();
		vect.add("pradeep");
		vect.add("Surya");
		vect.add("John");
		vect.add("Doe");
		vect.add("Surya");
		// addElement is only for vector
		vect.addElement("Jack");
		
		
		Enumeration<String> enu = vect.elements();
		
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}

	}

}
