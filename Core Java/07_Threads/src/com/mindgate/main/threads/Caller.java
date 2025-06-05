package com.mindgate.main.threads;

import com.mindgate.main.resource.CallMe;

public class Caller implements Runnable {

	private CallMe callMe;
	private String message;

	public Caller(CallMe callMe, String message) {
		this.callMe = callMe;
		this.message = message;
	}

	@Override
	public void run() {
		callMe.call(message);
	}

}
