package com.oops;

public class MethodOverriding extends SuperOverriding {
	
	public static void main(String[] args) {
		
		MethodOverriding mov = new MethodOverriding();
		
		mov.msg();
		
	}
	

	public void msg() {
		System.out.println("Inside MethodOverriding");
		super.msg();
	}

}


class SuperOverriding {
	
	public void msg() {
		System.out.println("Inside Superriding");
	}
}
