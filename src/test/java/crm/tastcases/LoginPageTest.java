package crm.tastcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomPackage.HomePageCRM;
import PomPackage.LoginPageCRM;
import TestBasePack.TestBase;

public class LoginPageTest extends TestBase{
	LoginPageCRM loginPageCRM;
	HomePageCRM homePageCRM;
	public LoginPageTest() throws IOException {
		super();}
		
		@BeforeMethod
		public void setup() throws IOException {
			initilization();
			loginPageCRM=new LoginPageCRM ();
		}
		@Test(priority=1)
		public void ValidateTilte() {
			String title = LoginPageCRM.verifyTitle();
			Assert.assertEquals(title, "Free CRM software for customer relationship management, sales, and support.");
		}
		@Test(priority=2)
		public void verifyCRMlogo() {
			
			boolean logo = loginPageCRM.verifycrmlogo();
			Assert.assertTrue(logo);
			
		}
		@Test(priority=3)
		public void verifylinks() {
			loginPageCRM.verifylinks(loginPageCRM.getHomeLink());
		}
		@Test(priority=4)
		public void Customerslink() {
			loginPageCRM.verifylinks(loginPageCRM.getCustomerslink());
		}
		@Test(priority=5)
		public void Pricinglink() {
			loginPageCRM.verifylinks(loginPageCRM.getPricinglink());
		}
		@Test(priority=6)
		public void SignupLink() {
			loginPageCRM.verifylinks(loginPageCRM.getSignupLink());
		}
		@Test(priority=7)
		public void ContactLink() {
			loginPageCRM.verifylinks(loginPageCRM.getContactLink());
		}
		@Test(priority=8)
		public void FeaturesLink() {
			loginPageCRM.verifylinks(loginPageCRM.getFeaturesLink());
		}
		@Test(priority=9)
		public void loginToApplication() throws IOException {
			homePageCRM=loginPageCRM.login(prop.getProperty("username"), prop.getProperty("password"));
		}
		
		@AfterMethod
		public void tearDown() {
			driver.close();
		}
		
		
}
	

