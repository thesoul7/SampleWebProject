package com.edgebrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class EdgeBrowser {
	public static WebDriver driver;
	public static void main(String[] args) {
		//System.setProperty("webdriver.edge.driver", "E:\\jun30\\Ox-Web\\edgeDriver\\msedgedriver.exe");
		/*
		 * DesiredCapabilities dc = new DesiredCapabilities();
		 * dc.setCapability("marionatte", false); EdgeOptions opt = new EdgeOptions();
		 * opt.merge(dc); driver=new EdgeDriver(opt);
		 */
		DesiredCapabilities cap = new DesiredCapabilities();
		System.out.println(setCap(cap));;
		Object obj = setCap(cap);
		cap=converToCap(obj);
		System.out.println(cap);
		/*
		 * driver=setCapForEdgeBrowser(driver,
		 * "E:\\jun30\\Ox-Web\\edgeDriver\\msedgedriver.exe");
		 * 
		 * driver.manage().window().maximize(); driver.get("https://demo.actitime.com");
		 */
		
	}
	
	public static Object setCap(DesiredCapabilities cap) {
		Object obj= null;
		try {
			cap.setCapability("marionatte", false);
			EdgeOptions opt = new EdgeOptions();
			obj = opt.merge(cap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	public static DesiredCapabilities converToCap(Object obj) {
		DesiredCapabilities cap = null;
		if (obj instanceof EdgeOptions) {
			try {
				cap=(DesiredCapabilities)obj;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			throw new ClassCastException();
		}
		return cap;
	}
	
	public static WebDriver setCapForEdgeBrowser(WebDriver driver, String driverPath) {
		try {
			System.setProperty("webdriver.edge.driver", driverPath);
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}
}
