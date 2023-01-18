package com.citibank.main;

import com.citibank.main.domain.ThreadTwo;

public class ThreadTwoMain {

	public static void main(String[] args) {
		Thread thread = new Thread(new ThreadTwo());
		thread.start();

	}

}
