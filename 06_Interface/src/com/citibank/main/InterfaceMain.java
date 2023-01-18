package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.MyClass;
import com.citibank.main.domain.MyInterface;
import com.citibank.main.factory.MyFactory;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		System.out.println("Main start");
		MyClass myClass = new MyClass();
		myClass.show();
		
		//MyInterface myInterface = new MyClass();
		//myInterface.show();
		System.out.println(MyInterface.ss);
		System.out.println(myClass.ss);
		System.out.println("------------------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Myclass object");
		System.out.println("2. your class object");
		System.out.println("enter your choice");
		choice = scanner.nextInt();
		
		MyInterface myInterface = MyFactory.getObject(choice); 
		myInterface.show();
		
		System.out.println("Main end");

	}

}
