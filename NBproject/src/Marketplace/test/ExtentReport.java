package Marketplace.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	ExtentReports extent;
	
	@Test
	public void config()
	{

	String path = System.getProperty("user.dir") +  "\\reports\\index.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setReportName("Automation result");
	reporter.config().setDocumentTitle("Test Results");
	
	
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Naveen Kumar");
	}
	
	public void UAT()
	{
	extent.createTest("Initial Demo");
	System.setProperty("webdriver.Chrome.driver", "C:\\Users\\prade\\IdeaProjects\\NB_MemberPortal\\driver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://uat.nbm.store/en-US/");
	driver.findElement(By.xpath("/html/body/center/header/div/div/div/div[2]/div/div[1]/img")).click();
	driver.findElement(By.xpath("//*[@id=\"sign-register-button\"]/a/button")).click();
	driver.findElement(By.id("Username")).sendKeys("test2612@gmail.com");
	driver.findElement(By.xpath("//div/input[@id='Password']")).sendKeys("Test@123");
	driver.findElement(By.cssSelector("button[value='login']")).click();
	extent.flush();
	}
	
}
