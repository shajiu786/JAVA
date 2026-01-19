package com.tnsif.intro.thiss;

public class thisdemo {
	int a=20;
	thisdemo(int a)
	{
		System.out.println("This is a constructor");
	}
	public void show() {
		System.out.println("This is a  demo class");
	}
}

class demo extends thisdemo{
	demo(){
		super(30);  //calling parent class constructor
	}
	int a=40;
	public void display() {
		System.out.println(super.a); //20 calling parent class instance variable
		super.show();   //calling parent class method
		
		System.out.println("This is a demo class");
	}
	
}

