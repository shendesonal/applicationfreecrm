package TestBasePack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException {
	
		 
		     prop=new Properties();     
		     String path="C:\\Users\\sonal\\eclipse-workspace\\FreeCrmAplication\\src\\main\\java\\ConfigPackage\\Config.properties";
		     FileInputStream fis =new FileInputStream(path);
		     prop.load(fis);
			}
	
	public static void initilization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sonal\\eclipse-workspace\\freecrmframework\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
	}
}


