package com.mindgate.main;

import com.mindgate.main.domain.Current;

public class AccountMainV3 {
	public static void main(String[] args) {
		Current current = new Current(101, "Test 1", 5000, 50000);

		System.out.println("withdraw = 4000");
		current.withdraw(4000);
		System.out.println("Balance : " + current.getBalance()); // 1000
		System.out.println("Overdraft Balance : " + current.getOverdraftBalance()); // 50000

		System.out.println();

		System.out.println("withdraw = 5000");
		current.withdraw(5000);
		System.out.println("Balance : " + current.getBalance()); // 0
		System.out.println("Overdraft Balance : " + current.getOverdraftBalance()); // 46000

		System.out.println();

		System.out.println("withdraw = 3000");
		current.withdraw(3000);
		System.out.println("Balance : " + current.getBalance()); // 0
		System.out.println("Overdraft Balance : " + current.getOverdraftBalance()); // 43000
		
		System.out.println();

		System.out.println("deposit = 5000");
		current.deposit(5000);
		System.out.println("Balance : " + current.getBalance()); // 0
		System.out.println("Overdraft Balance : " + current.getOverdraftBalance()); // 48000
		
		System.out.println();

		System.out.println("deposit = 10000");
		current.deposit(10000);
		System.out.println("Balance : " + current.getBalance()); // 8000
		System.out.println("Overdraft Balance : " + current.getOverdraftBalance()); // 50000
		
		System.out.println();

		System.out.println("deposit = 5000");
		current.deposit(5000);
		System.out.println("Balance : " + current.getBalance()); // 13000
		System.out.println("Overdraft Balance : " + current.getOverdraftBalance()); // 50000		

	}
}
