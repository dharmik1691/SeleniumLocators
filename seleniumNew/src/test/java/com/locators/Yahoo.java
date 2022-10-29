package com.locators;

//linktext
//cssSelector
//xpath

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Yahoo {

	WebDriver dr = null;

	@Test
	public void LinkText() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http:login.yahoo.com/");
		dr.manage().window().maximize();

		// dr.findElement(By.linkText("Terms")).click();
		// dr.findElement(By.cssSelector("#login-username")).sendKeys("dharmikspatel@gmail.yahoo.com");
		dr.findElement(By.xpath("//input[@id='login-username']")).sendKeys("dharmikspatel@gmail.yahoo.com");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//input[@id='login-signin']")).click();
		// dr.findElement(By.cssSelector("#login-signin")).click();
	}
}
