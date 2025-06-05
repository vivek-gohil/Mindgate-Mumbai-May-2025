package com.mindgate.main.util;

import java.util.Comparator;

import com.mindgate.main.domain.Employee;

public class SortByName implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
}
