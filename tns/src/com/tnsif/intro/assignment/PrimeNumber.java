package com.tnsif.intro.assignment;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {
	int n,i;
	boolean isPrime=true;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	n=sc.nextInt();
	if(n<=1) {
		isPrime=false;
	
	}else{
		for(i=2;i<=n/2;i++) {
		if(n%i==0) {
			isPrime=false;
			break;
		}
		
	}

}
	if(isPrime) {
		System.out.println("The number is prime");
	}
	else {
		System.out.println("The number is not prime");
	}
}
}