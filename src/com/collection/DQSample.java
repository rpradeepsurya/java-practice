package com.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DQSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ArrayDeque implements Deque interface
		Deque<String> dq = new ArrayDeque<>();
		
		dq.offer("John");
		dq.offer("Doe");
		dq.add("Jack");
		dq.offerFirst("Surya");
		dq.offerLast("Pradeep");
		dq.offer("Jim");
		
		for (String val: dq) {
			System.out.println(val);
		}
		
		dq.pollLast();
		System.out.println("=============");
		for (String val: dq) {
			System.out.println(val);
		}

	}

}
