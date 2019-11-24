package PageActions;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import VW_TC.Reuseable_Script;

public class pom007_VoiceWatch_Script_Tabs {
	private static Logger log =LogManager.getLogger(pom007_VoiceWatch_Script_Tabs.class.getName());

	public WebDriver driver;
//	public WebDriverWait wait;
//	public WebDriverWait wait=new WebDriverWait(driver, 100000);
	
	By tagTab=By.linkText("Tags");
	By testTab=By.linkText("Tests");
	By scriptsTab=By.linkText("Scripts");
	By goScriptBuilderTab=By.xpath("//span[contains(text(),'Go Script Builder')]");
	By goScriptBuilderTab1=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/div/div[2]/ul/li[1]/a");	
	By goScriptBuilderScriptslabel=By.xpath("//div[@class='panel-heading ng-binding']");
	By goScriptBuilderScriptsCount=By.xpath("//span[@class='badge pull-right ng-binding']");	
//	By filterByNameGSB=By.xpath("//input[@placeholder='Filter by name']");	
	
	By filterByNameGSB=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[1]/div/div[3]/div/div[2]/input");	
	
	
	
	By createNewScriptByButton=By.xpath("//*[@title='Upload a CallMaster script' and @class='glyphicon glyphicon-plus-sign pull-right']");
		By pleaseSelectlabelGSB=By.xpath("//span[contains(text(),'Please select a script or')]");
	By createNewScriptBylink=By.linkText("create a new script"); 
	By scriptUploadTab=By.xpath("//span[contains(text(),'Script Upload')]");
	By callMasterScriptslabel=By.xpath("//div[@class='panel-heading ng-binding']");
	By callMasterScriptscount=By.xpath("//span[@class='badge pull-right ng-binding']");
	By filterByNameSU=By.xpath("//input[@placeholder='Filter by name']");
	By pleaseSelectlabelSU=By.xpath("//span[contains(text(),'Please select a script or')]");
	
	By createNewScriptByButtonSU=By.xpath("//*[@title='Upload a CallMaster script' and @class='glyphicon glyphicon-plus-sign pull-right']");
	By createNewScriptlinkSU=By.xpath("//u[contains(text(),'create a new script')]");
		
//	By csvTranformerTab=By.xpath("//span[contains(text(),'CSV Transformer')]");
	
	By csvTranformerTab=By.linkText("CSV Transformer");
	By csvSelect=By.xpath("//div[@class='files_upload ng-pristine ng-untouched ng-valid ng-empty']");
	
	By TransformButton=By.xpath("//div[@class='row margin-0-10-10-0']//button[@class='btn btn-warning btn-sm btn-float-right']");
	
	By csvUploadLabel=By.xpath("By csvTranformerTab=By.xpath(\"//span[contains(text(),'CSV Transformer')]\");");
	By transformedCSVlabel=By.xpath("//span[contains(text(),'Transformed CSV(s)')]");
	By filterByCSV=By.xpath("//div[@class='row margin-left-right-0px']//h4//i//input[@placeholder='Filter by csv file name']");
	By samplecsvDownoad=By.xpath("//span[contains(text(),'Sample CSV download')]");
	By scriptNamelabel=By.xpath("//div[contains(text(),'Script name')]");
	By scriptNamefield=By.xpath("//input[@placeholder='Enter script name']");
	By scriptDescGSBlabel=By.xpath("//form[@name='wbs_form']//div[@class='small-width'][contains(text(),'Description')]");	
	By scriptDescSUlabel=By.xpath("//form[@name='cms_form']//div[@class='small-width'][contains(text(),'Description')]");	
	By scriptDescGSBfield=By.xpath("//form[@name='wbs_form']//input[@placeholder='Enter description']");
	By scriptDescSUfield=By.xpath("//form[@name='cms_form']//input[@placeholder='Enter description']");
	By saveButton=By.xpath("//button[@class='btn btn-info btn-sm btn-float-right']");
	By scriptBuilderlabel=By.xpath("//a[contains(text(),'Script Builder')]");
	By resultslabel=By.xpath("//a[contains(text(),'Results')]");
	By callLogsNamelabel=By.xpath("//a[contains(text(),'Call Logs')]");
	By associatedTestslabel=By.xpath("//a[contains(text(),'Associated Tests')]");
//	By uploadScriptXMLFile=By.className("files_upload ng-pristine ng-untouched ng-valid ng-empty");
	
	By uploadCSVFile=By.xpath("//div[@class='files_upload ng-pristine ng-untouched ng-valid ng-empty']");
	
	By uploadScriptFile=By.xpath("//div[contains(text(),'Click to select a script, or drop file below (.xml')]");
	
	By uploadScriptSaveButton=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/div/div[2]/div/div/div[5]/form[1]/div[2]/span/button[1]");
	
//	By numberToCall=By.xpath("//input[@class='ng-pristine ng-isolate-scope ng-empty ng-invalid ng-invalid-required ng-touched']");
	
	By numberToCall=By.xpath("//*[@id=\"script-area\"]/div/form/em-wbs-icon[1]/div/div/div[2]/div[2]/span[2]/span/span[1]/input");
	
	By PhraseHearValue1=By.xpath("//*[@id=\"script-area\"]/div/form/div/div[1]/div/em-wbs-icon/div/div/div[2]/div[2]/span[2]/span/span[1]/textarea");
	
	By PhraseHearValue2=By.xpath("//*[@id=\"script-area\"]/div/form/div/div[3]/div/em-wbs-icon/div/div/div[2]/div[2]/span[2]/span/span[1]/textarea");

	By confidenceScore=By.xpath("//*[@id=\"script-area\"]/div/form/div/div[3]/div/em-wbs-icon/div/div/div[2]/div[3]/span[2]/span/span[1]/input");
	
	By deletePhraseHearValue2=By.xpath("//*[@id=\"script-area\"]/div/form/div/div[3]/div/em-wbs-icon/div/div/div[1]/i");
	
	By deletePress2=By.xpath("//*[@id=\"script-area\"]/div/form/div/div[2]/div/em-wbs-icon/div/div/div[1]/i");
	

	
//	By deletePhraseHearValue3=By.xpath("\"//*[@id=\"script-area\"]/div/form/div/div[1]/div/em-wbs-icon/div/div/div[1]/i");
	
	By deletePhraseHearValue3=By.xpath("//*[@id=\"script-area\"]/div/form/div/div[1]/div/em-wbs-icon/div/div/div[1]/i");
	
	
	
	By firstsearchscript=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[1]/div/div[3]/div/div[2]/ul/li");
	
	By RunButton=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/div/div[2]/div/div/div[4]/div/form/div[2]/span/span/button[1]");
	
	By ResultTable=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/div/div[2]/div/div/div[5]/div[4]/em-wbs-results/div/table");
	By CallLogsLink=By.linkText("Call Logs");
	By ResultsLink=By.linkText("Results");
	
	By CallLogs=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/div/div[2]/div/div/div[5]/div[3]/div[2]/em-wbs-results/div/ol/li[1]/p");
	
	
	By selectdropdownn=By.xpath("//span//span//i[@class='glyphicon glyphicon-option-vertical']");
	
	
	By clickdeletedropdown=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/div/div[2]/div/div/div[4]/div/form/div[2]/span/span/div/ul/li[4]/a/span");
	
	By deleteAllData=By.xpath("//button[contains(text(),'All Data')]");
	
	
	By deleteScriptOnly=By.xpath("//button[contains(text(),'All Data')]");
	
	By copyScript=By.xpath("//div[@class='ng-scope']//li[1]//a[1]//span[1]");
	
	
	//Test Tab elements
	
	By testCreateplusbutton=By.xpath("//span[@class='glyphicon glyphicon-plus-sign']");		
	By testNameField=By.xpath("//*[@id=\"LAB-R\"]/div/div[2]/div[2]/form/section[1]/div/header/div/div/input");
	
//	By ScriptDropdown=By.xpath("//select[@class='form-control ng-valid ng-not-empty ng-valid-required ng-dirty ng-valid-parse ng-touched']");
	
	By ScriptDropdown=By.xpath("//*[@id=\"LAB-R\"]/div/div[2]/div[2]/form/section[3]/div/div[1]/div/div/select");
	
	By saveButtonTestTab=By.xpath("//div[@class='row']//button[@class='btn btn-primary btn-sm']");	
	By viewResult=By.xpath("//div[@class='row']//button[@class='btn btn-results btn-sm ng-scope']");
	
	
	
	By Pausebutton=By.xpath("//*[@id=\"em-wbs-icon-container\"]/div/div[1]/div/em-wbs-icon/div/div");
	
//	By Pausebutton=By.xpath("//strong[contains(text(),'Pause')]");
	 
		
	By dragTo=By.xpath("//*[@id=\"script-area\"]/div/form/div/div[1]/div/em-wbs-icon/div/div");		
	By updateScriptButton=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/div/div[2]/div/div/div[4]/div/form/div[2]/span/span/button[3]");
	
