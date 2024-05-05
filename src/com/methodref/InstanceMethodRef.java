package com.methodref;

public class InstanceMethodRef {

	public static void main(String[] args) {

		InstanceMethodRef imr = new InstanceMethodRef();
		Payment1 p = imr::debitPay;
		p.pay(250);
		
		Payment1 p2 = new InstanceMethodRef()::debitPay;
		p2.pay(323);
	}

	public void debitPay(int x) {

		System.out.println("Debit card payment = " + x);
	}

}

@FunctionalInterface
interface Payment1 {
	void pay(int x);
}
