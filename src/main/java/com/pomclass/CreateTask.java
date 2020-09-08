package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTask {

	@FindBy(xpath="//span[text()='New']")
	private WebElement New;
	

	@FindBy(xpath="(//div[@class='selectedItem'])[5]")
	private WebElement selectCustomer;
	
	@FindBy(xpath="(//div[@class='inputPlaceholder'])[6]")
	private WebElement selectCustomer1;
	
	@FindBy(xpath="//span[@class='highlightToken']")
	private WebElement selectCustomerSuggestion;
	
	@FindBy(xpath="(//div[@class='selectedItem'])[6]")
	private WebElement selectProject;
	
	@FindBy(xpath="(//div[@class='inputPlaceholder'])[7]")
	private WebElement selectProject1;
	
	@FindBy(xpath="//div[@class='itemRow cpItemRow selected']")
	private WebElement selectProjectSuggestion;
	
	@FindBy(xpath="(//input[@placeholder='Enter task name'])[1]")
	private WebElement enterTaskName;
	
	
	@FindBy(xpath="xpath = //div[text()='Create Tasks']")
	private WebElement CreateTask;
	
	
	public CreateTask(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void creatingTask(WebDriver driver, String customerName,String projectName,String taskName) {
		try {
			New.click();
			selectCustomer.click();
			selectCustomer1.sendKeys(customerName);
			selectCustomerSuggestion.click();
			selectProject.click();
			selectProject1.sendKeys(projectName);
			selectProjectSuggestion.click();
			CreateTask.sendKeys(taskName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
