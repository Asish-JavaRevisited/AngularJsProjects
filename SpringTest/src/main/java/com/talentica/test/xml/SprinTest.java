/**
 * 
 */
package com.talentica.test.xml;

/**
 * @author AsishS
 *
 */
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class SprinTest {
	   public static void main(String[] args) {

	      AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	      HelloSpring obj = (HelloSpring) context.getBean("helloWorld");
	      obj.getMessage();
	      context.registerShutdownHook();
	   }
	}
