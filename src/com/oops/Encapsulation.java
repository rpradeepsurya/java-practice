package com.oops;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample sam = new Sample();
		sam.display1();
	}

}


class Sample {
	
	public int x = 5;
	private int y = 10;
	
	InnerSample inner = new InnerSample();
	
	public void display1() {
	
		System.out.println("Display 1");
		inner.display2();
		display3();
		
		int z = 9;
	}
	
	private void display3() {
		
		System.out.println("Display 3");
	}
	
	private class InnerSample {
		
		public void display2() {
			y = 10;
			System.out.println("Display 2");
		}
		
		
	}
}
