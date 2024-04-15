package com.basics;

public class Example {

	public int age = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome");
		System.out.println(args.length);

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		Example obj = new Example();

		System.out.println(obj.add(1, 2));
		System.out.println(sub(1, 2));

	}

	public int add(int x, int y) {
		return (x + y);
	}

	public static int sub(int x, int y) {
		return (x - y);
	}

}

class Example2 {

	public int multiply(int x, int y) {
		return (x * y);
	}
}
