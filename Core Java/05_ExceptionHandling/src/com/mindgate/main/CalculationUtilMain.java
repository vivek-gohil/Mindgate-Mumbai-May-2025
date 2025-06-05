package com.mindgate.main;

import com.mindgate.main.util.CalculationUtil;

public class CalculationUtilMain {
	public static void main(String[] args) {
		System.out.println("main start");

		CalculationUtil calculationUtil = new CalculationUtil();
		calculationUtil.accept();
		calculationUtil.calculate();
		calculationUtil.display();

		System.out.println("main end");
	}
}
