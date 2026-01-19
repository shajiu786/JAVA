package com.tnsif.intro.thiss;

public class Override {
	public void hello()
	{
		System.out.println("this is parent class method");
	}
	
	
}
class child extends Override
{
	public void hello()
	{
		System.out.println("this is child class method");
	}
}
