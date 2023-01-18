package com.citibank.main.domain;

public class ThreadTwo implements Runnable {

	@Override
	public void run() {
		System.out.println("We are in Thread Two");
		
		  for(int i=0;i<100;i++)
		  {
			  System.out.println("Thread two::" + i);
			  
			  try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		
	}

}
