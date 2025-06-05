package com.mindgate.main;

import java.util.List;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.service.EmployeeCRUDService;
import com.mindgate.main.service.impl.EmployeeCRUDServiceImpl;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		
		EmployeeCRUDService employeeCRUDService = new EmployeeCRUDServiceImpl();

		List<Employee> employeeList = employeeCRUDService.getAllEmployees();

		for (Employee employee : employeeList) {
			System.out.println(employee);
		}

	}
}
