/**
 * 
 */
package com.talentica.SpringDatabase;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @author AsishS
 *
 */
@Configuration
@ComponentScan
public class EmpConfig {

	@Bean
	DataSource dataSource() {
		DataSource dataSource = new DriverManagerDataSource(
				"jdbc:mysql://localhost:3306/myconnection", "root", "password123");
		return dataSource;
	}

	@Bean
	EmployeeDetails empDetails() {
		return new EmployeeDetails("xygb", 21347);
	}

	@Bean
	EmployeeEnroll enroll() {
		EmployeeEnroll employeeEnroll = new EmployeeEnroll(empDetails());
		employeeEnroll.setDataSource(dataSource());
		return employeeEnroll;
	}
}
