package com.bts.pages;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

import com.bts.base.BasePageObject;

public class HomePage extends BasePageObject<HomePage>{

	private By editProfileButton=By.xpath("//button[@id='editProfile']");
	private By advanceSearch=By.xpath("//a[@class='dice-btn-link']");
	private By profileContactName=By.cssSelector(".profile-contact-name");
	protected HomePage(WebDriver driver) {
		super(driver);
		
	}
	public void waitForHomePageToLoad(){
		
		waitForVisibilityOf(editProfileButton);
		waitForVisibilityOf(advanceSearch,10);
		
	}
	
	public boolean isCorrectProfileLoaded(String correctProfileName){
		
		if(getText(profileContactName).equals(correctProfileName)){
			return true;
		}
		return false;
	}

}
