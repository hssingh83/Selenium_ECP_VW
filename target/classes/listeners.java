package resources;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;




public class listeners implements ITestListener{ 
	
	basePropertiesSeln bs=new basePropertiesSeln();

	WebDriver driver=null;
	String filePath = "D:\\SCREENSHOTS";
	

public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub

	
	System.out.print("\nTest Case "+ result.getName() + " Passed\n\n");
	System.out.print("=========================================\n");
	
	
}

public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.print("\nTest Case "+ result.getName() + " failed\n\n");
	System.out.print("=========================================\n");
	

	try {
	   
	bs.getScreenshot(result.getName());
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
}	


public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
	System.out.print("\n "+ context.getName() + " Started\n");
	System.out.print("=========================================\n");
}

public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	System.out.print("\n "+ context.getName() + " Completed\n");
	System.out.print("=========================================\n");
	
	
}
}