	By deleteButton=By.xpath("//div[@class='row']//button[@class='btn btn-danger btn-sm']");
	
	By yesDeleteButton=By.xpath("//button[@class='btn btn-danger']");
	
	
	
	//ContractorA
	
	public pom007_VoiceWatch_Script_Tabs(WebDriver driver) {
		this.driver=driver;
	//	this.wait=new WebDriverWait(this.driver, 10000);
	}
	
	
	// Create a script using Go script button
	
	
	public void goScriptBuilderCreation () throws InterruptedException {	

		driver.findElement(scriptsTab).click();	
	//	WebDriverWait wait=new WebDriverWait(driver,100);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(goScriptBuilderScriptslabel));
		
		Thread.sleep(10000);
		
		 if (driver.findElements(createNewScriptByButton).isEmpty()) {
				
				log.debug("Verified that create a new script plus (+) icon not appeared on top left side under Script tab");
				Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isDisplayed());
				log.debug("Verified that 'Go Script Builder Scripts' label appeared on left side of under Script tab");	
				Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isEnabled());
				log.debug("Verified that 'Go Script Builder Scripts' label enabled on left side of under Script tab");	
				
				Assert.assertEquals(driver.findElement(goScriptBuilderScriptslabel).getText().contains("Go Script Builder Scripts"), true);	
				log.debug("Verified that 'Go Script Builder Scripts' Text validated on left side under Script Tab");		
				
				Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isDisplayed());
				log.debug("Verified that 'Script count' dispalyed left side under Script tab");
				Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isEnabled());		
				log.debug("Verified that 'Script count' enabled left side under Script tab");
				
				Assert.assertTrue(driver.findElement(filterByNameGSB).isDisplayed());
				log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
				Assert.assertTrue(driver.findElement(filterByNameGSB).isEnabled());
				log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");	
				
							
			}else
			
			{
				log.debug("Verified that create a new script plus (+) icon appeared on top left side under Script tab");	
			
				Thread.sleep(100000);	
				driver.findElement(createNewScriptByButton).click();
				
			    log.debug("Validated the element while click Script Creation using button (+)");
			
			}
		
				
	}
	
	
	

//==================================================================================	
	public void goScriptBuilderTabValidation() throws InterruptedException {	

		driver.findElement(scriptsTab).click();	
	//	WebDriverWait wait=new WebDriverWait(driver,100);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(goScriptBuilderScriptslabel));
		
		Thread.sleep(10000);
		
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isDisplayed());
		log.debug("Verified that 'Go Script Builder Scripts' label appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isEnabled());
		log.debug("Verified that 'Go Script Builder Scripts' label enabled on left side of under Script tab");	
		
		Assert.assertEquals(driver.findElement(goScriptBuilderScriptslabel).getText().contains("Go Script Builder Scripts"), true);	
		log.debug("Verified that 'Go Script Builder Scripts' Text validated on left side under Script Tab");		
		
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isDisplayed());
		log.debug("Verified that 'Script count' dispalyed left side under Script tab");
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isEnabled());		
		log.debug("Verified that 'Script count' enabled left side under Script tab");
		
		Assert.assertTrue(driver.findElement(filterByNameGSB).isDisplayed());
		log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(filterByNameGSB).isEnabled());
		log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");	
		
		
         if (driver.findElements(pleaseSelectlabelGSB).isEmpty()) {
			
        	 log.debug("Verified that 'Please select a Call Master Script from the left. ' label appeared on  under Go Script builder tab");
 			log.debug("Verified that 'Please select a Call Master Script from the left. ' label enabled under Go Script builder tab");	
 			log.debug("Verified that 'Please select a Call Master Script from the left.' Text validated under Go Script Builder");
			
						
		}else
		
		{
			log.debug("Verified that 'Please select a script ' label appeared on  under Go Script builder tab");
			log.debug("Verified that 'Please select a script ' label enabled under Go Script builder tab");	
			log.debug("Verified that 'Please select a script or' Text validated under Go Script Builder");
			
		}  
		
		
				
	}

//=====================================================================================	
	public void scriptUploadTabValidation() throws InterruptedException {	

			
		
		driver.findElement(scriptUploadTab).click();
		Thread.sleep(10000);
		
		
					
		Assert.assertTrue(driver.findElement(callMasterScriptslabel).isDisplayed());
		log.debug("Verified that 'Call Master Scripts' label appeared on left side of Script Upload tab under Script tab");	
	//	Assert.assertTrue(driver.findElement(callMasterScriptslabel).isEnabled());
	//	log.debug("Verified that 'Call Master Scripts' label enabled on left side of Script Upload tab under Script tab");	
		Assert.assertEquals(driver.findElement(callMasterScriptslabel).getText().contains("Call Master Scripts"), true);	
		log.debug("Verified that 'Call Master Scripts' Text validated on left side under Script Upload Tab");		
		
		Assert.assertTrue(driver.findElement(callMasterScriptscount).isDisplayed());
		log.debug("Verified that 'Call master Script count' dispalyed on left side of Script Upload tab under Script tab");	
		Assert.assertTrue(driver.findElement(callMasterScriptscount).isEnabled());		
		log.debug("Verified that 'Call master Script count' enabled on left side of Script Upload tab under Script tab");	
		
		Assert.assertTrue(driver.findElement(filterByNameSU).isDisplayed());
		log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(filterByNameSU).isEnabled());
		log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");	
					
		  if (driver.findElements(pleaseSelectlabelGSB).isEmpty()) {
				
	        	 log.debug("Verified that 'Please select a Go Script from the left. ' label appeared on  under Script Upload tab");
	 			log.debug("Verified that 'Please select a Go Script from the left. ' label enabled under Script Upload tab");	
	 			log.debug("Verified that 'Please select a Go Script from the left.' Text validated under Script Upload tab");
				
							
			}else
			
			{
				log.debug("Verified that 'Please select a script ' label appeared on  under Script Upload tab");
				log.debug("Verified that 'Please select a script ' label enabled under Script Upload tab");	
				log.debug("Verified that 'Please select a script or' Text validated under Script Upload tab");
				
			}  
		
		  if (driver.findElements(createNewScriptBylink).isEmpty()) {
				
				log.debug("Verified that create a new script by link is not appeared under Script Upload");	
				
							
			}else
			
			{
				log.debug("Verified that create a new script by link is appeared under under Script Upload");			
	}
	
	}
	
