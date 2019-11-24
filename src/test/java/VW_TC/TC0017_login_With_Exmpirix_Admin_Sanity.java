package VW_TC;

import java.io.IOException;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
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


public class TC0017_login_With_Exmpirix_Admin_Sanity extends basePropertiesSeln{
	
	private static Logger log =LogManager.getLogger(TC0017_login_With_Exmpirix_Admin_Sanity.class.getName());
	
	@BeforeTest
	
public void applicationLaunch() throws IOException, InterruptedException {
		
		driver=intializeDriver();
	}
		
	
	@Test(priority=1)
	public void logInWithExpirixAdmin () throws IOException, InterruptedException {		
		dataDriven d=new dataDriven();
		 ArrayList<String> data=d.getData("login","vwqng2");
//		 ArrayList<String> data=d.getData("login","Empirix/Admin");
		
		
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
      
	
	
/*	@Test(priority=2)
	public void headerMandatoryDetails () throws IOException, InterruptedException {
		
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);	
	    d.header();
	
	}
	
	@Test(priority=3)
	public void footerMandatoryDetails () throws IOException, InterruptedException {
		
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);	
	    d.footer();	
	}

		
	@Test(priority=4)
	public void TabAvailabilityValidation () throws IOException, InterruptedException {
		
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);	
	    d.Tab_Validation();

	
	}

	
	@Test(priority=5)
	public void dashBoardTabValidation () throws IOException, InterruptedException {
		
		pom003_VoiceWatch_Dashboard_Tab db=new pom003_VoiceWatch_Dashboard_Tab(driver);
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);	
				
		db.OverallPerfomance_section_dashboard();
		db.activetest_section_dashboard();
		d.header();
		d.footer();	
	}
	
	@Test(priority=6)
	public void alertTabValidation () throws IOException, InterruptedException {
		
		pom004_VoiceWatch_Alerts_Tab at=new pom004_VoiceWatch_Alerts_Tab (driver);
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);	
		at.alertsValidations();		
		d.header();
		d.footer();
		
	}
	
	@Test(priority=7)
	public void testTabValidation () throws IOException, InterruptedException {
		
		pom005_VoiceWatch_Tests_Tab ts=new pom005_VoiceWatch_Tests_Tab(driver);
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);	
		ts.testsValidations();
		d.header();
		d.footer();
		ts.createTestbybutton();
		d.header();
		d.footer();
		ts.createTestbyLink();
		d.header();
		d.footer();
		
	}
	
	
	@Test(priority=8)
	public void tagTabValidation () throws IOException, InterruptedException {
		
		pom006_VoiceWatch_Tags_Tab tg=new pom006_VoiceWatch_Tags_Tab(driver);
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);	
	
	
		tg.tagsValidations();
		d.header();
		d.footer();
		tg.createTagbybutton();
		d.header();
		d.footer();
		tg.createNewTag();		
		d.header();
		d.footer();	
	}
	
	@Test(priority=9)
	public void scriptTabValidation () throws Exception {
		
		
		pom007_VoiceWatch_Script_Tabs sc=new pom007_VoiceWatch_Script_Tabs(driver);
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);	
	
		
		
	  sc.goScriptBuilderTabValidation();
	   sc.createGSBbybutton();
		sc.createGSBbyLink();
		d.header();
		d.footer();
		sc.scriptUploadTabValidation();
		d.header();
		d.footer();
		sc.createSUbybutton();
		sc.createSUbyLink();
		sc.csvTabValidation();
	}

	@Test(priority=10)
	public void variableTabValidation () throws Exception {
		
		
		pom008_VoiceWatch_Variable_Tab vr=new pom008_VoiceWatch_Variable_Tab(driver);
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);
		
		vr.variableTabValidation();
		d.header();
		d.footer();
		vr.createVariableByButton();
		d.header();
		d.footer();
		vr.createVariableByLink();
		d.header();
		d.footer();	

	}

	@Test(priority=11)
	public void hammerTabValidation () throws Exception {
		
		pom009_VoiceWatch_Hammers_Tab hm=new pom009_VoiceWatch_Hammers_Tab(driver);
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);
		
	    hm.hammerTabValidation();
		d.header();
		d.footer();	
	    hm.createHammerByButton();
	   hm.createHammerByLink();

	}
	*/
	@Test(priority=12)
	public void ValidateScriptFunctinality () throws Exception {
		
	//	pom010_VoiceWatch_Script_Creation SC=new pom010_VoiceWatch_Script_Creation(driver);
		pom007_VoiceWatch_Script_Tabs sc=new pom007_VoiceWatch_Script_Tabs(driver);
		pom006_VoiceWatch_Tags_Tab tg=new pom006_VoiceWatch_Tags_Tab(driver);
	
	        sc.CreateScript();
	      sc.DeleteScriptAllData();
	        sc.DeleteScriptOnly();
		        sc.CopyScript();
	       sc.UpdateScript();
		
	//	sc.CreateTest();
//	        
//		sc.DeleteTest();
//		sc.UpdateTest();
//		sc.CreateScriptByScriptUpload();
//		sc.deleteScriptUpload();
		
//		sc.CreateCSVTransformer();
		
//		sc.scriptdeletion();
//		tg.CreateTag();
		
	 
	}
	
	
  /*  @AfterTest
	public void applicationClose() {
	
		driver.close();
		log.debug("Application closed successfully");
	
    }*/
    }
