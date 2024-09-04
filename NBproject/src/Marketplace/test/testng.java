package Marketplace.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testng {

	private WebDriver driver;

	@BeforeMethod
	public void Startup() {
		// Initiate driver
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void Exit() {
		driver.close();
	}
	/*
	 * @Parameters({"URL"})
	 * 
	 * @Test public void url(String urlname) { System.out.println(urlname); }
	 */

	@Test(priority = 1)
	public void Demo() {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.Chrome.driver",
		// "C:\\Users\\prade\\IdeaProjects\\NB_MemberPortal\\driver\\chromedriver.exe");
		// ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uat.nbm.store/en-US/");
		driver.findElement(By.xpath("/html/body/center/header/div/div/div/div[2]/div/div[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"sign-register-button\"]/a/button")).click();
		driver.findElement(By.id("Username")).sendKeys("test2612@gmail.com");
		driver.findElement(By.xpath("//div/input[@id='Password']")).sendKeys("Test@123");
		driver.findElement(By.cssSelector("button[value='login']")).click();
	}

	@Test(enabled = false)
	public void login() {
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\prade\\IdeaProjects\\NB_MemberPortal\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.findElement(By.id("Username")).sendKeys("test2612@gmail.com");
		driver.findElement(By.xpath("//div/input[@id='Password']")).sendKeys("Test@123");
		driver.findElement(By.cssSelector("button[value='login']")).click();
	}

	@Test(priority = 2)
	public void loggingin() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='wrapper']//a[@class='pointer'][normalize-space()='Home']")).click();
		Thread.sleep(5000);
		WebElement testDropDown = (driver.findElement(By.xpath("//select[@id='desktop-state-selection']")));
		Select state = new Select(testDropDown);
		state.selectByIndex(0);
		// state.selectByIndex(0);
		// Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath(
				"//div[@class='on-sale ng-scope']//button[@title='View details button'][normalize-space()='View Details']"))
				.click();
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
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(@ng-disabled,'!dialogData.updated')]")).click();
	}

	@Test(priority = 3)
	public void shipping() throws InterruptedException {
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,650)");
		Thread.sleep(3000);
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,650)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Proceed to checkout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='PrimaryMemberFirstName']")).sendKeys("Testfirst");
		driver.findElement(By.xpath("//input[@id='PrimaryMemberLastName']")).sendKeys("Testlast");
		Select gender = new Select(driver.findElement(By.xpath("//select[@id='PrimaryMemberGender']")));
		gender.selectByVisibleText("Male");
		driver.findElement(By.xpath("//input[@id='PrimaryMemberDOB']")).sendKeys("10102000");
		driver.findElement(By.xpath("//input[@id='PrimaryMemberaffiliateID']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");
		Thread.sleep(2000);
		// Shipping Information
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("john");
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("seena");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("new road");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("new jersy");
		Select state = new Select(driver.findElement(By.xpath("//select[@id='shipping_address_state']")));
		state.selectByVisibleText("lowa");
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("65454");
		Thread.sleep(2000);
		// billing
		driver.findElement(By.xpath("//input[@id='BillingAddressEqualsShipping']")).click();
		// payment info
		Select payment = new Select(driver.findElement(By.xpath("//select[@id='payment_method']")));
		payment.selectByVisibleText("Credit Card");
		Select card = new Select(driver.findElement(By.xpath("//select[@id='select_card']")));
		card.selectByVisibleText("American Express");
		driver.findElement(By.xpath("//input[@id='card_number']")).sendKeys("370-0000-0000-0002");
		Select month = new Select(driver.findElement(By.xpath("//select[@id='expiry_month']")));
		month.selectByVisibleText("May");
		Select year = new Select(driver.findElement(By.xpath("//select[@id='expiry_year']")));
		year.selectByVisibleText("2030");
		driver.findElement(By.xpath("//input[@id='security_code']")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pay_agree']")).click();
		Thread.sleep(2000);
		Select option = new Select(driver.findElement(By.xpath("//select[@id='shipping_method']")));
		option.selectByVisibleText("shipping_method");
		driver.findElement(By.xpath("//button[2]")).click();
	}

	@Test(priority = 4)
	public void orderconfirmation() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='order-confirmation-main-box']")).getText();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt='orderconfirmation logo']")).click();
	}

	@Test(priority = 5)
	public void sorting() throws InterruptedException {
		driver.get("href=\"/en-US/contactlens");
		Thread.sleep(3000);
		Select sortby = new Select(driver.findElement(By.xpath("//select[@id='sortBy']")));
		sortby.selectByVisibleText("Price, high to low");
		Thread.sleep(3000);
		Select sortbyy = new Select(driver.findElement(By.xpath("//select[@id='sortBy']")));
		sortbyy.selectByVisibleText("Price, low to high");
	}
	@Test(priority = 6)
	public void end() throws InterruptedException {
		System.out.println("the testing is done");
	}
}
