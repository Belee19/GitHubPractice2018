package com.anyaut.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPageFactory {
	WebDriver driver;

	@FindBy(id = "username")
	WebElement userName;  

	@FindBy(id = "password")  
	WebElement password;

	@FindBy(xpath = "//span[@class='soh']")
	WebElement eyeIcon;

	@FindBy(name = "submit")
	WebElement signIn;

	public SignInPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void enterUserName(String userId) {
		userName.sendKeys(userId);
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}

	public void clickEyeIcon() {
		eyeIcon.click();
	}

	public void clickSignIn() {
		signIn.click();
	}

}
