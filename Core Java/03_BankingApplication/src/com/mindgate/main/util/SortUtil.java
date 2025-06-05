package com.mindgate.main.util;

import java.util.Arrays;

import com.mindgate.main.domain.Account;

public class SortUtil {
	public void print(Account[] accounts) {
		Arrays.sort(accounts);

		for (Account account : accounts) {
			System.out.println(account);
		}
	}
}
