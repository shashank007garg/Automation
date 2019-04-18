package com.bts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bts.base.BaseTest;
import com.bts.pages.HomePage;
import com.bts.pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void positiveLoginTest() {
		
		
		LoginPage loginpage = new LoginPage(driver);
		String ExpectedPageTitle = "Seeker Dashboard - Profile";
		String correctProfileName = "shashank garg";
		// open dice login page--https://www.dice.com/dashboard/login
		loginpage.openLoginPage();

		// fill up email and pwd
		loginpage.fillUpEmailandPwd("shashankgarg006@gmail.com", "Viacom@123");

		// push signin button and wait for page to load
		HomePage homepage = loginpage.pushSignInButton();
		homepage.waitForHomePageToLoad();
		// verification
		System.out.println("verification");

		String actualTitle = homepage.getTitle();
		Assert.assertTrue(ExpectedPageTitle.equals(actualTitle),
				"page title is not expected.\nExpected:" + ExpectedPageTitle
						+ "\nActualTitle:" + actualTitle);
		System.out.println("under page");

		Assert.assertTrue(homepage.isCorrectProfileLoaded(correctProfileName),
				"Profile name is not expected");
	}

	@Test
	public void negativeLoginTest() {
		String expectedErorMessage = "Email and/or password incorrect.";

		LoginPage loginpage = new LoginPage(driver);

		// open dice login page--https://www.dice.com/dashboard/login
		loginpage.openLoginPage();

		// fill up email and pwd
		loginpage.fillUpEmailandPwd("shashankgarg00644@gmail.com", "Viacom@123");

		// push signin button
		loginpage.pushSignInButton();
		
		String errorMessage=loginpage.getLoginErrorMessage();
		
		Assert.assertTrue(errorMessage.contains(expectedErorMessage),
				"error message is not expected" + expectedErorMessage
						+ "\n ActualError Message:" + errorMessage);
		System.out.println("under page");
		

	}
}
