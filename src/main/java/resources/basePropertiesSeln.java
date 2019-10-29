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
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class basePropertiesSeln {
	
	public WebDriver driver;
	public Properties prop;
	
	private static Logger log =LogManager.getLogger(basePropertiesSeln.class.getName());
	
	public WebDriver intializeDriver() throws IOException, InterruptedException
	{
		//Chrome
		
		prop=new Properties();

		//FileInputStream fis=new FileInputStream("C:\\Users\\hsingh\\.jenkins\\${JENKIN_HOME}\\ECP_VW\\src\\main\\java\\resources\\data.properties");

		//System.getProperty("user.dir")

		//FileInputStream fis=new FileInputStream("C:\\Users\\hsingh\\Frameworks\\Cucumber_ECP_VW\\src\\main\\java\\resources\\data.properties");

		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");


		prop.load(fis);

	String browserName=System.getProperty("browser");
//		String browserName=prop.getProperty("browser");

			
		if(browserName.contains("chrome"))	
			
		{
//			System.setProperty("webdriver.chrome.driver","C:\\Users\\hsingh\\Frameworks\\Cucumber_ECP_VW\\src\\main\\java\\resources\\drivers\\chromedriver.exe");
			
//			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\drivers\\chromedriver.exe");

			WebDriverManager.chromedriver().setup(); 	
			
//			System.setProperty("webdriver.chrome.logfile","./Chromelog.txt");
		 	System.setProperty("webdriver.chrome.silentOutput","true");
		 	ChromeOptions options=new ChromeOptions();
	//	 	driver.manage().deleteAllCookies();
			options.addArguments("disable-infobars");
		 //   driver=new ChromeDriver();
		  
			if(browserName.contains("headless"))	
			{

		    options.addArguments("--headless");
		        
			}
		    
			driver=new ChromeDriver(options);
			log.debug("Chrome Driver intilized successfully");
		    log.debug("Chrome Browser selected & Launching in few second");
		}		
				
		//firefox

		else if (browserName.equals("firefox"))
			
		{
//			System.setProperty("webdriver.gecko.driver","C:\\Users\\hsingh\\Frameworks\\Cucumber_ECP_VW\\src\\main\\java\\resources\\drivers\\geckodriver.exe");
			
//			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\drivers\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
//			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"./FFLogs.txt");
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"null");
			
			FirefoxOptions options=new FirefoxOptions();
		//	driver.manage().deleteAllCookies();
			options.addArguments("disable-infobars");
			
			if(browserName.contains("headless"))	
			{

		    options.addArguments("--headless");
//			driver = new FirefoxDriver();
			}
			
			driver=new FirefoxDriver(options);
			
			log.info("Firefox Driver intilized successfully");
		    log.info("Firefox Browser selected & Launch");
		}

		//IE
		else if (browserName.equals("ie"))
		{
//			System.setProperty("webdriver.ie.driver","C:\\Users\\hsingh\\Frameworks\\Selenium_ECP_VW\\src\\main\\java\\resources\\drivers\\IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\drivers\\IEDriverServer.exe");
			
			driver = new InternetExplorerDriver();
			
			log.info("IE Driver intilized successfully");
		    log.info("IE Browser selected & Launch");
		}

		//Timeout

		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		log.debug("implicit Wait Applied");
	//	log.debug("Clean Cookies");
//		driver.get(prop.getProperty("url3"));

		//Comment for eclipse runner
		String URL=System.getProperty("url");

		if (URL.contains("VoiceWatch-26.0")) {	
			driver.get(prop.getProperty("url1"));
			log.debug("Current version is 26.0");

		}	
			if (URL.contains("VoiceWatch-26.1")) {
				
				driver.get(prop.getProperty("url2"));
				log.debug("Current version is 26.1");
				
			
		} if (URL.contains("VoiceWatch-26.2")) {
			
			driver.get(prop.getProperty("url3"));
			log.debug("Current version is 26.2");
			
		} else {
			log.debug("Verson Not Matched");

			}	



		log.debug("URL provided");
		driver.manage().window().maximize();
		log.info("Screen maximized successfully");
		log.info("Waiting to access above URL");
		/*Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/nav/div[1]/a/img")).isDisplayed());
		Thread.sleep(1000);
		log.debug(" Verified that VoiceWatch login screen appeared successfully");*/


		return driver;
			}
			
			
				
			public void getScreenshot(String result) throws IOException
//			public void getScreenshot() throws IOException
			
			{
				
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C:\\Users\\hsingh\\git_project\\ECP_VW\\src\\main\\java\\resources\\screenshot"+result+"screenshot.png"));
//			FileUtils.copyFile(src, new File("C:\\Users\\hsingh\\git_project\\ECP_VW\\src\\main\\java\\resources\\screenshot\\screenshot.png"));
			
			}


			
			
		}
			


	
