package com.tnsif.intro;

public class nestedtrywithmultiplecatch {
	public static void main(String[] args) {

        try {
            // Outer try block
            int arr[] = {10, 20, 30};

            try {
                // Inner try block
                int a = 10;
                int b = 0;
                int result = a / b;   // ArithmeticException
                System.out.println(result);
            }
            catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero");
            }
            catch (NullPointerException e) {
                System.out.println("Inner catch: Null pointer exception");
            }

            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index out of bounds");
        }
        catch (Exception e) {
            System.out.println("Outer catch: General exception");
        }

        System.out.println("Program executed successfully");
    }
}



