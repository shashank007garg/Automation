package com.bts;

import org.testng.annotations.Test;

import com.bts.base.BaseTest;

public class SecondTest extends BaseTest{

	@Test
	public void secondTestMethod(){
				 
		driver.get("http://google.com");
		  
	}
}
