package com.mindgate.main.resource;

public class CallMe {
	public synchronized void call(String message) {
		System.out.print("[");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(message);
		System.out.print("]");
	}
}
