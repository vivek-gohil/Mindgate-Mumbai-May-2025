package com.mindgate.main;

import com.mindgate.main.domain.Savings;

public class AccountMainV4 {
	public static void main(String[] args) {
		// One Savings object and print using toString
		Savings savings = new Savings(101, "Test Savings", 50000, true);
		System.out.println(savings);

		Savings savings2 = new Savings(101, "Test Savings", 50000, true);
		System.out.println(savings2);

		System.out.println(savings.equals(savings2));
	}
}
