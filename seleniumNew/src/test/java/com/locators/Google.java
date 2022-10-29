package com.locators;

// by name

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Google {

	WebDriver drv = null;

	@Test
	public void search() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver drv = new ChromeDriver();

		drv.manage().window().maximize();
		drv.manage().deleteAllCookies();
		drv.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		drv.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		drv.get("http://google.com/");
	
		
		drv.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		drv.findElement(By.name("btnK")).click();
	}
}
