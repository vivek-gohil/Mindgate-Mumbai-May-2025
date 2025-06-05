package com.mindgate.main;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.util.SortByName;

public class TreeMapMain {
	public static void main(String[] args) {
		SortByName byName = new SortByName();
		Map<Employee, Boolean> employeeDetailsMap = new TreeMap<Employee, Boolean>();

		Employee employee = new Employee(102, "Amey", 5000);
		employeeDetailsMap.put(employee, true);
		Employee employee2 = new Employee(103, "Abhishek", 5000);
		employeeDetailsMap.put(employee2, false);
		Employee employee3 = new Employee(101, "Mahesh", 5000);
		employeeDetailsMap.put(employee3, true);
		printEmployees(employeeDetailsMap);

	}

	public static void printEmployees(Map<Employee, Boolean> employees) {
		Set<Employee> employeeSet = employees.keySet();
		for (Employee employee : employeeSet) {
			System.out.println(employee + " -> " + employees.get(employee));
		}
	}

}
