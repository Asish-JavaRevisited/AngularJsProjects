/**
 * 
 */
package com.talentica.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author AsishS
 *
 */
@Configuration
public class SpringMain {

	@Bean(name="name")
	HelloSpring helloSpring(){
		return new HelloSpring();
	}
}
