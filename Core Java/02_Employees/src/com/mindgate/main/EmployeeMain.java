package com.mindgate.main;

import com.mindgate.main.domain.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
//		Employee employee = new Employee(); // 0 , NULL , 0.0
//		employee.setEmployeeId(101);
//		employee.setName("Raj");
//		employee.setSalary(5000);
		Employee employee = new Employee(101, "Raj", 5000);
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());

		System.out.println("------------------------------");

//		Employee employee2 = new Employee();
//		employee2.setEmployeeId(102);
//		employee2.setName("Reema");
//		employee2.setSalary(6000);
		Employee employee2 = new Employee(102, "Reema", 6000);
		System.out.println(employee2.getEmployeeId());
		System.out.println(employee2.getName());
		System.out.println(employee2.getSalary());

	}

}
