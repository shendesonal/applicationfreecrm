package crm.tastcases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomPackage.CalendarPage;
import PomPackage.CampaignsPage;
import PomPackage.CasesPage;
import PomPackage.DocsPage;
import PomPackage.EmailPage;
import PomPackage.HomePageCRM;
import PomPackage.LoginPageCRM;
import TestBasePack.TestBase;
import UtilityPackage.UtilityClass;

public class HomePageTest extends TestBase {
	LoginPageCRM loginPageCRM;
	HomePageCRM homePageCRM;
	UtilityClass utilityClass;
	 CalendarPage  calendarPage;
	 CallPage CallPage;
	 CampaignsPage campaignsPage;
	 CasesPage casesPage;
	 ContactPage contactPage;
	 PrintPage PrintPage;
	 FormsPage  formsPage;
	 EmailPage  emailPage ;
	 DealsPage  dealsPage;
	 DocsPage docsPage;
	 ReportsPage reportsPage;
	 TasksPage TasksPage;
	 TextSMSPage textSMSPage;
	public HomePageTest() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void setup() throws IOException {
		initilization();
		utilityClass=new UtilityClass();
		loginPageCRM=new LoginPageCRM();
        
        
        homePageCRM  =loginPageCRM.login(prop.getProperty("username"),prop.getProperty("password"));
        }
	
 @Test
 public void clickoncalender() throws IOException {
	 utilityClass.frame("mainpanel");
	 calendarPage =homePageCRM.clickonclander();
	 
 }
 
	}
