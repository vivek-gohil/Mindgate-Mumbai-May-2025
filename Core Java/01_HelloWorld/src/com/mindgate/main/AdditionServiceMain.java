package com.mindgate.main;

import com.mindgate.main.service.AdditionService;

public class AdditionServiceMain {

	public static void main(String[] args) {
		System.out.println("main start");
		AdditionService additionService = new AdditionService();
		additionService.acceptNumbers();
		System.out.println("--------------------------");
		additionService.calculate();
		System.out.println("--------------------------");
		additionService.displayResult();
		System.out.println("main end");
	}

}
