package com.mindgate.main.threads;

public class ThreadOne extends Thread {
	@Override
	public void run() {
		System.out.println("ThreadOne start");
		for (int i = 0; i < 1000; i++) {
			System.out.println("Thread One :: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("ThreadOne end");
	}
}
