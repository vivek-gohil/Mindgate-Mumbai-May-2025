package com.mindgate.main.domain;

import java.util.Objects;

public class Savings extends Account implements Comparable<Account> {
	private boolean isSalary;
	private static final double MINIMUM_BALANCE = 750;

	public Savings() {
		// TODO Auto-generated constructor stub
	}

	public Savings(String name, double balance, boolean isSalary) {
		super(name, balance);
		this.isSalary = isSalary;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(isSalary);
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
		Savings other = (Savings) obj;
		return isSalary == other.isSalary;
	}

	@Override
	public String toString() {
		return "Savings [isSalary=" + isSalary + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Account account) {
		return this.getName().compareTo(account.getName());
	}

}
