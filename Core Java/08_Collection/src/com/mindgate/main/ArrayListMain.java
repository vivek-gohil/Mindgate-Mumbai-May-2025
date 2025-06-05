package com.mindgate.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.mindgate.main.domain.Employee;

public class ArrayListMain {
	public static void main(String[] args) {
		System.out.println("1. ArrayList");
		List<Integer> numbersList = new ArrayList<Integer>();
		System.out.println(numbersList.size());
		numbersList.add(1);
		numbersList.add(2);
		numbersList.add(1);
		numbersList.add(2);

		System.out.println(numbersList.size());
		System.out.println(numbersList.toString());
		numbersList.remove(1);
		System.out.println(numbersList.toString());
		numbersList.remove(Integer.valueOf(2));
		System.out.println(numbersList.toString());
		System.out.println(numbersList.contains(2));
		numbersList.add(6);
		numbersList.add(2);
		numbersList.add(4);
		numbersList.add(5);
		System.out.println(numbersList.toString());
		Collections.sort(numbersList);
		System.out.println(numbersList.toString());

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(101, "Amey", 5000));
		employeeList.add(new Employee(100, "Mahesh", 7000));
		employeeList.add(new Employee(110, "Abhishek", 7000));
		employeeList.add(new Employee(109, "Priyanka", 5000));
		employeeList.add(new Employee(100, "Mahesh", 7000));
		employeeList.add(new Employee(100, "Mahesh", 7000));
		printEmployeeList(employeeList);
		System.out.println(employeeList.remove(new Employee(100, "Mahesh", 7000)));
		System.out.println();
		printEmployeeList(employeeList);
	}

	public static void printEmployeeList(List<Employee> employeeList) {
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
}
