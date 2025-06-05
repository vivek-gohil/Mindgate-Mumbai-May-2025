package com.mindgate.main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.mindgate.main.domain.Employee;

public class HashSetMain {
	public static void main(String[] args) {
		Set<Integer> numbersSet = new HashSet<Integer>();
		System.out.println(numbersSet.add(101));
		System.out.println(numbersSet.add(101));
		System.out.println(numbersSet.add(10));
		System.out.println(numbersSet.add(111));
		System.out.println(numbersSet.add(112));
		System.out.println(numbersSet.add(111));
		System.out.println(numbersSet.add(10));
		System.out.println(numbersSet);
		System.out.println("Searching 112 :: " + numbersSet.contains(112));
		System.out.println("Removing 112 :: " + numbersSet.remove(54));

//		Set<Employee> employeeSet = new HashSet<Employee>();
//		employeeSet.add(new Employee(101, "Amey", 5000));
//		employeeSet.add(new Employee(100, "Mahesh", 7000));
//		employeeSet.add(new Employee(110, "Abhishek", 7000));
//		employeeSet.add(new Employee(109, "Priyanka", 5000));
//		employeeSet.add(new Employee(100, "Mahesh", 7000));
//		employeeSet.add(new Employee(100, "Mahesh", 7000));
//		employeeSet.add(new Employee(110, "Abhishek", 7000));
//		printEmployeeSet(employeeSet);
//		System.out.println("Removing Abhishek");
//		employeeSet.remove(new Employee(110, "Abhishek", 7000));
//		System.out.println();
//		printEmployeeSet(employeeSet);

	}

	public static void printEmployeeSet(Set<Employee> employeeSet) {
		for (Employee employee : employeeSet) {
			System.out.println(employee);
		}
	}
}
