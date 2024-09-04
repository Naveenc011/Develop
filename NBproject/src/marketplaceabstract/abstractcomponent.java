package marketplaceabstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class abstractcomponent {
	WebDriver driver;
	
	public abstractcomponent(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@title='Cart']//img[@alt='The cart']")
	WebElement cartheader;
	@FindBy(xpath = "//div[@class='wrapper']//a[@class='pointer'][normalize-space()='Home']")
	WebElement Homeheader;
	
	public void goToCart()
	{
		cartheader.click();
	}
	
	public void goToHome()
	{
		Homeheader.click();
	}
	
	
}


//driver.findElement(By.xpath("//span[@title='Cart']//img[@alt='The cart']")).click();
//driver.findElement(By.xpath("//div[@class='wrapper']//a[@class='pointer'][normalize-space()='Home']")).click();	