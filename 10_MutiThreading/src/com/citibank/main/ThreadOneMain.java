package com.citibank.main;

import com.citibank.main.domain.ThreadOne;
import com.citibank.main.domain.ThreadTwo;

public class ThreadOneMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		
		Thread thread1 = new ThreadOne();
		thread1.start();


		
		Thread thread2= new Thread(new ThreadTwo());
		thread2.start();
		
		System.out.println("Main End");
		
		
	}

}
