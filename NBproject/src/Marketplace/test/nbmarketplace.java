package Marketplace.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.sun.net.httpserver.Authenticator.Retry;

import NBrefactor.applicationinvoke;
import testproject.testcomponents.BaseTest;

public class nbmarketplace extends applicationinvoke {

@Test
public void orderplacement() throws InterruptedException
{
	
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//String productName = "Package D";
		markerplacelogin Markerplacelogin =  new markerplacelogin(driver);
		Markerplacelogin.goTo();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/center/header/div/div/div/div[2]/div/div[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"sign-register-button\"]/a/button")).click();
		Thread.sleep(5000);
		Markerplacelogin.loggingmarketplace("kumarc@gmail.com", "Naveen11$");
		Markerplacelogin.goToCart();
		/********/
		//add ons show more
		Thread.sleep(5000);
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
	    js6.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//button[normalize-space()='Show More']")).click();
		Thread.sleep(5000);
		//contct us
		JavascriptExecutor js7 = (JavascriptExecutor) driver;
	    js7.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(3000);	
	    driver.findElement(By.id("cookieConsentAccept")).click();
	    Thread.sleep(3000);	
	    marketplacefootersection marketplacefootersection = new marketplacefootersection(driver);
	    marketplacefootersection.goTocontactus();
	    driver.findElement(By.xpath("//input[@id='contactFormFirstName']")).sendKeys("Testname");
	    driver.findElement(By.xpath("//input[@id='contactFormLastName']")).sendKeys("Lastname");
	    driver.findElement(By.xpath("//input[@id='contactFormPhone']")).sendKeys("1234567890");
	    driver.findElement(By.xpath("//input[@id='contactFormSubject']")).sendKeys("Test subject");
	    driver.findElement(By.xpath("//textarea[@id='contactFormMessage']")).sendKeys("This is test feedback");
	    Thread.sleep(3000);	
	    JavascriptExecutor js8 = (JavascriptExecutor) driver;
	    js8.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(10000);
		Markerplacelogin.goToHome();
		Thread.sleep(5000);	
		WebElement testDropDown = (driver.findElement(By.xpath("//select[@id='desktop-state-selection']")));
		Select state = new Select(testDropDown);
		state.selectByIndex(0);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//div[@class='on-sale ng-scope']//button[@title='View details button'][normalize-space()='View Details']")).click();		
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//select[@id='state-select-dialog']")).click();
		Select location = new Select(driver.findElement(By.xpath("//select[@id='state-select-dialog']")));
		location.selectByVisibleText("AL");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("window.scrollBy(0,650)");
	    Thread.sleep(3000);
	    JavascriptExecutor js2 = (JavascriptExecutor) driver;
	    js2.executeScript("window.scrollBy(0,650)");
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("(//button[@ng-class='{disabled: !addToCartBtnDisabled}'])[1]")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//button[contains(@ng-disabled,'!dialogData.updated')]")).click();
		/******/
		//customer info
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,650)");
	    Thread.sleep(3000);
	    JavascriptExecutor js4 = (JavascriptExecutor) driver;
	    js4.executeScript("window.scrollBy(0,650)");
	    Thread.sleep(5000);
	    marketplacecartpage marketplacecartpage = new marketplacecartpage(driver);
	    marketplacecartpage.goTocheckout();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='PrimaryMemberFirstName']")).sendKeys("Testfirst");
		driver.findElement(By.xpath("//input[@id='PrimaryMemberLastName']")).sendKeys("Testlast");
		Select gender = new Select(driver.findElement(By.xpath("//select[@id='PrimaryMemberGender']")));
		gender.selectByVisibleText("Male");	
		//driver.findElement(By.xpath("//input[@id='PrimaryMemberDOB']")).sendKeys("10102000");
		driver.findElement(By.xpath("//input[@id='PrimaryMemberaffiliateID']")).sendKeys("1234567890");
		//driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("1234567890");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");
		Thread.sleep(2000);
		//Shipping Information
		//driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("john");
		//driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("seena");
		//driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("new road");
		//driver.findElement(By.xpath("//input[@id='city']")).sendKeys("new jersy");
		//Select state1 = new Select(driver.findElement(By.xpath("//select[@id='shipping_address_state']")));
		//state1.selectByVisibleText("lowa");
		//driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("65454");
		//Thread.sleep(2000);
		//billing
		//driver.findElement(By.xpath("//input[@id='BillingAddressEqualsShipping']")).click();
		//payment info
		//Select payment = new Select(driver.findElement(By.xpath("//select[@id='payment_method']")));
		//payment.selectByVisibleText("Credit Card");
		//Select card = new Select(driver.findElement(By.xpath("//select[@id='select_card']")));
		//card.selectByVisibleText("American Express");
		//driver.findElement(By.xpath("//input[@id='card_number']")).sendKeys("370-0000-0000-0002");
		//Select month = new Select(driver.findElement(By.xpath("//select[@id='expiry_month']")));
		//month.selectByVisibleText("May");
		//Select year = new Select(driver.findElement(By.xpath("//select[@id='expiry_year']")));
		//year.selectByVisibleText("2030");
		//driver.findElement(By.xpath("//input[@id='security_code']")).sendKeys("1234");
		Thread.sleep(2000);
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollBy(0,650)");
		marketplaceshippingpage marketplaceshippingpage = new marketplaceshippingpage(driver);
		marketplaceshippingpage.termsandAgreement();
		Thread.sleep(2000);
		Select option = new Select(driver.findElement(By.xpath("//select[@id='shipping_method']")));
		option.selectByVisibleText("Standard Shipping");
		Thread.sleep(10000);
		marketplaceshippingpage.placeorder();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//div[@class='order-confirmation-main-box']")).getText()	;
		Thread.sleep(10000);
		marketplaceorderconfirmationpage marketplaceorderconfirmationpage = new marketplaceorderconfirmationpage(driver);
		marketplaceorderconfirmationpage.redirectlogo();
	}
	

	}


