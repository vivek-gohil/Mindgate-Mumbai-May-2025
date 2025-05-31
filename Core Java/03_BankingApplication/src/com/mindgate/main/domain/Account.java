package com.mindgate.main.domain;

public class Account {
	private int accountId;
	private String name;
	private double balance;

	public Account() {
		System.out.println("Default constructor of Account");
	}

	public Account(int accountId, String name, double balance) {
		System.out.println("Parameterized overloaded constructor of Account");
		this.accountId = accountId;
		this.name = name;
		this.balance = balance;
	}

	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		}
		return false;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
