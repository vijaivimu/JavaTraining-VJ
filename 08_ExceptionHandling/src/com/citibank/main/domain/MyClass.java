package com.citibank.main.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyClass {
	
	private double num1;
	private double num2;
	private double result;
	
	public void accept()
	{
		try
		{Scanner scanner= new Scanner(System.in);
		System.out.println("enter num1");
		num1 = scanner.nextDouble();
		System.out.println("enter num2");
		num2 = scanner.nextDouble();
		} catch(InputMismatchException e)
		{
			System.out.println("invalid input from user");
			System.out.println("program will continue its execution");
			System.out.println(e.getMessage());
		}
		catch (Exception e)
		{
			System.out.println("exception in code");
			System.out.println(e.getMessage());
		}
		}
	
	public void calculate()
	{
		result = num1/num2;
		
	}
	
	public void display()
	{
		System.out.println(result);
	}

}
