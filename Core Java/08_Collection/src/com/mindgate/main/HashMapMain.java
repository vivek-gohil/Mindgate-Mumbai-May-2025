package com.mindgate.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mindgate.main.domain.Employee;

public class HashMapMain {
	public static void main(String[] args) {
//		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
//		employeeMap.put(101, "Amey");
//		employeeMap.put(102, "Mahesh");
//		employeeMap.put(106, "Sahil");
//		employeeMap.put(103, "Abhishek");
//		employeeMap.put(104, "Avinash");
//		employeeMap.put(105, "Amey");
//
//		System.out.println(employeeMap);

		Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
		Employee employee = new Employee(101, "Amey", 5000);
		employeeMap.put(employee.getEmployeeId(), employee);
		Employee employee2 = new Employee(102, "Abhishek", 5000);
		employeeMap.put(employee2.getEmployeeId(), employee2);
		Employee employee3 = new Employee(103, "Mahesh", 5000);
		employeeMap.put(employee3.getEmployeeId(), employee3);
		System.out.println(employeeMap);
		printEmployees(employeeMap);
	}

	public static void printEmployees(Map<Integer, Employee> employees) {
		Set<Integer> employeeIdSet = employees.keySet();
		for (Integer integer : employeeIdSet) {
			System.out.println(employees.get(integer));
		}
	}

}
