package com.thread;

public class ThreadSample2 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Table1());
		Thread t2 = new Thread(new Table2());
		
		t1.start();
		t2.start();

	}

}

class Table1 extends Thread {
	
	public void run() {
		int i = 1;
		int j = 1;
		
		while(j<5) {
			System.out.println(i + " * " + j + " = " + (j*i));
			j++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Table2 extends Thread {
	
	public void run() {
		int i = 2;
		int j = 1;
		
		while(j<5) {
			System.out.println(i + " * " + j + " = " + (j*i));
			j++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
