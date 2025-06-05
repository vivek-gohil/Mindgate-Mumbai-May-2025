package com.mindgate.main.domain;

import java.util.Objects;

public class Account {
	private int accountId;
	private String name;
	private double balance;
	private static int accountIdGenerator = 10001;

	public Account() {
		System.out.println("Default constructor of Account");
	}

	public Account(String name, double balance) {
		System.out.println("Parameterized overloaded constructor of Account");
		this.accountId = accountIdGenerator;
		this.name = name;
		this.balance = balance;
		accountIdGenerator = accountIdGenerator + 1;
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

	@Override
	public int hashCode() {
		return Objects.hash(accountId, balance, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return accountId == other.accountId
				&& Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", name=" + name + ", balance=" + balance + "]";
	}

}
