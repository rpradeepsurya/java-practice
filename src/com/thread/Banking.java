package com.thread;

public class Banking {

	public static void main(String[] args) {

		Customer cust = new Customer();
		Thread t1 = new Thread() {
			public void run() {
				cust.withdraw(15000);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				cust.deposit(10000);
			}
		};

		t1.start();
		t2.start();
	}

}

class Customer {
	public static int balance = 10000;

	synchronized void withdraw(int amount) {
		if (balance < amount) {
			System.out.println("Low balance, Deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= amount;
			System.out.println("Withdraw completed.");
		}
	}

	synchronized void deposit(int amount) {

		System.out.println("Depositing...");
		balance += amount;
		System.out.println("Deposited");

		notify();
	}
}