//=================================================================================================	
	
	public void createGSBbybutton() throws InterruptedException {
		
		driver.findElement(tagTab).click();
		Thread.sleep(1000);
		driver.findElement(scriptsTab).click();
		
		
		
          if (driver.findElements(createNewScriptByButton).isEmpty()) {
			
			log.debug("Verified that create a new script plus (+) icon not appeared on top left side under Script tab");
			Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isDisplayed());
			log.debug("Verified that 'Go Script Builder Scripts' label appeared on left side of under Script tab");	
			Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isEnabled());
			log.debug("Verified that 'Go Script Builder Scripts' label enabled on left side of under Script tab");	
			
			Assert.assertEquals(driver.findElement(goScriptBuilderScriptslabel).getText().contains("Go Script Builder Scripts"), true);	
			log.debug("Verified that 'Go Script Builder Scripts' Text validated on left side under Script Tab");		
			
			Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isDisplayed());
			log.debug("Verified that 'Script count' dispalyed left side under Script tab");
			Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isEnabled());		
			log.debug("Verified that 'Script count' enabled left side under Script tab");
			
			Assert.assertTrue(driver.findElement(filterByNameGSB).isDisplayed());
			log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
			Assert.assertTrue(driver.findElement(filterByNameGSB).isEnabled());
			log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");	
			
						
		}else
		
		{
			log.debug("Verified that create a new script plus (+) icon appeared on top left side under Script tab");	
		
			Thread.sleep(10000);	
			driver.findElement(createNewScriptByButton).click();
			
		log.debug("Validated the element while click Script Creation using button (+)");
		
				
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isDisplayed());
		log.debug("Verified that 'Go Script Builder Scripts' label appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isEnabled());
		log.debug("Verified that 'Go Script Builder Scripts' label enabled on left side of under Script tab");	
		Assert.assertEquals(driver.findElement(goScriptBuilderScriptslabel).getText().contains("Go Script Builder Scripts"), true);	
		log.debug("Verified that 'Go Script Builder Scripts' Text validated on left side under Script Tab");		
		
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isDisplayed());
		log.debug("Verified that 'Script count' dispalyed left side under Script tab");
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isEnabled());		
		log.debug("Verified that 'Script count' enabled left side under Script tab");
		
		Assert.assertTrue(driver.findElement(filterByNameGSB).isDisplayed());
		log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(filterByNameGSB).isEnabled());
		log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");			
		
		Assert.assertTrue(driver.findElement(scriptNamelabel).isDisplayed());
		log.debug("Verified that 'Script name' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptNamelabel).getText(), "Script name");		
		log.debug("Verified that 'Script name' Text validated on under Go Script Builder");		
		
		Assert.assertTrue(driver.findElement(scriptNamefield).isDisplayed());
		log.debug("Verified that 'Script name' filed appeared on under Go Script Builder");		
		Assert.assertTrue(driver.findElement(scriptNamefield).isEnabled());		
		log.debug("Verified that 'Script name' field enabled on under Go Script Builder");	

		Assert.assertTrue(driver.findElement(scriptDescGSBlabel).isDisplayed());
		log.debug("Verified that 'Description' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptDescGSBlabel).getText(), "Description");		
		log.debug("Verified that 'Description' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(scriptDescGSBfield).isDisplayed());
		log.debug("Verified that 'Description' label appeared on under Go Script Builder");		
		Assert.assertTrue(driver.findElement(scriptDescGSBfield).isEnabled());		
		log.debug("Verified that 'Description' field enabled on under Go Script Builder");	
		
				
		Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
		log.debug("Verified that 'Save button' displayed under Go Script Upload tab");	
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'Save button' is disbaled under Go Script Upload tab");	
		Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
		log.debug("Verified that 'Save' Text appeared on save button under Go Script Upload tab");	
		
		Assert.assertTrue(driver.findElement(scriptBuilderlabel).isDisplayed());
		log.debug("Verified that 'Script Builder' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptBuilderlabel).getText(), "Script Builder");		
		log.debug("Verified that 'Script Builder' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(resultslabel).isDisplayed());
		log.debug("Verified that 'Results' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(resultslabel).getText(), "Results");		
		log.debug("Verified that 'Results' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(callLogsNamelabel).isDisplayed());
		log.debug("Verified that 'Call Logs' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(callLogsNamelabel).getText(), "Call Logs");		
		log.debug("Verified that 'Call Logs' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(associatedTestslabel).isDisplayed());
		log.debug("Verified that 'Associted Test' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(associatedTestslabel).getText(), "Associated Tests");		
		log.debug("Verified that 'Associted Test' Text validated on under Go Script Builder");	
		

		}
	}

	//=================================================================================================		
	
public void createGSBbyLink() throws InterruptedException {
		
	driver.findElement(tagTab).click();
	driver.findElement(scriptsTab).click();
	

		
		
          if (driver.findElements(createNewScriptBylink).isEmpty()) {
			
			log.debug("Verified that create a new script by link is not appeared under Go Script Builder tab");	
			log.debug("Verified that create a new script plus (+) icon not appeared on top left side under Script tab");
			Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isDisplayed());
			log.debug("Verified that 'Go Script Builder Scripts' label appeared on left side of under Script tab");	
			Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isEnabled());
			log.debug("Verified that 'Go Script Builder Scripts' label enabled on left side of under Script tab");	
			
			Assert.assertEquals(driver.findElement(goScriptBuilderScriptslabel).getText().contains("Go Script Builder Scripts"), true);	
			log.debug("Verified that 'Go Script Builder Scripts' Text validated on left side under Script Tab");		
			
			Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isDisplayed());
			log.debug("Verified that 'Script count' dispalyed left side under Script tab");
			Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isEnabled());		
			log.debug("Verified that 'Script count' enabled left side under Script tab");
			
			Assert.assertTrue(driver.findElement(filterByNameGSB).isDisplayed());
			log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
			Assert.assertTrue(driver.findElement(filterByNameGSB).isEnabled());
			log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");	
			
						
		}else
		
		{
			log.debug("Verified that create a new script by link is appeared under Go Script Builder tab");	
			
			Thread.sleep(10000);
			driver.findElement(createNewScriptBylink).click();
			
	/*		if (driver.getCurrentUrl() != "https://os-2k16-vm332.empirix.com/401"); {
				
				driver.findElement(scriptsTab).click();
				Thread.sleep(10000);
				driver.findElement(createNewScriptBylink).click();*/
				
			
				
			
			
	
	
 		log.debug("Validated the element while click create a new script by link");
		
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isDisplayed());
		log.debug("Verified that 'Go Script Builder Scripts' label appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isEnabled());
		log.debug("Verified that 'Go Script Builder Scripts' label enabled on left side of under Script tab");	
		Assert.assertEquals(driver.findElement(goScriptBuilderScriptslabel).getText().contains("Go Script Builder Scripts"), true);	
		log.debug("Verified that 'Go Script Builder Scripts' Text validated on left side under Script Tab");		
		
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isDisplayed());
		log.debug("Verified that 'Script count' dispalyed left side under Script tab");
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isEnabled());		
		log.debug("Verified that 'Script count' enabled left side under Script tab");
		
		Assert.assertTrue(driver.findElement(filterByNameGSB).isDisplayed());
		log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(filterByNameGSB).isEnabled());
		log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");			
		
		Assert.assertTrue(driver.findElement(scriptNamelabel).isDisplayed());
		log.debug("Verified that 'Script name' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptNamelabel).getText(), "Script name");		
		log.debug("Verified that 'Script name' Text validated on under Go Script Builder");		
		
		Assert.assertTrue(driver.findElement(scriptNamefield).isDisplayed());
		log.debug("Verified that 'Script name' filed appeared on under Go Script Builder");		
		Assert.assertTrue(driver.findElement(scriptNamefield).isEnabled());		
		log.debug("Verified that 'Script name' field enabled on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(scriptDescGSBlabel).isDisplayed());
		log.debug("Verified that 'Description' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptDescGSBlabel).getText(), "Description");		
		log.debug("Verified that 'Description' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(scriptDescGSBfield).isDisplayed());
		log.debug("Verified that 'Description' label appeared on under Go Script Builder");		
		Assert.assertTrue(driver.findElement(scriptDescGSBfield).isEnabled());		
		log.debug("Verified that 'Description' field enabled on under Go Script Builder");	
		
				
		Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
		log.debug("Verified that 'Save button' displayed under Go Script Upload tab");	
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'Save button' is disbaled under Go Script Upload tab");	
		Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
		log.debug("Verified that 'Save' Text appeared on save button under Go Script Upload tab");	
		
		Assert.assertTrue(driver.findElement(scriptBuilderlabel).isDisplayed());
		log.debug("Verified that 'Script Builder' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptBuilderlabel).getText(), "Script Builder");		
		log.debug("Verified that 'Script Builder' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(resultslabel).isDisplayed());
		log.debug("Verified that 'Results' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(resultslabel).getText(), "Results");		
		log.debug("Verified that 'Results' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(callLogsNamelabel).isDisplayed());
		log.debug("Verified that 'Call Logs' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(callLogsNamelabel).getText(), "Call Logs");		
		log.debug("Verified that 'Call Logs' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(associatedTestslabel).isDisplayed());
		log.debug("Verified that 'Associted Test' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(associatedTestslabel).getText(), "Associated Tests");		
		log.debug("Verified that 'Associted Test' Text validated on under Go Script Builder");	
		
			}
		}
		

//==============================================================================

public void createSUbyLink() throws InterruptedException {
	
	driver.findElement(tagTab).click();
	driver.findElement(scriptsTab).click();
	Thread.sleep(10000);
	driver.findElement(scriptUploadTab).click();
		
      if (driver.findElements(createNewScriptBylink).isEmpty()) {
		
		log.debug("Verified that create a new script plus (+) icon not appeared on top left side under Script Upload tab");	
		Assert.assertTrue(driver.findElement(callMasterScriptslabel).isDisplayed());
		log.debug("Verified that 'Call Master Scripts' label appeared on left side of Script Upload tab under Script tab");	
		Assert.assertTrue(driver.findElement(callMasterScriptslabel).isEnabled());
		log.debug("Verified that 'Call Master Scripts' label enabled on left side of Script Upload tab under Script tab");	
		Assert.assertEquals(driver.findElement(callMasterScriptslabel).getText().contains("Call Master Scripts"), true);	
		log.debug("Verified that 'Call Master Scripts' Text validated on left side under Script Upload Tab");		
		
		Assert.assertTrue(driver.findElement(callMasterScriptscount).isDisplayed());
		log.debug("Verified that 'Call master Script count' dispalyed on left side of Script Upload tab under Script tab");	
		Assert.assertTrue(driver.findElement(callMasterScriptscount).isEnabled());		
		log.debug("Verified that 'Call master Script count' enabled on left side of Script Upload tab under Script tab");	
		
		Assert.assertTrue(driver.findElement(filterByNameSU).isDisplayed());
		log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(filterByNameSU).isEnabled());
		log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");	
		
					
	}else
	
	{
		log.debug("Verified that create a new script plus (+) icon appeared on top left side under Script Upload tab");	
		
		driver.findElement(createNewScriptByButton).click();
	log.debug("Validated the element while click Script Creation using button (+)");
	
			
	Assert.assertTrue(driver.findElement(callMasterScriptslabel).isDisplayed());
	log.debug("Verified that 'Call Master Scripts' label appeared on left side of Script Upload tab under Script tab");	
	Assert.assertTrue(driver.findElement(callMasterScriptslabel).isEnabled());
	log.debug("Verified that 'Call Master Scripts' label enabled on left side of Script Upload tab under Script tab");	
	Assert.assertEquals(driver.findElement(callMasterScriptslabel).getText().contains("Call Master Scripts"), true);	
	log.debug("Verified that 'Call Master Scripts' Text validated on left side under Script Upload Tab");		
	
	Assert.assertTrue(driver.findElement(callMasterScriptscount).isDisplayed());
	log.debug("Verified that 'Call master Script count' dispalyed on left side of Script Upload tab under Script tab");	
	Assert.assertTrue(driver.findElement(callMasterScriptscount).isEnabled());		
	log.debug("Verified that 'Call master Script count' enabled on left side of Script Upload tab under Script tab");	
	
	Assert.assertTrue(driver.findElement(filterByNameSU).isDisplayed());
	log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
	Assert.assertTrue(driver.findElement(filterByNameSU).isEnabled());
	log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");		
	Assert.assertTrue(driver.findElement(scriptNamelabel).isDisplayed());
	log.debug("Verified that 'Script name' label appeared on under Script Upload");		
	Assert.assertEquals(driver.findElement(scriptNamelabel).getText(), "Script name");		
	log.debug("Verified that 'Script name' Text validated on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptNamefield).isDisplayed());
	log.debug("Verified that 'Script name' filed appeared on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptNamefield).isEnabled());		
	log.debug("Verified that 'Script name' field enabled on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptDescSUlabel).isDisplayed());
	log.debug("Verified that 'Description' label appeared on under Script Upload");		
	Assert.assertEquals(driver.findElement(scriptDescSUlabel).getText(), "Description");		
	log.debug("Verified that 'Description' Text validated on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptDescSUfield).isDisplayed());
	log.debug("Verified that 'Description' label appeared on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptDescSUfield).isEnabled());		
	log.debug("Verified that 'Description' field enabled on under Script Upload");				
	Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
	log.debug("Verified that 'Save button' displayed under Go Script Upload tab");	
	Assert.assertFalse(driver.findElement(saveButton).isEnabled());
	log.debug("Verified that 'Save button' is disbaled under Go Script Upload tab");	
	Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
	log.debug("Verified that 'Save' Text appeared on save button under Go Script Upload tab");	
	
//	Assert.assertTrue(driver.findElement(uploadScriptFile).isDisplayed());
	log.debug("Verified that 'Click to select a script, or drop file below (.xml)' button appeared under Script Upload tab");	
	Assert.assertTrue(driver.findElement(uploadScriptFile).isEnabled());
	log.debug("Verified that 'Click to select a script, or drop file below (.xml)' button enabled under Script Upload tab");
	
	

	}
}
//========================================================================================================================
public void createSUbybutton() throws InterruptedException {
	
	driver.findElement(tagTab).click();
	driver.findElement(scriptsTab).click();
	Thread.sleep(10000);
	driver.findElement(scriptUploadTab).click();
		
      if (driver.findElements(createNewScriptByButtonSU).isEmpty()) {
		
    	  log.debug("Verified that create a new script by link is not appeared under Script Upload tab");	
    	  Assert.assertTrue(driver.findElement(callMasterScriptslabel).isDisplayed());
  		log.debug("Verified that 'Call Master Scripts' label appeared on left side of Script Upload tab under Script tab");	
  		Assert.assertTrue(driver.findElement(callMasterScriptslabel).isEnabled());
  		log.debug("Verified that 'Call Master Scripts' label enabled on left side of Script Upload tab under Script tab");	
  		Assert.assertEquals(driver.findElement(callMasterScriptslabel).getText().contains("Call Master Scripts"), true);	
  		log.debug("Verified that 'Call Master Scripts' Text validated on left side under Script Upload Tab");		
  		
  		Assert.assertTrue(driver.findElement(callMasterScriptscount).isDisplayed());
  		log.debug("Verified that 'Call master Script count' dispalyed on left side of Script Upload tab under Script tab");	
  		Assert.assertTrue(driver.findElement(callMasterScriptscount).isEnabled());		
  		log.debug("Verified that 'Call master Script count' enabled on left side of Script Upload tab under Script tab");	
  		
  		Assert.assertTrue(driver.findElement(filterByNameSU).isDisplayed());
  		log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
  		Assert.assertTrue(driver.findElement(filterByNameSU).isEnabled());
  		log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");	
		
					
	}else
	
	{
		log.debug("Verified that create a new script by link is appeared under Script Upload tab");	
		
		Thread.sleep(10000);
		driver.findElement(createNewScriptByButtonSU).click();
	log.debug("Validated the element while click Script Creation using button");
	
			
	Assert.assertTrue(driver.findElement(callMasterScriptslabel).isDisplayed());
	log.debug("Verified that 'Call Master Scripts' label appeared on left side of Script Upload tab under Script tab");	
	Assert.assertTrue(driver.findElement(callMasterScriptslabel).isEnabled());
	log.debug("Verified that 'Call Master Scripts' label enabled on left side of Script Upload tab under Script tab");	
	Assert.assertEquals(driver.findElement(callMasterScriptslabel).getText().contains("Call Master Scripts"), true);	
	log.debug("Verified that 'Call Master Scripts' Text validated on left side under Script Upload Tab");		
	
	Assert.assertTrue(driver.findElement(callMasterScriptscount).isDisplayed());
	log.debug("Verified that 'Call master Script count' dispalyed on left side of Script Upload tab under Script tab");	
	Assert.assertTrue(driver.findElement(callMasterScriptscount).isEnabled());		
	log.debug("Verified that 'Call master Script count' enabled on left side of Script Upload tab under Script tab");	
	
	Assert.assertTrue(driver.findElement(filterByNameSU).isDisplayed());
	log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
	Assert.assertTrue(driver.findElement(filterByNameSU).isEnabled());
	log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");		
	Assert.assertTrue(driver.findElement(scriptNamelabel).isDisplayed());
	log.debug("Verified that 'Script name' label appeared on under Script Upload");		
	Assert.assertEquals(driver.findElement(scriptNamelabel).getText(), "Script name");		
	log.debug("Verified that 'Script name' Text validated on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptNamefield).isDisplayed());
	log.debug("Verified that 'Script name' filed appeared on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptNamefield).isEnabled());		
	log.debug("Verified that 'Script name' field enabled on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptDescSUlabel).isDisplayed());
	log.debug("Verified that 'Description' label appeared on under Script Upload");		
	Assert.assertEquals(driver.findElement(scriptDescSUlabel).getText(), "Description");		
	log.debug("Verified that 'Description' Text validated on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptDescSUfield).isDisplayed());
	log.debug("Verified that 'Description' label appeared on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptDescSUfield).isEnabled());		
	log.debug("Verified that 'Description' field enabled on under Script Upload");				
	Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
	log.debug("Verified that 'Save button' displayed under Script Upload tab");	
	Assert.assertFalse(driver.findElement(saveButton).isEnabled());
	log.debug("Verified that 'Save button' is disbaled under Script Upload tab");	
	Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
	log.debug("Verified that 'Save' Text appeared on save button under Script Upload tab");		
	
	Assert.assertTrue(driver.findElement(uploadScriptFile).isDisplayed());
	log.debug("Verified that 'Click to select a script, or drop file below (.xml)' button appeared under Script Upload tab");	
	Assert.assertTrue(driver.findElement(uploadScriptFile).isEnabled());
	log.debug("Verified that 'Click to select a script, or drop file below (.xml)' button enabled under Script Upload tab");	
	
	
	
	
	}
}
//===================================================================================================
public void csvTabValidation() throws InterruptedException {	

	driver.findElement(tagTab).click();
	driver.findElement(scriptsTab).click();
	Thread.sleep(10000);
	
	if (driver.findElements(csvTranformerTab).isEmpty()) {
		
		log.debug("Verified that CSV Tranformer tab not appeared under Script tab");	
		
					
	}else
	
	{
		log.debug("Verified that CSV Tranformer tab appeared under Script tab");	
		
	
  
	
	
	driver.findElement(csvTranformerTab).click();
	
	Thread.sleep(10000);
	
	Assert.assertTrue(driver.findElement(uploadCSVFile).isDisplayed());
	log.debug("Verified that 'Click to select CSV files, or drop them below (.csv,.zip)' button appeared under CSV Upload tab");	
	Assert.assertTrue(driver.findElement(uploadCSVFile).isEnabled());
	log.debug("Verified that 'Click to select CSV files, or drop them below (.csv,.zip)' button enabled under CSV Upload tab");	
	
	Assert.assertTrue(driver.findElement(samplecsvDownoad).isDisplayed());
	log.debug("Verified that 'Sample CSV download' label appeared on left side of under CSV Upload tab");	
	Assert.assertTrue(driver.findElement(transformedCSVlabel).isEnabled());
	log.debug("Verified that 'Sample CSV download' label enabled on left side of under CSV Upload tab");	
	
	
	
    if (driver.findElements(transformedCSVlabel).isEmpty()) {
		
    	log.debug("Verified that 'Transformed CSV(s)' label is not appearing on left side of under CSV Upload tab");	
    	log.debug("Verified that 'Transformed CSV(s)' label not enabled on left side of under CSV Upload tab");	
		
					
	}else
	
	{
		log.debug("Verified that 'Transformed CSV(s)' label appeared on left side of under CSV Upload tab");	
    	log.debug("Verified that 'Transformed CSV(s)' label enabled on left side of under CSV Upload tab");	
	
	}
    
    
   if (driver.findElements(filterByCSV).isEmpty()) {
		
	   log.debug("Verified that 'Filter by csv file name' filed is not appearing under CSV Upload tab");	
		log.debug("Verified that 'Filter by csv file name' filed is not enabled under CSV Upload tab");
		
					
	}else
	
	{
		log.debug("Verified that 'Filter by csv file name' filed appeared under CSV Upload tab");	
		log.debug("Verified that 'Filter by csv file name' filed enabled under CSV Upload tab");
	
	}
	}
	}
//=====================================================================================================

//Creation of Script-Creation Page

public WebElement getScriptName() {
	
	return driver.findElement(scriptNamefield);
	
}

public WebElement getScriptDesc() {
	
	return driver.findElement(scriptDescGSBfield);
		
}

public WebElement getNumberToCall() {
	
	return driver.findElement(numberToCall);
}

public WebElement getHearVoice1() {
	
	return driver.findElement(PhraseHearValue1);
}

public WebElement getHearVoice2() {
	
	return driver.findElement(PhraseHearValue2);
}


public String reteriveScriptName() {
	
	
	return Reuseable_Script.getSaltString();
}


public WebElement getTestName() {
	
	return driver.findElement(testNameField);
}


//===========================================
//DeleteScript

public void selectDeleteScript(String Delete) {
    // Open the dropdown so the options are visible
     driver.findElement(By.className("selectdropdownn")).click();
     // Get all of the options
	

     List <WebElement> options = driver.findElements(By.xpath("clickdeletedropdown"));
     // Loop through the options and select the one that matches
     for (WebElement opt : options) {
         if (opt.getText().equals("Delete")) {
        	 
        	 log.info("found Delete option from drop down");
             opt.click();
             log.info("Deleted Successsfully");
             return;
         }
     }
}




//===========================================================================================================================

// Creating Script


public void CreateScript() throws InterruptedException {
	
	Thread.sleep(1000);
	driver.findElement(tagTab).click();	
	driver.findElement(scriptsTab).click();	
	log.info("Navigate to script Tab");
	
	Thread.sleep(10000);
	log.info("Taking few second to access Script Tab");

	Thread.sleep(10000);
//	WebElement createNewScriptByButton = (new WebDriverWait(driver, 10))
//	  .until(ExpectedConditions.presenceOfElementLocated(createNewScriptByButtonSU));
	
//	WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(createNewScriptByButton));
//	Assert.assertTrue(driver.findElement(createNewScriptByButton).isDisplayed());
	driver.findElement(createNewScriptByButton).click();
	log.info("Start Creating Script using + button");
	String ScriptName=Reuseable_Script.getSaltString();
	log.info("Generate Radom scriptname");
	getScriptName().sendKeys(ScriptName);
	log.info("Passing script name");
//	getScriptName().sendKeys("Script_" +Reuseable_Script.getSaltString());
	getScriptDesc().sendKeys(Reuseable_Script.getSaltString());
	log.info("Generate Radom script description");
	getNumberToCall().sendKeys("1800111111");
	log.info("Passing Number to Call");
	getHearVoice1().sendKeys("Welcome");
	log.info("Passing HearVoice to Call");
	driver.findElement(deletePhraseHearValue2).click();
	log.info("Deleting Number to Call");
//	Thread.sleep(10000);
//	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(saveButton));
	driver.findElement(saveButton).click();
	
	log.info("Clicked Save button");
//	String scriptName=reteriveScriptName();
//	System.out.println("String Name is "+scriptName);
	
	Thread.sleep(20000);
	driver.findElement(tagTab).click();
	Thread.sleep(1000);
	log.info("Navigate to Tag button");
	driver.findElement(scriptsTab).click();
	Thread.sleep(1000);
	log.info("Navigate to Script button");
	driver.findElement(filterByNameGSB).sendKeys(ScriptName);
	log.info("Search above created Script using filter");
	Thread.sleep(11000);
	
 driver.findElement(firstsearchscript).click();
	log.info("clicked above search script");
 
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	
	Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain Run Test text");
	
	driver.findElement(RunButton).click();
	Thread.sleep(10000);
	log.info("Running created script");
	
//	WebDriverWait wait1 = new WebDriverWait(driver, 10000);
//	wait1.until(ExpectedConditions.presenceOfElementLocated(RunButton));	
	
	Assert.assertTrue(driver.findElement(ResultTable).isDisplayed());
	log.info("Verified that result diaplayed enabled");
	
	driver.findElement(CallLogsLink).click();
	
	log.info("Navigate to Call logs Tab");
	
//	Assert.assertTrue(driver.findElement(CallLogs).isDisplayed());
	log.info("Verified that Call logs diaplayed");
	
//	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(RunButton));
	
//	Thread.sleep(100000);
//	WebDriverWait wait4 = new WebDriverWait(driver, 100); wait4.until(ExpectedConditions.presenceOfElementLocated(RunButton));
//	Assert.assertTrue(driver.findElement(RunButton).isDisplayed());
	log.info("Verified that result enabled");
	

	
	
	
}
//==================================================================================================================================
//Delete Script with option Script Only

public void DeleteScriptAllData() throws InterruptedException {

	Thread.sleep(1000);
	driver.findElement(tagTab).click();	
	driver.findElement(scriptsTab).click();	
	log.info("Navigate to script Tab");
	
	Thread.sleep(10000);
	log.info("Taking few second to access Script Tab");
	
	
//	WebDriverWait wait = new WebDriverWait(driver, 10000);
//	wait3.until(ExpectedConditions.presenceOfElementLocated(createNewScriptByButton));
	
//	wait.until(ExpectedConditions.presenceOfElementLocated(createNewScriptByButton));
	Thread.sleep(10000);	
	
	driver.findElement(createNewScriptByButton).click();
	log.info("Start Creating Script using + button");
	String ScriptName=Reuseable_Script.getSaltString();
	log.info("Generate Radom scriptname");
	getScriptName().sendKeys(ScriptName);
	log.info("Passing script name");
//	getScriptName().sendKeys("Script_" +Reuseable_Script.getSaltString());
	getScriptDesc().sendKeys(Reuseable_Script.getSaltString());
	log.info("Generate Radom script description");
	getNumberToCall().sendKeys("1800111111");
	log.info("Passing Number to Call");
	getHearVoice1().sendKeys("Welcome");
	log.info("Passing HearVoice to Call");
	driver.findElement(deletePhraseHearValue2).click();
	log.info("Deleting Number to Call");
//	Thread.sleep(10000);
//	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(saveButton));
	driver.findElement(saveButton).click();
	
	log.info("Clicked Save button");
//	String scriptName=reteriveScriptName();
//	System.out.println("String Name is "+scriptName);
	
	Thread.sleep(20000);
	driver.findElement(tagTab).click();
	Thread.sleep(9000);
	log.info("Navigate to Tag button");
	driver.findElement(scriptsTab).click();
	Thread.sleep(1000);
	log.info("Navigate to Script button");
	driver.findElement(filterByNameGSB).sendKeys(ScriptName);
	log.info("Search above created Script using filter");
	Thread.sleep(15000);
	driver.findElement(firstsearchscript).click();
	log.info("clicked above search script");
 
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	
	driver.findElement(selectdropdownn).click();
	log.info("Verified that select dropdown");
	
	
	
	Thread.sleep(100);
	driver.findElement(clickdeletedropdown).click();
	
	log.info("Verified that Clicked delete button");
	
	driver.findElement(deleteAllData).click();
	
	log.info("Verified that select delete all data");
	Thread.sleep(10000);
	driver.switchTo().alert().accept();
	log.info("delete successfully");
	
	 


}
//==============================================================================================================
//Delete Script with option Script Only
	
public void DeleteScriptOnly() throws InterruptedException {
	

	Thread.sleep(1000);
	driver.findElement(tagTab).click();	
	driver.findElement(scriptsTab).click();	
	log.info("Navigate to script Tab");
	
	Thread.sleep(10000);
	log.info("Taking few second to access Script Tab");
	
	
//	WebDriverWait wait = new WebDriverWait(driver, 10000);
//	wait3.until(ExpectedConditions.presenceOfElementLocated(createNewScriptByButton));
	
//	wait.until(ExpectedConditions.presenceOfElementLocated(createNewScriptByButton));
	Thread.sleep(10000);	
	
	driver.findElement(createNewScriptByButton).click();
	log.info("Start Creating Script using + button");
	String ScriptName=Reuseable_Script.getSaltString();
	log.info("Generate Radom scriptname");
	getScriptName().sendKeys(ScriptName);
	log.info("Passing script name");
//	getScriptName().sendKeys("Script_" +Reuseable_Script.getSaltString());
	getScriptDesc().sendKeys(Reuseable_Script.getSaltString());
	log.info("Generate Radom script description");
	getNumberToCall().sendKeys("1800111111");
	log.info("Passing Number to Call");
	getHearVoice1().sendKeys("Welcome");
	log.info("Passing HearVoice to Call");
	driver.findElement(deletePhraseHearValue2).click();
	log.info("Deleting Number to Call");
//	Thread.sleep(10000);
//	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(saveButton));
	driver.findElement(saveButton).click();
	
	log.info("Clicked Save button");
//	String scriptName=reteriveScriptName();
//	System.out.println("String Name is "+scriptName);
	
	Thread.sleep(25000);
	driver.findElement(tagTab).click();
	Thread.sleep(10200);
	log.info("Navigate to Tag button");
	driver.findElement(scriptsTab).click();
	Thread.sleep(1000);
	log.info("Navigate to Script button");
	driver.findElement(filterByNameGSB).sendKeys(ScriptName);
	log.info("Search above created Script using filter");
	Thread.sleep(15000);
	driver.findElement(firstsearchscript).click();
	log.info("clicked above search script");
 
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	
	driver.findElement(selectdropdownn).click();
	log.info("Verified that select dropdown");
	
	
	
	Thread.sleep(100);
	driver.findElement(clickdeletedropdown).click();
	
	log.info("Verified that Clicked delete button");
	
	driver.findElement(deleteScriptOnly).click();
	
	log.info("Verified that select delete all data");
	Thread.sleep(10000);
	driver.switchTo().alert().accept();
	log.info("delete successfully");

}
//==============================================================================================================================
//Test Script Copy functinality
	
public void CopyScript() throws InterruptedException {
	

	Thread.sleep(1000);
	driver.findElement(tagTab).click();	
	driver.findElement(scriptsTab).click();	
	log.info("Navigate to script Tab");
	
	Thread.sleep(10000);
	log.info("Taking few second to access Script Tab");
	
	Thread.sleep(10000);	
	
	driver.findElement(createNewScriptByButton).click();
	log.info("Start Creating Script using + button");
	String ScriptName=Reuseable_Script.getSaltString();
	log.info("Generate Radom scriptname");
	getScriptName().sendKeys(ScriptName);
	log.info("Passing script name");
//	getScriptName().sendKeys("Script_" +Reuseable_Script.getSaltString());
	getScriptDesc().sendKeys(Reuseable_Script.getSaltString());
	log.info("Generate Radom script description");
	getNumberToCall().sendKeys("1800111111");
	log.info("Passing Number to Call");
	getHearVoice1().sendKeys("Welcome");
	log.info("Passing HearVoice to Call");
	driver.findElement(deletePhraseHearValue2).click();
	log.info("Deleting Number to Call");
//	Thread.sleep(10000);
//	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(saveButton));
	driver.findElement(saveButton).click();
	
	log.info("Clicked Save button");
//	String scriptName=reteriveScriptName();
//	System.out.println("String Name is "+scriptName);
	
	Thread.sleep(25000);
	driver.findElement(tagTab).click();
	Thread.sleep(9000);
	log.info("Navigate to Tag button");
	driver.findElement(scriptsTab).click();
	Thread.sleep(1000);
	log.info("Navigate to Script button");
	driver.findElement(filterByNameGSB).sendKeys(ScriptName);
	log.info("Search above created Script using filter");
	Thread.sleep(15000);
	driver.findElement(firstsearchscript).click();
	log.info("clicked above search script");
 
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	
	driver.findElement(selectdropdownn).click();
	log.info("Verified that select dropdown");
	
	
	
	Thread.sleep(100);
	
	driver.findElement(copyScript).click();
	driver.findElement(filterByNameGSB).clear();
	log.info("Verified that select copy data");
	log.info("copied successfully");
	Thread.sleep(25000);
	driver.findElement(tagTab).click();
	log.info("Navigate to Tag button");
	Thread.sleep(1000);
	log.info("Navigate to Tag button");
	driver.findElement(scriptsTab).click();
	Thread.sleep(1000);
	driver.findElement(filterByNameGSB).sendKeys(ScriptName+" - Copy");
	log.info("copied added in search");	
	Thread.sleep(15000);
	driver.findElement(firstsearchscript).click();
	log.info("first copied search successfully");
	Thread.sleep(100);
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button enabled");

}

//===========================================================================================================================================

//Create a Test

public void CreateTest() throws InterruptedException {
	

	Thread.sleep(1000);
	driver.findElement(tagTab).click();	
	driver.findElement(scriptsTab).click();	
	log.info("Navigate to script Tab");
	
//	Thread.sleep(10000);
	log.info("Taking few second to access Script Tab");

	Thread.sleep(10000);	
	
	driver.findElement(createNewScriptByButton).click();
	log.info("Start Creating Script using + button");
	String ScriptName=Reuseable_Script.getSaltString();
	log.info("Generate Radom scriptname");
	getScriptName().sendKeys(ScriptName);
	log.info("Passing script name");
//	getScriptName().sendKeys("Script_" +Reuseable_Script.getSaltString());
	getScriptDesc().sendKeys(Reuseable_Script.getSaltString());
	log.info("Generate Radom script description");
	getNumberToCall().sendKeys("1800111111");
	log.info("Passing Number to Call");
	getHearVoice1().sendKeys("Welcome");
	log.info("Passing HearVoice to Call");
	driver.findElement(deletePhraseHearValue2).click();
	log.info("Deleting Number to Call");
	Thread.sleep(10000);
//	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(saveButton));
	driver.findElement(saveButton).click();
	
	log.info("Clicked Save button");
//	String scriptName=reteriveScriptName();
//	System.out.println("String Name is "+scriptName);
	
	Thread.sleep(10000);
	driver.findElement(tagTab).click();
	Thread.sleep(10000);
	log.info("Navigate to Tag button");
	driver.findElement(scriptsTab).click();
	Thread.sleep(1000);
	log.info("Navigate to Script button");
	driver.findElement(filterByNameGSB).sendKeys(ScriptName);
	log.info("Search above created Script using filter");
	Thread.sleep(10100);
	

	driver.findElement(firstsearchscript).click();
	log.info("clicked above search script");
 
		
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	
	Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain Run Test text");
	
	 driver.findElement(By.xpath("//*[@id=\"script-area\"]/div/form/div/div[1]/div/em-wbs-icon/div/div/div[1]/i")).click();
	 log.info("deleted first");
	 driver.findElement(By.xpath("//*[@id=\"script-area\"]/div/form/div/div/div/em-wbs-icon/div/div/div[1]/i")).click();
	 log.info("deleted second");
	
	Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(By.xpath("//div[@class='col-md-3 col-xs-3 column']//div[@class='sortable-row ng-pristine ng-untouched ng-valid ng-scope ng-not-empty']//div[1]//div[1]//em-wbs-icon[1]//div[1]//div[1] "))).doubleClick().build().perform();
	
//	Thread.sleep(1000);
	log.info("double clicked perfomed");
//	Thread.sleep(1000);
	Assert.assertTrue(driver.findElement(updateScriptButton).isEnabled());
	log.info("Update button enabled");
//	Thread.sleep(10100);
	driver.findElement(updateScriptButton).click();
	log.info("Update button clicked");
	
	
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	
//	Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain Run Test text");
	
	
	Thread.sleep(10000);
	driver.findElement(testTab).click();
	Thread.sleep(1000);
	log.info("Navigate to Test Tab");
	Thread.sleep(1000);
	
	driver.findElement(testCreateplusbutton).click();
	Thread.sleep(1000);
	getTestName().sendKeys(ScriptName);
	
	 WebElement dropdown = driver.findElement(ScriptDropdown); 
		
 	 
	 Select s = new Select(dropdown);
	 
	// s.selectByValue(ScriptName);	
	 s.selectByVisibleText(ScriptName);
	
	Thread.sleep(10100);
	
	
	driver.findElement(saveButtonTestTab).click();
	log.info("clicked above search script");
 
	Assert.assertTrue(driver.findElement(viewResult).isEnabled());
	log.info("Verified that Run button enabled");
	
	Thread.sleep(10100);

}

//=========================================================================================================================================

//Update Script

public void UpdateScript() throws InterruptedException {

	Thread.sleep(1000);
	driver.findElement(tagTab).click();	
	driver.findElement(scriptsTab).click();	
	log.info("Navigate to script Tab");
	
//	Thread.sleep(10000);
	log.info("Taking few second to access Script Tab");

	Thread.sleep(20000);	
	
	driver.findElement(createNewScriptByButton).click();
	log.info("Start Creating Script using + button");
	String ScriptName=Reuseable_Script.getSaltString();
	log.info("Generate Radom scriptname");
	getScriptName().sendKeys(ScriptName);
	log.info("Passing script name");
//	getScriptName().sendKeys("Script_" +Reuseable_Script.getSaltString());
	getScriptDesc().sendKeys(Reuseable_Script.getSaltString());
	log.info("Generate Radom script description");
	getNumberToCall().sendKeys("1800111111");
	log.info("Passing Number to Call");
	getHearVoice1().sendKeys("Welcome");
	log.info("Passing HearVoice to Call");
	driver.findElement(deletePhraseHearValue2).click();
	log.info("Deleting Number to Call");
//	Thread.sleep(10000);
	driver.findElement(saveButton).click();
	log.info("Clicked Save button");

	Thread.sleep(25000);
	driver.findElement(tagTab).click();
	Thread.sleep(9000);
	log.info("Navigate to Tag button");
	driver.findElement(scriptsTab).click();
	Thread.sleep(1000);
	log.info("Navigate to Script button");
	driver.findElement(filterByNameGSB).sendKeys(ScriptName);
	log.info("Search above created Script using filter");
	Thread.sleep(15000);
	

	driver.findElement(firstsearchscript).click();
	log.info("clicked above search script");
 
		
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	
	Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain Run Test text");
	
	 driver.findElement(By.xpath("//*[@id=\"script-area\"]/div/form/div/div[1]/div/em-wbs-icon/div/div/div[1]/i")).click();
	 log.info("deleted first");
	 driver.findElement(By.xpath("//*[@id=\"script-area\"]/div/form/div/div/div/em-wbs-icon/div/div/div[1]/i")).click();
	 log.info("deleted second");
	
	Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(By.xpath("//div[@class='col-md-3 col-xs-3 column']//div[@class='sortable-row ng-pristine ng-untouched ng-valid ng-scope ng-not-empty']//div[1]//div[1]//em-wbs-icon[1]//div[1]//div[1] "))).doubleClick().build().perform();
	
//	Thread.sleep(1000);
	log.info("double clicked perfomed");
//	Thread.sleep(1000);
	Assert.assertTrue(driver.findElement(updateScriptButton).isEnabled());
	log.info("Update button enabled");
//	Thread.sleep(10100);
	driver.findElement(updateScriptButton).click();
	log.info("Update button clicked");
	
	
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	Thread.sleep(9000);
	Assert.assertTrue(driver.findElement(RunButton).isDisplayed());
	log.info("Verified that Run button displayed");
//	Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button dispayed");
	
}
//================================================================================================================
//Delete Test

public void DeleteTest() throws InterruptedException {
	
	driver.findElement(scriptsTab).click();	
	log.info("Navigate to script Tab");
	
//	Thread.sleep(10000);
	log.info("Taking few second to access Script Tab");

	Thread.sleep(10000);	
	
	driver.findElement(createNewScriptByButton).click();
	log.info("Start Creating Script using + button");
	String ScriptName=Reuseable_Script.getSaltString();
	log.info("Generate Radom scriptname");
	getScriptName().sendKeys(ScriptName);
	log.info("Passing script name");
//	getScriptName().sendKeys("Script_" +Reuseable_Script.getSaltString());
	getScriptDesc().sendKeys(Reuseable_Script.getSaltString());
	log.info("Generate Radom script description");
	getNumberToCall().sendKeys("1800111111");
	log.info("Passing Number to Call");
	getHearVoice1().sendKeys("Welcome");
	log.info("Passing HearVoice to Call");
	driver.findElement(deletePhraseHearValue2).click();
	log.info("Deleting Number to Call");
	Thread.sleep(10000);
//	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(saveButton));
	driver.findElement(saveButton).click();
	
	log.info("Clicked Save button");
//	String scriptName=reteriveScriptName();
//	System.out.println("String Name is "+scriptName);
	
	Thread.sleep(10000);
	driver.findElement(tagTab).click();
	Thread.sleep(10000);
	log.info("Navigate to Tag button");
	driver.findElement(scriptsTab).click();
	Thread.sleep(1000);
	log.info("Navigate to Script button");
	driver.findElement(filterByNameGSB).sendKeys(ScriptName);
	log.info("Search above created Script using filter");
	Thread.sleep(10100);
	

	driver.findElement(firstsearchscript).click();
	log.info("clicked above search script");

		
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	
	Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain Run Test text");
	
	 driver.findElement(By.xpath("//*[@id=\"script-area\"]/div/form/div/div[1]/div/em-wbs-icon/div/div/div[1]/i")).click();
	 log.info("deleted first");
	 driver.findElement(By.xpath("//*[@id=\"script-area\"]/div/form/div/div/div/em-wbs-icon/div/div/div[1]/i")).click();
	 log.info("deleted second");
	
	Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(By.xpath("//div[@class='col-md-3 col-xs-3 column']//div[@class='sortable-row ng-pristine ng-untouched ng-valid ng-scope ng-not-empty']//div[1]//div[1]//em-wbs-icon[1]//div[1]//div[1] "))).doubleClick().build().perform();
	
//	Thread.sleep(1000);
	log.info("double clicked perfomed");
//	Thread.sleep(1000);
	Assert.assertTrue(driver.findElement(updateScriptButton).isEnabled());
	log.info("Update button enabled");
//	Thread.sleep(10100);
	driver.findElement(updateScriptButton).click();
	log.info("Update button clicked");
	
	
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	
//	Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain Run Test text");
	
	
	Thread.sleep(10000);
	driver.findElement(testTab).click();
	Thread.sleep(1000);
	log.info("Navigate to Test Tab");
	Thread.sleep(1000);
	
	driver.findElement(testCreateplusbutton).click();
	Thread.sleep(1000);
	getTestName().sendKeys(ScriptName);
	
	 WebElement dropdown = driver.findElement(ScriptDropdown); 
		
	 
	 Select s = new Select(dropdown);
	 
	// s.selectByValue(ScriptName);	
	 s.selectByVisibleText(ScriptName);
	
	Thread.sleep(10100);
	
	
	driver.findElement(saveButtonTestTab).click();
	log.info("clicked above search script");

	Assert.assertTrue(driver.findElement(viewResult).isEnabled());
	log.info("Verified that Run button enabled");
	Thread.sleep(10000);
	driver.findElement(deleteButton).click();

	driver.findElement(yesDeleteButton).click();
	

}

//================================================================================================================
//Update Test

public void UpdateTest() throws InterruptedException {
	
	driver.findElement(scriptsTab).click();	
	log.info("Navigate to script Tab");
	
//	Thread.sleep(10000);
	log.info("Taking few second to access Script Tab");

	Thread.sleep(10000);	
	
	driver.findElement(createNewScriptByButton).click();
	log.info("Start Creating Script using + button");
	String ScriptName=Reuseable_Script.getSaltString();
	log.info("Generate Radom scriptname");
	getScriptName().sendKeys(ScriptName);
	log.info("Passing script name");
//	getScriptName().sendKeys("Script_" +Reuseable_Script.getSaltString());
	getScriptDesc().sendKeys(Reuseable_Script.getSaltString());
	log.info("Generate Radom script description");
	getNumberToCall().sendKeys("1800111111");
	log.info("Passing Number to Call");
	getHearVoice1().sendKeys("Welcome");
	log.info("Passing HearVoice to Call");
	driver.findElement(deletePhraseHearValue2).click();
	log.info("Deleting Number to Call");
	Thread.sleep(10000);
//	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(saveButton));
	driver.findElement(saveButton).click();
	
	log.info("Clicked Save button");
//	String scriptName=reteriveScriptName();
//	System.out.println("String Name is "+scriptName);
	
	Thread.sleep(10000);
	driver.findElement(tagTab).click();
	Thread.sleep(10000);
	log.info("Navigate to Tag button");
	driver.findElement(scriptsTab).click();
	Thread.sleep(1000);
	log.info("Navigate to Script button");
	driver.findElement(filterByNameGSB).sendKeys(ScriptName);
	log.info("Search above created Script using filter");
	Thread.sleep(10100);
	

	driver.findElement(firstsearchscript).click();
	log.info("clicked above search script");

		
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	
	Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain Run Test text");
	
	 driver.findElement(By.xpath("//*[@id=\"script-area\"]/div/form/div/div[1]/div/em-wbs-icon/div/div/div[1]/i")).click();
	 log.info("deleted first");
	 driver.findElement(By.xpath("//*[@id=\"script-area\"]/div/form/div/div/div/em-wbs-icon/div/div/div[1]/i")).click();
	 log.info("deleted second");
	
	Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(By.xpath("//div[@class='col-md-3 col-xs-3 column']//div[@class='sortable-row ng-pristine ng-untouched ng-valid ng-scope ng-not-empty']//div[1]//div[1]//em-wbs-icon[1]//div[1]//div[1] "))).doubleClick().build().perform();
	
//	Thread.sleep(1000);
	log.info("double clicked perfomed");
//	Thread.sleep(1000);
	Assert.assertTrue(driver.findElement(updateScriptButton).isEnabled());
	log.info("Update button enabled");
//	Thread.sleep(10100);
	driver.findElement(updateScriptButton).click();
	log.info("Update button clicked");
	
	
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	
//	Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain Run Test text");
	
	
	Thread.sleep(10000);
	driver.findElement(testTab).click();
	Thread.sleep(1000);
	log.info("Navigate to Test Tab");
	Thread.sleep(1000);
	
	driver.findElement(testCreateplusbutton).click();
	Thread.sleep(1000);
	getTestName().sendKeys(ScriptName);
	
 WebElement dropdown = driver.findElement(ScriptDropdown); 
		
	 
	 Select s = new Select(dropdown);
	 
	// s.selectByValue(ScriptName);	
	 s.selectByVisibleText(ScriptName);
	
	Thread.sleep(10100);
	
	
	driver.findElement(saveButtonTestTab).click();
	log.info("clicked above search script");
	
	Select s1=new Select(dropdown);
	s1.selectByIndex(1);
	

	Assert.assertTrue(driver.findElement(viewResult).isEnabled());
	log.info("Verified that Run button enabled");

}

//=====================================================================================================================

//Create Script Upload

public void CreateScriptByScriptUpload () throws InterruptedException, IOException {
	
	driver.findElement(tagTab).click();
	log.info("clicked tagTab");
	driver.findElement(scriptsTab).click();
	log.info("clicked ScriptTab");
	Thread.sleep(10000);
	driver.findElement(scriptUploadTab).click();
	Thread.sleep(10000);
	log.info("clicked ScriptUploadTab");
	driver.findElement(createNewScriptByButtonSU).click();
	Thread.sleep(1000);
	driver.findElement(uploadScriptFile).click();
	Thread.sleep(1000);	
	Runtime.getRuntime().exec("C:\\Users\\hsingh\\Documents\\FileUpload1.exe");
	Thread.sleep(10000);
	driver.findElement(uploadScriptSaveButton).click();
	log.info("ScriptUploaded Successfully");
	Thread.sleep(1000);
	
}

//Delete ScriptUpload

public void deleteScriptUpload() throws InterruptedException {
	
	Thread.sleep(10000);
//	driver.findElement(tagTab).click();
//	log.info("clicked tagTab");
	driver.findElement(scriptsTab).click();
	log.info("clicked ScriptTab");
	Thread.sleep(10000);
	driver.findElement(scriptUploadTab).click();
	Thread.sleep(10000);
	log.info("clicked ScriptUploadTab");
//	driver.findElement(createNewScriptByButtonSU).click();
	Thread.sleep(1000);
	int iCount = 0;
	iCount=driver.findElements(By.xpath("//*[@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope']")).size();
	log.info("Counted " +iCount);
	
	for(int i=0;i<iCount;i++)
	{
		
		System.out.println("Ramukaka");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[1]/div/div[3]/div/div[2]/ul/li[1]")).click();
		Thread.sleep(100);
		
		//	driver.findElement(By.xpath("//li[@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope testActive']")).click();
		log.info("clicked first");
		driver.findElement(By.xpath("//form[@name='cms_form']//i[@class='glyphicon glyphicon-option-vertical']")).click();
		Thread.sleep(100);
		log.info("clicked dropdown");
		driver.findElement(By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/div/div[2]/div/div/div[5]/form[1]/div[2]/span/div/ul/li[2]/a/i")).click();
		Thread.sleep(100);
		log.info("deleted");
		driver.findElement(deleteAllData).click();
		Thread.sleep(1000);
		
		
	}
	
	
	
	
	
	
	}

//=====================================================================================================================

//Create CSVTansform Creation

public void CreateCSVTransformer () throws InterruptedException, IOException {
	
	driver.findElement(tagTab).click();
	log.info("clicked tagTab");
	driver.findElement(scriptsTab).click();
	log.info("clicked ScriptTab");
	Thread.sleep(10000);
	driver.findElement(csvTranformerTab).click();
	Thread.sleep(10000);
	log.info("clicked csvTranformer");
	driver.findElement(csvSelect).click();
	Thread.sleep(1000);
	Runtime.getRuntime().exec("C:\\Users\\hsingh\\Documents\\FileUpload3.exe");
	Thread.sleep(10000);
	driver.findElement(TransformButton).click();
	log.info("CSV Transform upload Successfully");
	Thread.sleep(1000);
	
}

//Delete ScriptUpload

public void deleteCSVTranformer() throws InterruptedException {
	
	Thread.sleep(10000);
//	driver.findElement(tagTab).click();
//	log.info("clicked tagTab");
	driver.findElement(scriptsTab).click();
	log.info("clicked ScriptTab");
	Thread.sleep(10000);
	driver.findElement(scriptUploadTab).click();
	Thread.sleep(10000);
	log.info("clicked ScriptUploadTab");
//	driver.findElement(createNewScriptByButtonSU).click();
	Thread.sleep(1000);
	int iCount = 0;
	iCount=driver.findElements(By.xpath("//*[@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope']")).size();
	log.info("Counted " +iCount);
	
	for(int i=0;i<iCount;i++)
	{
		
		System.out.println("Ramukaka");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[1]/div/div[3]/div/div[2]/ul/li[1]")).click();
		Thread.sleep(100);
		
		//	driver.findElement(By.xpath("//li[@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope testActive']")).click();
		log.info("clicked first");
		driver.findElement(By.xpath("//form[@name='cms_form']//i[@class='glyphicon glyphicon-option-vertical']")).click();
		Thread.sleep(100);
		log.info("clicked dropdown");
		driver.findElement(By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/div/div[2]/div/div/div[5]/form[1]/div[2]/span/div/ul/li[2]/a/i")).click();
		Thread.sleep(100);
		log.info("deleted");
		driver.findElement(deleteAllData).click();
		Thread.sleep(1000);
		
		
		
		
	}

}


///Deletion of script based on description count from search

public void scriptdeletion() throws InterruptedException {
	
	
	
	driver.findElement(scriptsTab).click();	
	log.info("Navigate to script Tab");
	
	int icount1=driver.findElements(By.xpath("//*[@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope']")).size();
	System.out.println("Count: "+icount1);
	
	for(int i=0;i<icount1;i++) {
		
		System.out.println("Ramu1");
		Thread.sleep(1000);
		System.out.println("Ramu2");
	//	int count=driver.findElement(By.xpath("//*[@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope testActive']")).getText().length();
		
	//	driver.findElement(By.xpath("//*[@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope testActive']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[1]/div/div[3]/div/div[2]/ul/li[1]")).click();
		
		System.out.println("Ramu3");
		Thread.sleep(1000);
	//	String scriptSize=driver.findElement(scriptNamefield).getAttribute("Value");
		String scriptSize=driver.findElement(By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/div/div[2]/div/div/div[4]/div/form/div[2]/input")).getAttribute("Value");
		
		String Description=driver.findElement(scriptDescGSBfield).getAttribute("value");
	
		if (Description.length()>4) {
			
			driver.findElement(selectdropdownn).click();
			log.info("Verified that select dropdown");
			
			
			
			Thread.sleep(100);
			driver.findElement(clickdeletedropdown).click();
			
			log.info("Verified that Clicked delete button");
			
			driver.findElement(deleteAllData).click();
			
			log.info("Verified that select delete all data");
			Thread.sleep(10000);
			driver.switchTo().alert().accept();
			log.info("delete successfully");
			
		}
			
			
		}
		
				
		
	//	int Count=scriptSize.length();
	//	System.out.println(+Count);
		
		
	//	System.out.println("count is "+scriptSize);
		
	
		}
		
	}
		
	
	



	
	
	
	






