package com.methodref;

public class StaticMethodRef {

	public static void main(String[] args) {
		
		Payment p = StaticMethodRef::creditPay;
		p.pay(100);

	}
	
	public static void creditPay(int x) {
		
		System.out.println("Credit card payment = " + x);
	}

}

@FunctionalInterface
interface Payment {
	void pay(int x);
}
