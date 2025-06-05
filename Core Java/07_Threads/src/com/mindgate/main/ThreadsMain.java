package com.mindgate.main;

import com.mindgate.main.threads.ThreadOne;
import com.mindgate.main.threads.ThreadTwo;

public class ThreadsMain {
	public static void main(String[] args) {
		System.out.println("main start");
		Thread mainThread = Thread.currentThread();
		mainThread.setPriority(1);
		System.out.println(mainThread);

		System.out.println();

		ThreadOne threadOne = new ThreadOne();
		threadOne.setPriority(4);
		threadOne.start();

		ThreadTwo t2 = new ThreadTwo();
		Thread threadTwo = new Thread(t2);
		threadTwo.setPriority(10);
		threadTwo.start();

		for (int i = 0; i < 1000; i++) {
			System.out.println("main :: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();

		System.out.println("main end");
	}
}
