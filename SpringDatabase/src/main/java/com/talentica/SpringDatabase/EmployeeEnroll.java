package com.talentica.SpringDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;


public class EmployeeEnroll {
	
	private EmployeeDetails employee;
	private DataSource dataSource;
	
	public EmployeeEnroll()
	{
		
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public EmployeeEnroll(EmployeeDetails employee)   {
		this.employee=employee;		
	}
	
	public void EnrollEmployees()
	{
		String sql = "INSERT INTO employee_db " + "(NAME, ID) VALUES (?, ?)";
		System.out.println("Employee Details: " + employee.getName() +" "+ employee.getId());
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, employee.getName());
			ps.setInt(2, employee.getId());
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}
}
