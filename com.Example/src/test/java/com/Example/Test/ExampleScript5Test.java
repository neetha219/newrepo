package com.Example.Test;

import org.testng.annotations.Test;

public class ExampleScript5Test {
	@Test
	public void practiceTest() 
	{
		System.out.println("testing");

		String url = System.getProperty("URL");
		String browser = System.getProperty("BROWSER");
		String username = System.getProperty("USERNAME");
		String password = System.getProperty("PASSWORD");
		
		System.out.println("url-----> "+url);
		System.out.println("browser-----> "+browser);
		System.out.println("username-----> "+username);
		System.out.println("password------> "+password);
		
     }
}
