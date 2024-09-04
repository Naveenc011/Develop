package Marketplace.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class marketplacefootersection {
	WebDriver driver;
	
	public marketplacefootersection(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[normalize-space()='Contact']")
	WebElement contactus;
	
	
	public void goTocontactus()
	{
		contactus.click();
	}
}


//driver.findElement(By.xpath("//a[normalize-space()='Contact']")).click();