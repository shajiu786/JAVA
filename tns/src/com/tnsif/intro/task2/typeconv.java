package com.tnsif.intro.task2;

public class typeconv {
	public static void main(String[] args) {
		//implicit type conversion
		System.out.println("Implicit Type Conversion:");
		int a = 10;
		double b = a; // int to double
		System.out.println("Integer value: " + a);
		System.out.println("Converted to Double value: " + b);
		
		//explicit type conversion
		System.out.println("\nExplicit Type Conversion:");
		double x = 9.78;
		int y = (int) x; // double to int
		System.out.println("Double value: " + x);
		System.out.println("Converted to Integer value: " + y);
}

}
