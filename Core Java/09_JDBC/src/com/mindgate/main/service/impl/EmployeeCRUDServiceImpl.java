package com.mindgate.main.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.repository.EmployeeCRUDRepository;
import com.mindgate.main.repository.impl.EmployeeCRUDRepositoryImpl;
import com.mindgate.main.service.EmployeeCRUDService;

public class EmployeeCRUDServiceImpl implements EmployeeCRUDService {

	private EmployeeCRUDRepository employeeCRUDRepository = new EmployeeCRUDRepositoryImpl();

	@Override
	public int addNewEmployee(Employee employee) {
		return employeeCRUDRepository.addNewEmployee(employee);
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		return employeeCRUDRepository.deleteEmployeeByEmployeeId(employeeId);
	}

	@Override
	public Employee updateEmployeeName(Employee employee) {
		return employeeCRUDRepository.updateEmployeeName(employee);
	}

	@Override
	public Employee updateEmployeeSalary(Employee employee) {
		return employeeCRUDRepository.updateEmployeeSalary(employee);
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		return employeeCRUDRepository.getEmployeeByEmployeeId(employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeCRUDRepository.getAllEmployees();
	}

}
