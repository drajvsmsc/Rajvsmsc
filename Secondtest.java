package com.qa.seleniumauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Secondtest {
	
	WebDriver driver;
	@BeforeTest
	public void launchBro()  {
		System.setProperty("webdriver.gecko.driver", "D:\\Soft tools auto\\geckodriver.exe");
		driver = new FirefoxDriver();		
	}
	@Test
	public void Signin() throws InterruptedException {
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
    driver.findElement(By.id("ap_email")).sendKeys("autotest@gmail.com");
    driver.findElement(By.cssSelector(".a-button-inner > #continue")).click();
    driver.findElement(By.id("ap_password")).sendKeys("auto123");
    driver.findElement(By.id("signInSubmit")).click();
    driver.close(); 
}
}