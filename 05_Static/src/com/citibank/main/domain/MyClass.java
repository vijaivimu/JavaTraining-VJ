package com.citibank.main.domain;

public class MyClass {
	
	public int num1 = 10;
	public static int num2 = 10;
	
	
	
	public MyClass() {
		System.out.println("default constructor");
	}

	public MyClass(int num1) {
		
		this.num1 = num1;
	}
	
	public void display()
	{
		System.out.println(num1);
		System.out.println(num2);
		num1 = num1 + 10;
		num2= num2 + 10;
		System.out.println(num1);
		System.out.println(num2);
	}

	{
		System.out.println("non static block");
	}
	static {
		System.out.println("static block");
	}
}



