package Marketplace.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import marketplaceabstract.abstractcomponent;

public class marketplacecartpage extends abstractcomponent{
	WebDriver driver;
	
	public marketplacecartpage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[normalize-space()='Proceed to checkout']")
	WebElement proceedtocheckout;
	
	
	public void goTocheckout()
	{
		proceedtocheckout.click();
	}
}


//driver.findElement(By.xpath("//button[normalize-space()='Proceed to checkout']")).click();