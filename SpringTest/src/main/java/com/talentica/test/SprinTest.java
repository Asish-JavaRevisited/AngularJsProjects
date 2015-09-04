/**
 * 
 */
package com.talentica.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author AsishS
 *
 */
public class SprinTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringMain.class);
		HelloSpring helloSpring = (HelloSpring) context.getBean("name");
		helloSpring.HelloWorld();
		context.close();
	}
}
