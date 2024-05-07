package com.thread;

public class ThreadSample implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadSample ts = new ThreadSample();
		
		Thread t = new Thread(ts);
		t.start();
		
		for (int i=0; i<5; i++) {
			System.out.println("main method");
			Thread.sleep(1000);
			
		}
	}

	@Override
	public void run() {
		
		int i = 0;
		while (i<5) {
			System.out.println("Thread running");
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
