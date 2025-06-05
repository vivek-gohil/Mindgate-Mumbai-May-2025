package com.mindgate.main.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculationUtil {
	private double numberOne, numberTwo, result;

	public void accept() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("First Number");
			numberOne = scanner.nextDouble();
			System.out.println("Second Number");
			numberTwo = scanner.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Exception Occurs");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Thank you");
		}
	}

	public void calculate() {
		System.out.println("Calculating Result");
		result = numberOne / numberTwo;
	}

	public void display() {
		System.out.println("Result = " + result);
	}
}
