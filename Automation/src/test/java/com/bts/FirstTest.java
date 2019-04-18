package com.bts;


import org.testng.annotations.Test;

import com.bts.base.BaseTest;

public class FirstTest extends BaseTest{

	@Test
	public void firstTestMethod() {

		driver.get("http://bts-app-dev1:8090/index.php");

	}

}
