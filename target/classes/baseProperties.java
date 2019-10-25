package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import io.github.bonigarcia.wdm.WebDriverManager;


public class baseProperties {
	
	public WebDriver driver;
	public Properties prop;
	
	private static Logger log =LogManager.getLogger(baseProperties.class.getName());
	
	public WebDriver intializeDriver() throws IOException, InterruptedException
	{
		//Chrome
		
prop=new Properties();

//  FileInputStream fis=new FileInputStream("C:\\perforce_workspace\\Preempt\\DevOps\\VoiceWatch\\AutomationTest\\VoiceWatchAutomation\\VoiceWatchAutomation\\src\\main\\java\\resources\\data.properties");

//FileInputStream fis=new FileInputStream("C:\\Users\\hsingh\\.jenkins\\${JENKIN_HOME}\\ECP_VW\\src\\main\\java\\resources\\data.properties");

FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");



prop.load(fis);

String browserName=System.getProperty("browser");


//String browserName=prop.getProperty("browser");
if(browserName.contains("chrome"))
		
{
 	WebDriverManager.chromedriver().setup(); 	
// 	System.setProperty("webdriver.chrome.logfile",System.getProperty("user.dir")+"\\src\\main\\java\\Browser_Log");
 	
 //	System.setProperty("webdriver.chrome.logfile","./Chromelog.txt");
 	System.setProperty("webdriver.chrome.silentOutput","true");

//	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\drivers\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("disable-infobars");
 //   driver=new ChromeDriver();
  
	if(browserName.contains("headless"))	
	{

    options.addArguments("--headless");
        
//	 driver=new ChromeDriver();
	}
    
	driver=new ChromeDriver(options);
	log.debug("Chrome Driver intilized successfully");
    log.debug("Chrome Browser selected & Launching in few second");
}		
	
	
		
//firefox

//else if (browserName.equals("firefox"))
	
else if (browserName.contains("firefox"))

{
//	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\drivers\\geckodriver.exe");
	WebDriverManager.firefoxdriver().setup();
//	System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"./FFLogs.txt");
	System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"null");
	
	FirefoxOptions options=new FirefoxOptions();
	options.addArguments("disable-infobars");
	
	if(browserName.contains("headless"))	
	{

    options.addArguments("--headless");
//	driver = new FirefoxDriver();
	}
	
	driver=new FirefoxDriver(options);
	
	log.info("Firefox Driver intilized successfully");
    log.info("Firefox Browser selected & Launch");
}

//IE
else if (browserName.equals("ie"))
{
//	System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\drivers\\IEDriverServer.exe");
	
	WebDriverManager.iedriver().setup();
	
	
	driver = new InternetExplorerDriver();
	
	log.info("IE Driver intilized successfully");
    log.info("IE Browser selected & Launch");
}

//Timeout

driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);

String URL=System.getProperty("url");

if (URL.contains("VoiceWatch-26.0")) {	
	driver.get(prop.getProperty("url1"));
}	
	if (URL.contains("VoiceWatch-26.1")) {
		
		driver.get(prop.getProperty("url2"));
	
} if (URL.contains("VoiceWatch-26.2")) {
	
	driver.get(prop.getProperty("url3"));	
}

//driver.get(prop.getProperty("url3"));
log.debug("URL provided");
driver.manage().window().maximize();
log.debug("Screen maximized successfully");
log.debug("Waiting to access above URL");
//Thread.sleep(10000);

//WebDriverWait wait = new WebDriverWait(driver,30);
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("callback_2")));

//System.out.println("Hello");

WebDriverWait wait=new WebDriverWait(driver, 100);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"wrapper\"]/div[1]/nav/div[1]/a/img")));


Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/nav/div[1]/a/img")).isDisplayed());



log.debug(" Verified that VoiceWatch login screen appeared successfully");

return driver;
	}
	
	 
	

		
	public void getScreenshot(String result) throws IOException
//	public void getScreenshot() throws IOException
	
	{
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
	FileUtils.copyFile(src, new File("C:\\Users\\hsingh\\git_project\\ECP_VW\\src\\main\\java\\resources\\screenshot"+result+"screenshot.png"));
//	FileUtils.copyFile(src, new File("C:\\Users\\hsingh\\git_project\\ECP_VW\\src\\main\\java\\resources\\screenshot\\screenshot.png"));
	
	}

}
	
	

	
