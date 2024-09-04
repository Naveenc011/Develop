package Marketplace.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class marketplaceshippingpage {
WebDriver driver;
	
	public marketplaceshippingpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='pay_agree']")
	WebElement agreementcheckbox;
	@FindBy(xpath = "//button[2]")
	WebElement placeorderbutton;
	
	public void termsandAgreement()
	{
		agreementcheckbox.click();
	}
	
	public void placeorder()
	{
		placeorderbutton.click();
	}
}


//driver.findElement(By.xpath("//input[@id='pay_agree']")).click();
//driver.findElement(By.xpath("//button[2]")).click();