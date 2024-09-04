package Marketplace.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class marketplaceorderconfirmationpage {
WebDriver driver;
	
	public marketplaceorderconfirmationpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@alt='orderconfirmation logo']")
	WebElement redirectionlogo;
	
	public void redirectlogo()
	{
		redirectionlogo.click();
	}
	
}


//driver.findElement(By.xpath("//img[@alt='orderconfirmation logo']")).click();
