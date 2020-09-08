package com.stringmanipulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveNonInteger {
public static void main(String[] args) {
	//System.out.println(removeNonValueFromGivenString("There are 2500 items in the bag"));
}

public void removeNonValueFromGivenString(String input) {
	String integer = input.replaceAll("[^?0-9]", "");
	System.out.println(integer);
}


public static void toHandleDynamicTable(WebDriver driver, String user,String pageName) {
	try {
		driver.findElement(By.xpath("//span[@class='userNameSpan'][text()='"+user+"']")).click();
		
	} catch (Exception e) {
		int count = 1;
		while(count<4) {
			try {
				Select s = new Select(driver.findElement(By.id("recordsPerPageSelector")));
				s.selectByIndex(count);
				driver.findElement(By.xpath("//span[@class='userNameSpan'][text()='"+user+"']")).click();
				break;
			} catch (Exception e2) {
				e.printStackTrace();
			}
			count++;
		}
		
		e.printStackTrace();
	}
}


}
