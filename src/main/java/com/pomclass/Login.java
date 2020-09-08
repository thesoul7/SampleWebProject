package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

@FindBy(id="username")
private WebElement userName;
@FindBy(name="pwd")
private WebElement passWord;
@FindBy(id="loginButton")
private WebElement loginButton;

public Login(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void enterUserName(String input) {
	userName.sendKeys(input);
}

public void enterpassword(String input) {
	passWord.sendKeys(input);
}
public void clickOnLoginButton() {
	loginButton.click();
}
	
}
