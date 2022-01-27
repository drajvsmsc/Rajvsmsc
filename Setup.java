package com.qa.seleniumauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Setup {
	WebDriver driver;
	public void launchBro()  {
		System.setProperty("webdriver.gecko.driver", "D:\\Soft tools auto\\geckodriver.exe");
		driver = new FirefoxDriver();		
	}
	
	public void opem() {
		driver.get("https://www.amazon.in/");
	    driver.findElement(By.linkText("Electronics")).click();
	    driver.findElement(By.cssSelector("#sobe_d_b_3_3 .a-dynamic-image")).click();
	    driver.findElement(By.cssSelector("#contentGrid_576023 img")).click();
	    driver.findElement(By.cssSelector("#anonCarousel1 #acs-product-block-0 img")).click();
	    driver.findElement(By.id("add-to-cart-button")).click();
	    driver.findElement(By.linkText("Go to Cart")).click();
	    driver.close();
	}
}
