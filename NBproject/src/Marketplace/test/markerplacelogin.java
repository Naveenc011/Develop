package Marketplace.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import marketplaceabstract.abstractcomponent;

public class markerplacelogin extends abstractcomponent{

	WebDriver driver;

	public markerplacelogin(WebDriver driver)
	{
		//initialization
		super(driver);
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
	
	public void goTo()
	{
		driver.get("https://uat.nbm.store/en-US/");
	}
	
}
	