package com.talentica.Spring.Annotations;

import org.springframework.context.annotation.Bean;

public class HelloWorldConfig {
	
	 @Bean 
	   public HelloWorld helloWorld(){
	      return new HelloWorld();
	   }

}
