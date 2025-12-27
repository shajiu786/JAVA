package com.tnsif.intro.assignment;

public class First20Prime {
	public static void main(String args[]) {
		int count=0,num=2;
		while(count<20) {
			if(IsPrime.IsPrime(num)) {
				System.out.print(num+" ");
				count++;
			}
			num++;
		}
	}
}
