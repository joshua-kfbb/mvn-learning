package com.mycompany.app;

import org.junit.Assert;
import org.junit.Test;

public class ValidNameTest {
	@Test
	public void test(){
		Assert.assertTrue("Unexpected greeting.",Greeter.greetTo("Someone").equals("Hello, Someone!"));
	}
}
