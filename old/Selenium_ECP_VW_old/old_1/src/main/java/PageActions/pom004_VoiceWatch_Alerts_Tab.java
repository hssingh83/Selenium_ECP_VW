package PageActions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class pom004_VoiceWatch_Alerts_Tab {
	private static Logger log =LogManager.getLogger(pom004_VoiceWatch_Alerts_Tab.class.getName());

	public WebDriver driver;
	
	By alertsTab=By.linkText("Alerts");
	
	By dropdownTimeSelected=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[1]/select");
	By checkBoxShowError=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[1]/span[1]/input");	
	By filterBox=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[1]/span[2]/input");	
	By testTimeColumn=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/table/thead/tr/th[1]/span[1]");	
//	By hammerColumn=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/table/thead/tr/th[2]/div/span[1]");
	By hammerColumn=By.xpath("//div[@class='sortable']//span[contains(text(),'Hammer')]");
	
	
	By testColumn=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/table/thead/tr/th[3]/span[1]");	
	By errorStepColumn=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/table/thead/tr/th[4]");	
	By errorMessageColumn=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/table/thead/tr/th[5]");	
	By ThresholdColumn=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/table/thead/tr/th[6]");	
	By SeverityColumn=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/table/thead/tr/th[7]");	
	By alertStatusColumn=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/table/thead/tr/th[8]");	
	By totallabel=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[3]/span[1]/span");	
	By criticallabel=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[3]/span[2]/span");	
	By warninglabel=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[3]/span[3]/span");	
	
	   
    
	//ContractorA
	
	public pom004_VoiceWatch_Alerts_Tab(WebDriver driver) {
		this.driver=driver;
	}
	
	
	// Method for Verified Lables under Client Tab
	
	public void alertsValidations() throws InterruptedException {	
		
		driver.findElement(alertsTab).click();
		
		Assert.assertTrue(driver.findElement(checkBoxShowError).isDisplayed());
		log.info("Verified that 'Show All Errors' checkbox appeared under Alert tab");
		Assert.assertTrue(driver.findElement(checkBoxShowError).isEnabled());		
		log.info("Verified that 'Show All Errors' checkbox enabled under Alert tab");		
		Assert.assertFalse(driver.findElement(checkBoxShowError).isSelected());		
		log.info("Verified that 'Show All Errors' checkbox selectable under Alert tab");
		
		Assert.assertTrue(driver.findElement(filterBox).isDisplayed());
		log.info("Verified that 'Filter by test name or tag filter'appeared under Alert tab");
		Assert.assertTrue(driver.findElement(filterBox).isEnabled());		
		log.info("Verified that 'Filter by test name or tag filter'enabled under Alert tab");
		Assert.assertFalse(driver.findElement(filterBox).isSelected());		
		log.info("Verified that 'Filter by test name' is blank while select Alert tab");
		
		
		Assert.assertTrue(driver.findElement(testTimeColumn).isDisplayed());
		log.info("Verified that 'Test Time' dislayed under Alerts Tab");
		Assert.assertEquals(driver.findElement(testTimeColumn).getText(), "Test Time");		
		log.info("Verified that 'Test Time' coloumn under Alerts Tab");
		
	/*		
		if (driver.findElements(hammerColumn).isEmpty()) {
			
			log.debug("Verified that 'Hammer' coloum is not displaying under Alerts Tab");
			
						
		}else
		
		{
			log.debug("Verified that 'Hammer' coloum dislayed under Alerts Tab");
			
		}		*/
		
		
/*		Assert.assertTrue(driver.findElement(hammerColumn).isDisplayed());
		log.debug("Verified that 'Hammer' dislayed under Alerts Tab");
		Assert.assertEquals(driver.findElement(hammerColumn).getText(), "Hammer");		
		log.debug("Verified that 'Hammer' coloumn under Alerts Tab");*/
		
		Assert.assertTrue(driver.findElement(testColumn).isDisplayed());
		log.info("Verified that 'Test' dislayed under Alerts Tab");
		Assert.assertEquals(driver.findElement(testColumn).getText(), "Test");		
		log.info("Verified that 'Test' coloumn under Alerts Tab");
		
		Assert.assertTrue(driver.findElement(errorStepColumn).isDisplayed());
		log.info("Verified that 'Error Step' dislayed under Alerts Tab");
		Assert.assertEquals(driver.findElement(errorStepColumn).getText(), "Error Step");		
		log.info("Verified that 'Error Step' coloumn under Alerts Tab");
		
		Assert.assertTrue(driver.findElement(errorMessageColumn).isDisplayed());
		log.info("Verified that 'Error Message' dislayed under Alerts Tab");
		Assert.assertEquals(driver.findElement(errorMessageColumn).getText(), "Error Message");		
		log.info("Verified that 'Error Message' coloumn under Alerts Tab");
		
		Assert.assertTrue(driver.findElement(ThresholdColumn).isDisplayed());
		log.info("Verified that 'Threshold' dislayed under Alerts Tab");
		Assert.assertEquals(driver.findElement(ThresholdColumn).getText(), "Threshold");		
		log.info("Verified that 'Threshold' coloumn under Alerts Tab");
		
		Assert.assertTrue(driver.findElement(SeverityColumn).isDisplayed());
		log.info("Verified that 'Severity' dislayed under Alerts Tab");
		Assert.assertEquals(driver.findElement(SeverityColumn).getText(), "Severity");		
		log.info("Verified that 'Severity' coloumn under Alerts Tab");
		

		Assert.assertTrue(driver.findElement(alertStatusColumn).isDisplayed());
		log.info("Verified that 'Alert Status' dislayed under Alerts Tab");
		Assert.assertEquals(driver.findElement(alertStatusColumn).getText(), "Alert Status");		
		log.info("Verified that 'Alert Status' coloumn under Alerts Tab");
		
		Assert.assertTrue(driver.findElement(totallabel).isDisplayed());
		log.info("Verified that count of total alert dislayed under Alerts Tab");
		Assert.assertEquals(driver.findElement(totallabel).getText(), "Total");		
		log.info("Verified that 'Toal' text contain under Alerts Tab");
		
		Assert.assertTrue(driver.findElement(criticallabel).isDisplayed());
		log.info("Verified that count of critical alert dislayed under Alerts Tab");
		Assert.assertEquals(driver.findElement(criticallabel).getText(), "Critical");		
		log.info("Verified that 'critical' text contain under Alerts Tab");
		
		Assert.assertTrue(driver.findElement(warninglabel).isDisplayed());
		log.info("Verified that count of Warning alerts dislayed under Alerts Tab");
		Assert.assertEquals(driver.findElement(warninglabel).getText(), "Warning");		
		log.info("Verified that 'Warning' text contain under Alerts Tab");
		
		 String[] exp = {"Last 4 hours","Last 6 hours","Last 12 hours","Last 24 hours","Day"};
		// System.out.println(exp.length);
		 log.info("Verified that count of the dropdown values are: "  +exp.length); 
		 
		 WebElement dropdown = driver.findElement(dropdownTimeSelected); 
		
	//	 System.out.println(dropdown.getSize());
		 
        Select s = new Select(dropdown); 
        s.isMultiple();
       java.util.List<WebElement> options = s.getOptions(); 
       
      
       log.info("Verified that following values available in the dropdown"); 
      
        for(WebElement item:options) 
        	
        	
        	
        { 
        	for (int i = 0; i <options.size(); i++) {
        		        		
        		if (item.getText().equals(exp[i])) {
        			
        						    
        			log.debug(""+item.getText());
        			
        			//		 System.out.println("hello i am hari" +item.getText());  
        			 
        			 Assert.assertEquals(item.getText(),exp[i]);
        		}
        	}
        }
   
		
	}


//====================================================
	
	public void hammerColumn() throws Exception  
	
	
	{         
	  try   
	  {    
	    if(driver.findElement(hammerColumn).isDisplayed() )     
	    {      
	      System.out.print("hammer coming");   
	    }    
	  }      
	  catch(Exception e)     
	  {       
		  System.out.print("hammer not coming");   
	  }       
	}         	
	
	
//=====================================================	
/*public void hammerColumn() {
	
	Assert.assertTrue(driver.findElement(warninglabel).isDisplayed());
	
	if (driver.findElement(hammerColumn).isDisplayed());
	
	
//	if (driver.findElements(hammerColumn).isEmpty()) {
		
		log.debug("Verified that 'Hammer' coloum is not displaying under Alerts Tab");
		
					
	}else
	
	{
		log.debug("Verified that 'Hammer' coloum dislayed under Alerts Tab");
		
	}
*/
}

	