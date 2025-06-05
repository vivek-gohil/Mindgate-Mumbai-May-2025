package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.domain.Employee;

public interface EmployeeCRUDRepository {
	public int addNewEmployee(Employee employee);

	public boolean deleteEmployeeByEmployeeId(int employeeId);

	public Employee updateEmployeeName(Employee employee);

	public Employee updateEmployeeSalary(Employee employee);

	public Employee getEmployeeByEmployeeId(int employeeId);

	public List<Employee> getAllEmployees();
}
