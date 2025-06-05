package com.mindgate.main.domain;

import java.util.Objects;

public class Current extends Account implements Comparable<Account> {
	private double overdraftBalance;
	private double initialOverdraftBalance;

	public Current() {
		System.out.println("Default constructor of Current");
	}

	public Current(String name, double balance, double overdraftBalance) {
		super(name, balance);
		this.overdraftBalance = overdraftBalance;
		initialOverdraftBalance = overdraftBalance;
		System.out.println("Parameterized overloaded constructor of Current");
	}

	public Current(int accountId, String name, double balance, double overdraftBalance) {
		super(accountId, name, balance);
		this.overdraftBalance = overdraftBalance;
		initialOverdraftBalance = overdraftBalance;
		System.out.println("Parameterized overloaded constructor of Current");
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount > getBalance() && amount < getBalance() + overdraftBalance) {
			amount = amount - getBalance();
			setBalance(0);
			overdraftBalance -= amount;
			return true;
		}
		return super.withdraw(amount);
	}

	@Override
	public boolean deposit(double amount) {
		if (initialOverdraftBalance > overdraftBalance) {
			if (amount > (initialOverdraftBalance - overdraftBalance)) {
				amount -= (initialOverdraftBalance - overdraftBalance);
				setBalance(amount);
				overdraftBalance = initialOverdraftBalance;
				return true;
			} else {
				overdraftBalance += amount;
				return true;
			}
		} else {
			return super.deposit(amount);
		}
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
		initialOverdraftBalance = overdraftBalance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(overdraftBalance);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Current other = (Current) obj;
		return Double.doubleToLongBits(overdraftBalance) == Double.doubleToLongBits(other.overdraftBalance);
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", getAccountId()=" + getAccountId() + ", getName()="
				+ getName() + ", getBalance()=" + getBalance() + "]";
	}

	@Override
	public int compareTo(Account account) {
		return this.getName().compareTo(account.getName());
	}

}
