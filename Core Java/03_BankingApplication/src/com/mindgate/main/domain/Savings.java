package com.mindgate.main.domain;

public class Savings extends Account {
	private boolean isSalary;
	private static final double MINIMUM_BALANCE = 750;

	public Savings() {
		// TODO Auto-generated constructor stub
	}

	public Savings(int accountId, String name, double balance, boolean isSalary) {
		super(accountId, name, balance);
		this.isSalary = isSalary;
	}

	@Override
	public boolean withdraw(double amount) {
		if (isSalary) {
			return super.withdraw(amount);
		} else {
			if (amount > 0 && getBalance() - amount >= MINIMUM_BALANCE) {
				setBalance(getBalance() - amount);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		return super.deposit(amount);
	}

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	public static double getMinimumBalance() {
		return MINIMUM_BALANCE;
	}

}
