package com.mindgate.main.repository.impl;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.repository.EmployeeCRUDRepository;

public class EmployeeCRUDRepositoryImpl implements EmployeeCRUDRepository {

	private List<Employee> employeeList = new ArrayList<Employee>();

	@Override
	public boolean addNewEmployee(Employee employee) {
		return employeeList.add(employee);
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		Employee employee = getEmployeeByEmployeeId(employeeId);
		if (employee != null) {
			employeeList.remove(employee);
			return true;
		}
		return false;
	}

	@Override
	public Employee updateEmployeeName(Employee employee) {
		for (Employee e : employeeList) {
			if (e.getEmployeeId() == employee.getEmployeeId()) {
				e.setName(employee.getName());
				return e;
			}
		}
		return null;
	}

	@Override
	public Employee updateEmployeeSalary(Employee employee) {
		for (Employee e : employeeList) {
			if (e.getEmployeeId() == employee.getEmployeeId()) {
				e.setSalary(employee.getSalary());
				return e;
			}
		}
		return null;
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		for (Employee employee : employeeList) {
			if (employee.getEmployeeId() == employeeId) {
				return employee;
			}
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeList;
	}

}
