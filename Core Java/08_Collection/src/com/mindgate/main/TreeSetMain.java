package com.mindgate.main;

import java.util.Set;
import java.util.TreeSet;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.util.SortByName;

public class TreeSetMain {
	public static void main(String[] args) {
//		SortedSet<String> nameSet = new TreeSet<String>();
//		nameSet.add("Sarvesh");
//		nameSet.add("Pavan");
//		nameSet.add("Prathamesh");
//		nameSet.add("Darshan");
//		nameSet.add("Avinash");
//		nameSet.add("Sahil");
//
//		System.out.println(nameSet);
//
//		nameSet.remove("Avinash");
//
//		System.out.println(nameSet);
//
//		System.out.println("Contains Sahil ?? =  " + nameSet.contains("Sahil"));

		SortByName byName = new SortByName();
		Set<Employee> employeeSet = new TreeSet<Employee>(byName);
		employeeSet.add(new Employee(101, "Amey", 5000));
		employeeSet.add(new Employee(100, "Mahesh", 7000));
		employeeSet.add(new Employee(110, "Abhishek", 7000));
		employeeSet.add(new Employee(109, "Priyanka", 5000));
		employeeSet.add(new Employee(100, "Mahesh", 7000));
		employeeSet.add(new Employee(100, "Mahesh", 7000));
		employeeSet.add(new Employee(110, "Abhishek", 7000));
		printEmployeeSet(employeeSet);
		System.out.println("Removing Abhishek");
		employeeSet.remove(new Employee(110, "Abhishek", 7000));
		printEmployeeSet(employeeSet);
		System.out.println("Searching Abhishek");
		System.out.println(employeeSet.contains(new Employee(110, "Abhishek", 7000)));

	}

	public static void printEmployeeSet(Set<Employee> employeeSet) {
		for (Employee employee : employeeSet) {
			System.out.println(employee);
		}
	}
}
