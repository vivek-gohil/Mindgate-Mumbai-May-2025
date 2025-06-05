package com.mindgate.main;

import java.util.Arrays;

import com.mindgate.main.domain.Account;
import com.mindgate.main.domain.Current;
import com.mindgate.main.domain.Savings;

public class AccountMainV6 {
	public static void main(String[] args) {
		Savings savings = new Savings("Mahesh", 50000, false);
		Savings savings2 = new Savings("Abhishek", 5000, false);
		Savings savings3 = new Savings("Amey", 50000, false);
		Savings savings4 = new Savings("Utkesrsh", 70000, false);
		Current current = new Current("Test", 5000, 50000);
		Account[] savingsArray = { savings, savings2, savings3, savings4, current };

		for (Account s : savingsArray) {
			System.out.println(s);
		}

		Arrays.sort(savingsArray);
		System.out.println();

		for (Account s : savingsArray) {
			System.out.println(s);
		}

	}
}
