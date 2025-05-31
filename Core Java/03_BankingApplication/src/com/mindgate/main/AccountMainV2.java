package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.main.domain.Account;
import com.mindgate.main.domain.Current;
import com.mindgate.main.domain.Savings;

public class AccountMainV2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account = null;
		int accountId;
		String name, continueChoice, strIsSalary;
		double balance, amount, overdraftBalance;
		int choice, accountChoice;
		boolean transactionStatus, isSalary;

		System.out.println("Enter accountId");
		accountId = scanner.nextInt();
		System.out.println("Enter name");
		name = scanner.next();
		System.out.println("Enter balance");
		balance = scanner.nextDouble();
		System.out.println("Account Menu");
		System.out.println("1. Savings Account");
		System.out.println("2. Current Account");
		System.out.println("Enter your choice");
		accountChoice = scanner.nextInt();
		if (accountChoice == 1) {
			System.out.println("Do you want to open Salary Account ");
			strIsSalary = scanner.next();
			if (strIsSalary.equalsIgnoreCase("yes"))
				isSalary = true;
			else
				isSalary = false;

			account = new Savings(accountId, name, balance, isSalary);
		}
		if (accountChoice == 2) {
			System.out.println("Enter overdraft balance");
			overdraftBalance = scanner.nextDouble();
			account = new Current(accountId, name, balance, overdraftBalance);

		}

		System.out.println("Account created !!");
		do {

			System.out.println("Menu");
			System.out.println("1. Withdraw ");
			System.out.println("2. Deposit ");
			System.out.println("3. Check Balance ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter amount to withdraw");
				amount = scanner.nextDouble();
				transactionStatus = account.withdraw(amount);
				if (transactionStatus) {
					System.out.println("Withdraw Transaction Successfull");
					System.out.println("Balance = " + account.getBalance());
					if (accountChoice == 2) {
						Current current = (Current) account;
						System.out.println("Overdraft Balance = " + current.getOverdraftBalance());
					}
				} else {
					System.out.println("Withdraw Transaction Failed");
					System.out.println("Balance = " + account.getBalance());
					if (accountChoice == 2) {
						Current current = (Current) account;
						System.out.println("Overdraft Balance = " + current.getOverdraftBalance());
					}
				}
				break;
			case 2:
				System.out.println("Enter amount to deposit");
				amount = scanner.nextDouble();
				transactionStatus = account.deposit(amount);
				if (transactionStatus) {
					System.out.println("Deposit Transaction Successfull");
					System.out.println("Balance = " + account.getBalance());
					if (accountChoice == 2) {
						Current current = (Current) account;
						System.out.println("Overdraft Balance = " + current.getOverdraftBalance());
					}
				} else {
					System.out.println("Deposit Transaction Failed");
					System.out.println("Balance = " + account.getBalance());
					if (accountChoice == 2) {
						Current current = (Current) account;
						System.out.println("Overdraft Balance = " + current.getOverdraftBalance());
					}
				}
				break;
			case 3:
				System.out.println("Balance = " + account.getBalance());
				if (accountChoice == 2) {
					Current current = (Current) account;
					System.out.println("Overdraft Balance = " + current.getOverdraftBalance());
				}
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do you want to continue");
			continueChoice = scanner.next();
		} while (continueChoice.equalsIgnoreCase("yes"));
		System.out.println("Thank you");

	}
}
