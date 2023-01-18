package com.citibank.main.domain;

public class MyThread implements Runnable {

	Resource resource;
	String textMessage;
	
	
	public MyThread(Resource resource, String textMessage) {
	
		this.resource = resource;
		this.textMessage = textMessage;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		resource.message(textMessage);
		
	}
	

}
