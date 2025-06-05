package com.mindgate.main;

import java.util.List;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.service.EmployeeCRUDService;
import com.mindgate.main.service.impl.EmployeeCRUDServiceImpl;

public class EmployeeCRUDMain {
	public static void main(String[] args) {

		EmployeeCRUDService employeeCRUDService = new EmployeeCRUDServiceImpl();

		Employee employee = new Employee(0, "Rasika Patil", 50000);
		int employeeId = employeeCRUDService.addNewEmployee(employee);
		System.out.println(employeeId);
		
//		Employee updatedEmployee = employeeCRUDService.updateEmployeeSalary(employee);
//		System.out.println(updatedEmployee);

//		Employee employee = employeeCRUDService.getEmployeeByEmployeeId(432);
//		if (employee != null)
//			System.out.println(employee);
//		else
//			System.out.println("Invalid employeeId");

		List<Employee> employeeList = employeeCRUDService.getAllEmployees();

		for (Employee e : employeeList) {
			System.out.println(e);
		}

	}
}
