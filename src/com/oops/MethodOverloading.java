package com.oops;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading mo = new MethodOverloading();

		System.out.println(mo.met("Surya"));
		System.out.println(mo.met(1.2f, 2.3f, 1.1f));

	}

	public int met(int x, int y) {
		return x + y;
	}

	public float met(float x, float y, float z) {
		return x + y + z;
	}

	public String met(String s) {
		return s;
	}

}
