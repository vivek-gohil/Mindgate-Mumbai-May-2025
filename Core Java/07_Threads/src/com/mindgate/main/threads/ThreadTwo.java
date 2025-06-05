package com.mindgate.main.threads;

public class ThreadTwo implements Runnable {

	@Override
	public void run() {
		System.out.println("ThreadTwo start");
		for (int i = 0; i < 1000; i++) {
			System.out.println("Thread Two :: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("ThreadTwo end");
	}

}
