package Marketplace.test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sun.net.httpserver.Authenticator.Retry;

import NBrefactor.applicationinvoke;
import java.util.List;
public class NBloginvalidation extends applicationinvoke {

	@Test(dataProvider = "getData")
	public void login(HashMap <String, String> input) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//String productName = "Package D";
		markerplacelogin Markerplacelogin =  new markerplacelogin(driver);
		Markerplacelogin.goTo();
		driver.manage().window().maximize();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/center/header/div/div/div/div[2]/div/div[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"sign-register-button\"]/a/button")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Markerplacelogin.loggingmarketplace(input.get("email"), input.get("password"));

	}

	public String getScreenshot(String testcasename, WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") +  "//reports//" + testcasename +  ".png");
		FileUtils.copyFile(src, file);
		return System.getProperty("user.dir") +  "//reports//" + testcasename +  ".png";
		
	}
	

	
	@DataProvider
	public Object[][] getData() throws IOException
	{
	//	HashMap<String, String> map = new HashMap<String, String>();
	//	map.put("email", "matt@gmail.com");
	//	map.put("password", "Test@1234");
		
	//	HashMap<String, String> map1 = new HashMap<String, String>();
	//	map1.put("email", "kumarc@gmail.com");
	//	map1.put("password", "Naveen11$");
	//	return new Object [][] {{map},{map1}};
		//Data provider other method
		//return new Object [][] {{"matt@gmail.com","Test@1234"},{"kumarc@gmail.com","Naveen11$"}};
		
		List<HashMap<Object, Object>> data  = getjsondataToMap("C:\\Users\\navee\\eclipse-workspace\\NBproject\\src\\testproject\\resources\\purchaseOrderdata.jason");
		return new Object [][] {{data.get(0)}, {data.get(1)}};
	
}
	
}


