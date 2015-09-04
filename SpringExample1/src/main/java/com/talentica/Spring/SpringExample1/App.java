package com.talentica.Spring.SpringExample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");
 
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();
    }
}
