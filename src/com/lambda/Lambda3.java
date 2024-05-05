package com.lambda;

public class Lambda3 {

	public static void main(String[] args) {
		
		Runnable run = () -> {System.out.println("Thread running");};
		Thread t = new Thread(run);
		t.start();

	}

}
