package PomPackage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBasePack.TestBase;

public class HomePageCRM extends TestBase {
	
	@FindBy (xpath = "//a[contains(text(),'Home')]")
private WebElement Home ;

@FindBy (xpath = "//a[contains(text(),'Calendar')]")
public WebElement Calendar ;

@FindBy (xpath = "//a[contains(text(),'Companies')]")
private WebElement Companies ;

@FindBy (xpath = "//a[contains(text(),'Contacts')]")
private WebElement Contacts ;

@FindBy (xpath = "//a[contains(text(),'Deals')]")
private WebElement Deals ;

@FindBy (xpath = "//a[contains(text(),'Tasks')]")
private WebElement Tasks ;

@FindBy (xpath = "//a[contains(text(),'Cases')]")
private WebElement  Cases ;

@FindBy (xpath = "//a[contains(text(),'Call')]")
private WebElement Call ;

@FindBy (xpath = "//a[contains(text(),'Email')]")
private WebElement Email ;

@FindBy (xpath = "//a[contains(text(),'Text/SMS')]")
private WebElement TextSMS ;

@FindBy (xpath = "//a[contains(text(),'Print')]")
private WebElement Print ;

@FindBy (xpath = "//a[contains(text(),'Campaigns')]")
private WebElement Campaigns ;

@FindBy (xpath = "//a[contains(text(),'Docs')]")
private WebElement Docs ;

@FindBy (xpath = "//a[contains(text(),'Forms')]")
private WebElement Forms ;

@FindBy (xpath = "//a[contains(text(),'Reports')]")
private WebElement Reports ;

public HomePageCRM() throws IOException {
    PageFactory.initElements(driver, this);
}
    
    public void homepagelinkclick(WebElement element) {
    	element.click();
    	
    }
    public CalendarPage clickonclander() throws IOException {
    	Calendar .click();
    	return new CalendarPage();
    }
    	
    	
    	
    }
    

     

