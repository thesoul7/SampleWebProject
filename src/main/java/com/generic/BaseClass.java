package com.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.pomclass.Login;

public class BaseClass {
public WebDriver driver;

@BeforeClass
public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "E:\\Test Optimize\\Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://demo.actitime.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}
@AfterClass
public void closeBrowser() {
	driver.quit();
}

@BeforeMethod
public void loginToApplication()
{
	if (driver!=null) {
		try {
			Login login = new Login(driver);
			login.enterUserName("admin");
			login.enterpassword("manager");
			login.clickOnLoginButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

@AfterMethod
public void logout() {
	try {
		driver.findElement(By.id("logoutLink")).click();
		System.out.println("logging out");
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
}
