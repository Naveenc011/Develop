package testproject.testcomponents;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Marketplace.test.NBloginvalidation;
import testproject.resources.ExtentsReport;

public class Listeners extends NBloginvalidation implements ITestListener
{
	 ExtentTest test;
	 ExtentReports extent = ExtentsReport.config();
	 ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();//Thread safe
	 
	 
	 	@Override
	    public void onTestStart(ITestResult result) {
	    	test = extent.createTest(result.getMethod().getMethodName());
	    	extentTest.set(test); //unique thread id (error validation test) -> test
		}
	 		
	 	@Override
		public void onTestSuccess(ITestResult result) {
	 		extentTest.get().log(Status.PASS, "Test Passed");
		}
	 		
	 	@Override
		public void onTestFailure(ITestResult result) {
	 		extentTest.get().fail(result.getThrowable());
	 		
	 		try {
				driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
	 		String filepath = null;
			try {
				filepath = getScreenshot(result.getMethod().getMethodName(), driver);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			extentTest.get().addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
	 		//screenshot, attach to the report
	 		
		}
	 	
	 	@Override
		public void onTestSkipped(ITestResult result) {
			
		}
	 	
	 	@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
		}
	 	
	 	@Override
		public void onFinish(ITestContext context) {
	 	    // not implemented
	 		extent.flush();
	 	  }
}
