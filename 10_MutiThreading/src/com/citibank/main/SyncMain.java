package com.citibank.main;

import com.citibank.main.domain.Resource;

public class SyncMain {

	public static void main(String[] args) {
		
		
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		thread.setName("main thread");
		thread.setPriority(9);
		System.out.println(thread);
		Resource resource = new Resource();
		
		
		
		resource.message("Hi");
		resource.message("Hello");
		resource.message("How are you doing today?");
		
		
		
		

	}

}
