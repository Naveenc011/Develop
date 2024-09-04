package Marketplace.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class markerorderflow {

	WebDriver driver;
	public markerorderflow(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Username")
	WebElement Username;
	
	@FindBy(xpath="//div/input[@id='Password']")
	WebElement password;
	
	@FindBy(css="button[value='login']")
	WebElement login;
	
	public void loggingmarketplace (String email, String pass)
	{
		Username.sendKeys(email);
		password.sendKeys(pass);
		login.click();
	}
}
