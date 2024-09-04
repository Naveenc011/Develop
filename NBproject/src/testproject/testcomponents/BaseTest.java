package testproject.testcomponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import Marketplace.test.markerplacelogin;

public class BaseTest {
	
	public WebDriver driver;

	public WebDriver intializedriver () throws IOException
	{
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "src\\testproject\\resources\\GlobalData");
		prop.load(file);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\navee.exe");
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			//firefox driver
		}
		else if (browserName.equalsIgnoreCase("Edge"))
		{
			//Edge driver
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	
	@BeforeMethod(alwaysRun = true)
	public markerplacelogin lauchNBMarketplace() throws IOException
	{
		driver = intializedriver();
		markerplacelogin Markerplacelogin =  new markerplacelogin(driver);
		Markerplacelogin.goTo();
		return Markerplacelogin;
	}
}
//C:\\Users\\navee\\eclipse-workspace\\testproject\\
