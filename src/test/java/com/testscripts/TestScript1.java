package com.testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.generic.BaseClass;
import com.pomclass.CreateTask;

public class TestScript1 extends BaseClass {
	
	@Test
	public void creatingTask() {
		String customerName = "Big Bang Company";
		String projectName = "Flight operations";
		String taskName ="Contact";
		CreateTask ct = new CreateTask(driver);
		ct.creatingTask(driver, customerName, projectName, taskName);
	}
	 
}
