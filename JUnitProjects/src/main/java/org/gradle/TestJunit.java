package org.gradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit {

	   @Test
	   public void testAdd() {
	      String str= "Junit is working fine1";
	      assertEquals("Junit is working fine",str);
	   }
}
