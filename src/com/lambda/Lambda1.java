package com.lambda;

public class Lambda1 {

	public static void main(String[] args) {

		SingleParam sp = name -> System.out.println("Name = " + name);
		sp.displayName("Surya");

		DoubleParam dp = (a, b) -> (a + b);
		System.out.println(dp.add(2, 3));

		DoubleParam dp2 = (a, b) -> {return (a + b);};
		System.out.println(dp.add(2, 3));
	}

}

@FunctionalInterface
interface SingleParam {
	void displayName(String name);
}

@FunctionalInterface
interface DoubleParam {
	int add(int x, int y);
}
