package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.main.service.AdditionService;

public class AdditionServiceMainV2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double numberOne, numberTwo, result;

		System.out.println("Enter numberOne");
		numberOne = scanner.nextDouble();
		System.out.println("Enter numberTwo");
		numberTwo = scanner.nextDouble();

		AdditionService additionService = new AdditionService();

		result = additionService.calculate(numberOne, numberTwo);

		System.out.println("Addition of " + numberOne + " and " + numberTwo + " is " + result);

	}

}
