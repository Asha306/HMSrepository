package BaseclassForHK;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;

import DatabaseUtility_HK.DtabaseUtility;
import GenaricFileUtilityForHK.FileUtility;
import GenaricWebDriverUtility.JavaUtility;
import GenaricWebDriverUtility.UtilitiClassObject;
import GenaricWebDriverUtility.WebDriverUtilty;
import ObjectRepositoryUtilityForHK.Homepage;


public class BaseclassFor_HK {
	public WebDriver driver = null;
	public FileUtility fu = new FileUtility();
	public DtabaseUtility du=new DtabaseUtility();
	public WebDriverUtilty wu=new WebDriverUtilty();
	public JavaUtility ju=new JavaUtility();
	public static WebDriver sdriver = null;
	
	@BeforeSuite
	public void configBs() {
		System.out.println("====connect database====,====reportcofiguration");
	
		
	}
	
	//@Parameters("BROWSER")
	@BeforeClass
	public void configBc() throws IOException {
		String BROWSER=fu.getdatafromPropertfile("browser");
		
		
		System.out.println("====launch the browser=====");
		

		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}else {
			driver=new ChromeDriver();
		}
		sdriver=driver;
		UtilitiClassObject.setDriver(driver);
	}

	@BeforeMethod
	public void configBm() throws IOException {
		wu.maximize(driver);
		wu.implicitWait(driver);
		//String url;
		//String URL = System.getProperty("url");
		String URL = fu.getdatafromPropertfile("url");
		System.out.println("========"+URL+"============");
		driver.get(URL);
		
		System.out.println("=====login====");
		//String USERNAME = fu.getdatafromPropertfile("username");
		//String PASSWORD = fu.getdatafromPropertfile("password");
		//String USERNAME=System.getProperty("username");
		//String PASSWORD=System.getProperty("password");
		
		
		
		//LoginPage lp = new LoginPage(driver);
		//lp.getUsernameEdt().sendKeys(USERNAME);
		//lp.getPasswordEdt().sendKeys(PASSWORD);
		//lp.getLoginbtn().click();

	}

	@AfterMethod
	public void configAm() {
		//Homepage hp=new Homepage(driver);
		//hp.signOut(driver);
		System.out.println("====logout======");
	}

	@AfterClass
	public void configAc() {
		System.out.println("====close the browser====");
		driver.quit();
	}

	@AfterSuite
	public void configAs() {
		System.out.println("===close the database====,===reports backup=====");
		//report.flush();
		//du.closeConnectin();
		

	}

}


