package com.tnsif.intro.assignment;

import java.util.Scanner;

public class palindrome {
	public static void main(String args[]) {
		int r,rev=0,temp,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
		}
		if(temp==rev) {
			System.out.println("The number is palindrome");
		}
		else {
			System.out.println("The number is not palindrome");
		}
	}
	
}
