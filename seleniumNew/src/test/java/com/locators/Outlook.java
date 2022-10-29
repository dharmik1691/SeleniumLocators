package com.locators;

//partialLink

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Outlook {

	WebDriver drvr = null;

	@Test
	public void partialLink() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver drvr = new ChromeDriver();

		drvr.get("https://login.live.com/");
		drvr.manage().window().maximize();
		Thread.sleep(3000);
		drvr.findElement(By.partialLinkText("Terms")).click();
	}
}
