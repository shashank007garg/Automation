package com.bts.base;





import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {

	protected WebDriver driver;
	
	
	

	@Parameters({ "browser" })
	@BeforeMethod
	protected void methodSetUp(String browser) {
		System.out.println("under method");
		//log.info("Method setup");
		
		driver =BrowserFactory.getDriver(browser);
		
	}

	@AfterMethod
	protected void tearDown() {
		System.out.println("Method tearDown");
		driver.quit();
	}
}
