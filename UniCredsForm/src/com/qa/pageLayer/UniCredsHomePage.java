package com.qa.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UniCredsHomePage 
{
	
	//Declaration & Basic Initialization
	WebDriver driver;
	
	@FindBy(xpath = "//span[contains(text(),'×')]")
	private WebElement closePopup;
	
	@FindBy(xpath = "//input[@id='fullname']")
	private WebElement name;
	
	@FindBy(xpath = "//input[@placeholder = 'Email']")
	private WebElement email;
	
	@FindBy(xpath = "//select[@class = 'p-2 pl-4 pr-4 m-2 mt-2 mb-2 form-control form-control-md']")
	private WebElement countryCode;
	
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phone;
	
	@FindBy(xpath = "//textarea[@id='message']")
	private WebElement message;
	
	@FindBy(xpath = "//button[@id='contactButton']")
	private WebElement submit;
	
	//Initialization
	public UniCredsHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Usage
	public void verifyPopup()
	{
		closePopup.click();
	}
	
	public void setName()
	{
		name.sendKeys("abc def ghi");
	}
	
	public void setEmail()
	{
		email.sendKeys("abc@gmail.com");
	}
	
	public void setCountryCode()
	{
		Select s = new Select(countryCode);
		s.selectByVisibleText("Australia (+61)");
	}
	
	public void setPhone()
	{
		phone.sendKeys("1234567890");
	}
	
	public void setMessage()
	{
		message.sendKeys("Hi! How are You?");
	}
	
	public void setSubmit()
	{
		submit.click();
	}
	
	

}
