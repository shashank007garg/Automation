package com.bts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bts.base.BasePageObject;
import com.bts.base.BaseTest;

public class LoginPage extends BasePageObject<LoginPage>{

	private static final String url="https://www.dice.com/dashboard/login";
	private By emailField=By.xpath("//*[@id='email']");
	private By pwdField=By.xpath("//*[@id='password']");
	private By sigin=By.xpath("//*[@id='loginDataSubmit']/div[3]/div/button");
	private By errorMessage=By.xpath("//*[@id='loginDataSubmit']/div[2]/div[1]/div/div");
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void openLoginPage(){
		getPage(url);
		
	}
	
	public void fillUpEmailandPwd(String email,String pwd){
		type(email,emailField);
		type(pwd,pwdField);
		
	}

	public HomePage pushSignInButton(){
		click(sigin);
		return new HomePage(driver);
		
		
		
	}

	public String getLoginErrorMessage() {
		waitForVisibilityOf(errorMessage, 10);
		return getText(errorMessage);
	}
}
