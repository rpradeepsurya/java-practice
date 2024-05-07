package com.thread;

public class SyncSample {

	public static void main(String[] args) {
		Table table = new Table();
		Thread t1 = new Thread(new Thread1(table));
		Thread t2 = new Thread(new Thread2(table));
		t1.start();
		t2.start();
	}

}

class Table {
	
	synchronized public void printTable(int i) throws InterruptedException {
		for (int j = 0; j <=5; j++) {
			System.out.println(i + " * " + j + " = " + (i*j));
			Thread.sleep(1000);
		}
	}
}

class Thread1 implements Runnable {

	Table t;
	
	public Thread1(Table t) {
		super();
		this.t = t;
	}
	
	@Override
	public void run() {
		try {
			t.printTable(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}

class Thread2 implements Runnable {

	Table t;
	
	public Thread2(Table t) {
		super();
		this.t = t;
	}
	
	@Override
	public void run() {
		try {
			t.printTable(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}