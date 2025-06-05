package com.mindgate.main.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.repository.EmployeeCRUDRepository;

public class EmployeeCRUDRepositoryImpl implements EmployeeCRUDRepository {

	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "training_mumbai";
	private String password = "training_mumbai";
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	private int count;

	private static final String SELECT_ALL_EMPLOYEES = "SELECT * FROM employee_details";
	private static final String SELECT_ONE_EMPLOYEE = "SELECT * FROM employee_details WHERE employee_id=?";
	private static final String INSERT_EMPLOYEE = "INSERT INTO employee_details VALUES(?,?,?)";
	private static final String UPDATE_EMPLOYEE_NAME = "UPDATE employee_details SET name=? WHERE employee_id=?";
	private static final String UPDATE_EMPLOYEE_SALARY = "UPDATE employee_details SET salary=? WHERE employee_id=?";
	private static final String DELETE_EMPLOYEE = "DELETE employee_details WHERE employee_id=?";
	private static final String GENERATE_EMPLOYEE_ID = "SELECT employee_id_seq.NEXTVAL FROM dual";

	private int generateEmployeeId() {
		try {
			// 1. Load Driver
			Class.forName(driver);
			System.out.println("Driver loaded successfully");
			// 2. Connect Database
			connection = DriverManager.getConnection(url, user, password);
			if (connection != null) {
				System.out.println("Connection successfull");
				preparedStatement = connection.prepareStatement(GENERATE_EMPLOYEE_ID);
				resultSet = preparedStatement.executeQuery();
				if (resultSet.next()) {
					int employeeId = resultSet.getInt(1);
					return employeeId;
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Failed to load driver");
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println("Failed to connect database");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
					connection = null;
				}
			} catch (SQLException e) {
				System.out.println("Failed to close connection");
				System.out.println(e.getMessage());
			}
		}
		return 0;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = new ArrayList<Employee>();
		try {
			// 1. Load Driver
			Class.forName(driver);
			System.out.println("Driver loaded successfully");
			// 2. Connect Database
			connection = DriverManager.getConnection(url, user, password);
			if (connection != null) {
				System.out.println("Connection successfull");
				preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEES);
				resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					int employeeId = resultSet.getInt("employee_id");
					String name = resultSet.getString("name");
					double salary = resultSet.getDouble("salary");

					Employee employee = new Employee(employeeId, name, salary);
					employeeList.add(employee);
				}
				return employeeList;

			}
		} catch (ClassNotFoundException e) {
			System.out.println("Failed to load driver");
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println("Failed to connect database");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
					connection = null;
				}
			} catch (SQLException e) {
				System.out.println("Failed to close connection");
				System.out.println(e.getMessage());
			}
		}
		return null;
	}

	@Override
	public int addNewEmployee(Employee employee) {
		int employeeId = generateEmployeeId();
		employee.setEmployeeId(employeeId);
		try {
			// 1. Load Driver
			Class.forName(driver);
			System.out.println("Driver loaded successfully");
			// 2. Connect Database
			connection = DriverManager.getConnection(url, user, password);
			if (connection != null) {
				System.out.println("Connection successfull");
				preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE);
				preparedStatement.setInt(1, employeeId);
				preparedStatement.setString(2, employee.getName());
				preparedStatement.setDouble(3, employee.getSalary());
				count = preparedStatement.executeUpdate();
				if (count > 0) {
					return employeeId;
				}

			}
		} catch (ClassNotFoundException e) {
			System.out.println("Failed to load driver");
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println("Failed to connect database");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
					connection = null;
				}
			} catch (SQLException e) {
				System.out.println("Failed to close connection");
				System.out.println(e.getMessage());
			}
		}
		return 0;
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		try {
			// 1. Load Driver
			Class.forName(driver);
			System.out.println("Driver loaded successfully");
			// 2. Connect Database
			connection = DriverManager.getConnection(url, user, password);
			if (connection != null) {
				System.out.println("Connection successfull");
				preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE);
				preparedStatement.setInt(1, employeeId);
				count = preparedStatement.executeUpdate();
				if (count > 0)
					return true;
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Failed to load driver");
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println("Failed to connect database");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
					connection = null;
				}
			} catch (SQLException e) {
				System.out.println("Failed to close connection");
				System.out.println(e.getMessage());
			}
		}
		return false;
	}

	@Override
	public Employee updateEmployeeName(Employee employee) {
		try {
			// 1. Load Driver
			Class.forName(driver);
			System.out.println("Driver loaded successfully");
			// 2. Connect Database
			connection = DriverManager.getConnection(url, user, password);
			if (connection != null) {
				System.out.println("Connection successfull");
				preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE_NAME);
				preparedStatement.setString(1, employee.getName());
				preparedStatement.setInt(2, employee.getEmployeeId());
				count = preparedStatement.executeUpdate();
				if (count > 0)
					return getEmployeeByEmployeeId(employee.getEmployeeId());
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Failed to load driver");
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println("Failed to connect database");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
					connection = null;
				}
			} catch (SQLException e) {
				System.out.println("Failed to close connection");
				System.out.println(e.getMessage());
			}
		}
		return null;
	}

	@Override
	public Employee updateEmployeeSalary(Employee employee) {
		try {
			// 1. Load Driver
			Class.forName(driver);
			System.out.println("Driver loaded successfully");
			// 2. Connect Database
			connection = DriverManager.getConnection(url, user, password);
			if (connection != null) {
				System.out.println("Connection successfull");
				preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE_SALARY);
				preparedStatement.setDouble(1, employee.getSalary());
				preparedStatement.setInt(2, employee.getEmployeeId());
				count = preparedStatement.executeUpdate();
				if (count > 0)
					return getEmployeeByEmployeeId(employee.getEmployeeId());
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Failed to load driver");
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println("Failed to connect database");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
					connection = null;
				}
			} catch (SQLException e) {
				System.out.println("Failed to close connection");
				System.out.println(e.getMessage());
			}
		}
		return null;
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		try {
			// 1. Load Driver
			Class.forName(driver);
			System.out.println("Driver loaded successfully");
			// 2. Connect Database
			connection = DriverManager.getConnection(url, user, password);
			if (connection != null) {
				System.out.println("Connection successfull");
				preparedStatement = connection.prepareStatement(SELECT_ONE_EMPLOYEE);
				preparedStatement.setInt(1, employeeId);
				resultSet = preparedStatement.executeQuery();
				if (resultSet.next()) {
					employeeId = resultSet.getInt("employee_id");
					String name = resultSet.getString("name");
					double salary = resultSet.getDouble("salary");

					Employee employee = new Employee(employeeId, name, salary);
					return employee;
				}

			}
		} catch (ClassNotFoundException e) {
			System.out.println("Failed to load driver");
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println("Failed to connect database");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
					connection = null;
				}
			} catch (SQLException e) {
				System.out.println("Failed to close connection");
				System.out.println(e.getMessage());
			}
		}
		return null;
	}

}
