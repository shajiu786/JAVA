package com.tnsif.intro.assignment;
import java.util.Scanner;

public class armstrong {
	public static void main(String args[]) {
		int r, sum=0, temp, n;
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc1.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("The number is armstrong");
		}
		else {
			System.out.println("The number is not armstrong");
		}
	}
}
