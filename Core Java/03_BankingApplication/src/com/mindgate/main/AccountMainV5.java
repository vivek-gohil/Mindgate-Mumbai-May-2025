package com.mindgate.main;

import com.mindgate.main.domain.Current;
import com.mindgate.main.domain.Savings;

public class AccountMainV5 {
	public static void main(String[] args) {
		Savings savings = new Savings("Vivek Gohil", 5000, true);
		Savings savings2 = new Savings("Samarth Patil", 7000, false);
		Current current = new Current("Reema", 50000, 500000);

		System.out.println(savings2); // 10002,Samarth Patil, 7000 , false
		System.out.println(savings); // 10001,Vivek Gohil, 5000 , true
		System.out.println(current); // 10003,Reema,50000,500000

	}
}
