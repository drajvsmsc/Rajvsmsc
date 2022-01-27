package com.qa.seleniumauto;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ThirdTest {
	WebDriver driver;
	public void launchBro()  {
		System.setProperty("webdriver.gecko.driver", "D:\\Soft tools auto\\geckodriver.exe");
		driver = new FirefoxDriver();		
	}
	public void Scroll() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://www.amazon.in/");
		WebElement element =  driver.findElement(By.linkText("Instagram"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		
	}

}
