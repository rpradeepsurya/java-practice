package com.oops;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c = new C();
		c.method3();
		c.method2();
		c.method1();

	}

}


class A {
	
	public void method1() {
		
	}
}

class B extends A {
	
	public void method2() {
		
	}
}

class C extends B {
	
	public void method3() {
		
	}
}
