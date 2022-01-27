package com.qa.seleniumauto;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;


public class Firsttest {
	@Test
	 public static void main(String[] args) throws InterruptedException  {
	
	ThirdTest test = new ThirdTest();
	test.launchBro();
	test.Scroll();
	
	


}
} 