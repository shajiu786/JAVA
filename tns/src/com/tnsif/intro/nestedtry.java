package com.tnsif.intro;

public class nestedtry {
	public static void main(String[] args) {

        try {
            // Outer try block
            int a = 10;
            int b = 0;

            try {
                // Inner try block
                int result = a / b;   // This will cause ArithmeticException
                System.out.println("Result: " + result);
            } 
            catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero");
            }

            int arr[] = {1, 2, 3};
            System.out.println(arr[5]); // This will cause ArrayIndexOutOfBoundsException
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index out of bounds");
        }

        System.out.println("Program continues normally...");
    }
}

