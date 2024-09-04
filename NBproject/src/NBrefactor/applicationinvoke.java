package NBrefactor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import Marketplace.test.markerplacelogin;

public class applicationinvoke {
	public WebDriver driver;
	//public markerplacelogin lauchNBMarketplace;

	public WebDriver intializedriver () throws IOException
	{
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "src\\testproject\\resources\\GlobalData");
		prop.load(file);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\prade\\IdeaProjects\\NB_MemberPortal\\driver\\chromedriver.exe");
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
		return driver;
	}
		
		public List<HashMap<Object, Object>> getjsondataToMap(String string) throws IOException
		{
			//read json to string
		String jsoncontent = 	FileUtils.readFileToString(new File("C:\\Users\\navee\\eclipse-workspace\\NBproject\\src\\testproject\\resources\\purchaseOrderdata.jason"),StandardCharsets.UTF_8);
		
		//String to Hashmap Jackson Databind
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<Object, Object>> data = mapper.readValue(jsoncontent, new TypeReference<List<HashMap<Object, Object>>>(){	
		});
		return data;
		
		
		
	}
	
/*	@BeforeMethod(alwaysRun = true)
	public markerplacelogin lauchNBMarketplace() throws IOException
	{
		driver = intializedriver();
		markerplacelogin Markerplacelogin =  new markerplacelogin(driver);
		Markerplacelogin.goTo();
		return Markerplacelogin;
	}*/
	
	
	/*@AfterMethod(alwaysRun = true)
	public void tearDown()
	{
		driver.close();
	}*/
}
//C:\\Users\\navee\\eclipse-workspace\\testproject\\


