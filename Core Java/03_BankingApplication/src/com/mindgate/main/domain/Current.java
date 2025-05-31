package com.mindgate.main.domain;

public class Current extends Account {
	private double overdraftBalance;
	private double initialOverdraftBalance;

	public Current() {
		System.out.println("Default constructor of Current");
	}

	public Current(int accountId, String name, double balance, double overdraftBalance) {
		super(accountId, name, balance);
		this.overdraftBalance = overdraftBalance;
		initialOverdraftBalance = overdraftBalance;
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

}
