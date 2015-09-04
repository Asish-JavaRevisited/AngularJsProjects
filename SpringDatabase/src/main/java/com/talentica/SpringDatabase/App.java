package com.talentica.SpringDatabase;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				EmpConfig.class);
		// ApplicationContext context= new
		// ClassPathXmlApplicationContext("Spring-Module.xml");

		EmployeeEnroll empEnrol = (EmployeeEnroll) context.getBean(EmployeeEnroll.class);
		empEnrol.setDataSource((DataSource) context.getBean("dataSource"));
		empEnrol.EnrollEmployees();

		System.out.println("Successful ");
		context.close();
	}
}
