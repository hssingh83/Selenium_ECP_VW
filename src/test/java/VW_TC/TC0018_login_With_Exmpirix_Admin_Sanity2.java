package VW_TC;

import java.io.IOException;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageActions.pom001_VoiceWatch_logIn_Page;
import PageActions.pom002_VoiceWatch_Home_Page;
import PageActions.pom003_VoiceWatch_Dashboard_Tab;
import PageActions.pom004_VoiceWatch_Alerts_Tab;
import PageActions.pom005_VoiceWatch_Tests_Tab;
import PageActions.pom006_VoiceWatch_Tags_Tab;
import PageActions.pom007_VoiceWatch_Script_Tabs;
import PageActions.pom008_VoiceWatch_Variable_Tab;
import PageActions.pom009_VoiceWatch_Hammers_Tab;
import resources.basePropertiesSeln;
import resources.dataDriven;


public class TC0018_login_With_Exmpirix_Admin_Sanity2 extends basePropertiesSeln{
	
	private static Logger log =LogManager.getLogger(TC0018_login_With_Exmpirix_Admin_Sanity2.class.getName());
	
	@BeforeMethod
	
public void applicationLaunch() throws IOException, InterruptedException {
		
		driver=intializeDriver();
		dataDriven d=new dataDriven();
//		 ArrayList<String> data=d.getData("login","vwqng2");
		 ArrayList<String> data=d.getData("login","Empirix/Admin");
		
		
		pom001_VoiceWatch_logIn_Page l=new pom001_VoiceWatch_logIn_Page(driver);
					
		l.getUsername().sendKeys(data.get(1));
       l.getPassword().sendKeys(data.get(2));
	    l.getSignButton().click();
	    Thread.sleep(10);
	    log.debug("Waiting for launch VoiceWatch application using above creadetails");
	    Assert.assertTrue(driver.findElement(By.linkText("Back to top")).isDisplayed());
	    log.debug("Verified that VoiceWatch Application login successfully with Empirix Admin creadetial");
	    log.debug("Validate the requiment as Aceess Level= Empirix & Role=Empirix Admin");
	}
		
/*	
// Script Creation functinality Validation	
	
	@Test(priority=1)
	public void createScript () throws IOException, InterruptedException {
		
		pom007_VoiceWatch_Script_Tabs san=new pom007_VoiceWatch_Script_Tabs(driver);
	
	    san.CreateScript();
	
	}*/
	/*
	@Test(priority=2)
	public void deleteScript_AllData () throws IOException, InterruptedException {
		
		pom007_VoiceWatch_Script_Tabs san=new pom007_VoiceWatch_Script_Tabs(driver);
	
	    san.DeleteScriptAllData();
	
	}*/
/*	
	@Test(priority=3)
	public void deleteScript_only () throws IOException, InterruptedException {
		
		pom007_VoiceWatch_Script_Tabs san=new pom007_VoiceWatch_Script_Tabs(driver);
	
	    san.DeleteScriptOnly();
	
	}*/
	/*
	@Test(priority=4)
	public void copyScript () throws IOException, InterruptedException {
		
		pom007_VoiceWatch_Script_Tabs san=new pom007_VoiceWatch_Script_Tabs(driver);
	
	    san.CopyScript();
	    
	    }*/
	
	@Test(priority=5)
	public void updateScript () throws IOException, InterruptedException {
		
		pom007_VoiceWatch_Script_Tabs san=new pom007_VoiceWatch_Script_Tabs(driver);
	
	    san.UpdateScript();
	
	}
	
	/*
	@Test(priority=6)
	public void createScript_by_ScriptUpload () throws IOException, InterruptedException {
		
		pom007_VoiceWatch_Script_Tabs san=new pom007_VoiceWatch_Script_Tabs(driver);
	
	    san.CreateScriptByScriptUpload();
	
	}*/
	
	/*@Test(priority=7)
	public void deleteScript_by_ScriptUpload () throws IOException, InterruptedException {
		
		pom007_VoiceWatch_Script_Tabs san=new pom007_VoiceWatch_Script_Tabs(driver);
	
	    san.deleteScriptUpload();
	
	}*/
	
	/*@Test(priority=8)
	public void createScript_by_CSV () throws IOException, InterruptedException {
		
		pom007_VoiceWatch_Script_Tabs san=new pom007_VoiceWatch_Script_Tabs(driver);
	
	    san.CreateCSVTransformer();
	
	}*/
	
	/*@Test(priority=9)
	public void createTest () throws IOException, InterruptedException {
		
		pom007_VoiceWatch_Script_Tabs san=new pom007_VoiceWatch_Script_Tabs(driver);
	
	    san.CreateTest();
	
	}*/
	
	/*@Test(priority=10)
	public void deleteTest () throws IOException, InterruptedException {
		
		pom007_VoiceWatch_Script_Tabs san=new pom007_VoiceWatch_Script_Tabs(driver);
	
	    san.DeleteTest();
	
	}*/
	
/*	@Test(priority=11)
	public void updateTest () throws IOException, InterruptedException {
		
		pom007_VoiceWatch_Script_Tabs san=new pom007_VoiceWatch_Script_Tabs(driver);
	
	    san.UpdateTest();
	
	}*/
	
		
	/*@AfterMethod
	public void applicationClose() {
	
		driver.close();
		log.debug("Application closed successfully");
	
    }*/
    }
