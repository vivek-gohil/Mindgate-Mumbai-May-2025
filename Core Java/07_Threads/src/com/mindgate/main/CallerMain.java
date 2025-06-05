package com.mindgate.main;

import com.mindgate.main.resource.CallMe;
import com.mindgate.main.threads.Caller;

public class CallerMain {
	public static void main(String[] args) {
		CallMe callMe = new CallMe();

		Caller caller1 = new Caller(callMe, "Hi");
		Caller caller2 = new Caller(callMe, "Hello");
		Caller caller3 = new Caller(callMe, "How are you");

		Thread thread1 = new Thread(caller1);
		Thread thread2 = new Thread(caller2);
		Thread thread3 = new Thread(caller3);

		thread1.start();
		thread2.start();
		thread3.start();
	}
}
