package com.qa.testLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qa.pageLayer.UniCredsHomePage;
import com.qa.testData.CommonProperties;


public class UniCredsHomePageTest implements CommonProperties {

	public static WebDriver driver;
	public UniCredsHomePage uchp;
	

	@Test
	public void homePageTest() throws InterruptedException
	{
		System.setProperty(chromeDriverKey, chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Browser Launched");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    System.out.println("Entering details");	
		
		uchp = new UniCredsHomePage(driver);

		uchp.verifyPopup();
		System.out.println("Popup Closed");
		uchp.setName();
		System.out.println("Name Entered");
		uchp.setEmail();
		System.out.println("Email Entered");
		uchp.setCountryCode();
		System.out.println("Country Selected");
		uchp.setPhone();
		System.out.println("Phone Number Entered");
		uchp.setMessage();
		System.out.println("Message Added");
		uchp.setSubmit();
		System.out.println("Submit done");

		Thread.sleep(3000);
		driver.quit();
		System.out.println("Scenario completed. Browser Closed.");
	}
}
