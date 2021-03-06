package smart;

import org.testng.annotations.Test;

import smartActions.smartActsWait;
import smartPageModals.Login;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Login_TestNG {
	
	WebDriver driver;
	
//	(dataProvider = "dp")
	@Test
	public void login() throws InterruptedException {
		
		System.out.println("WaitPageLoadStarted");
		smartActsWait.WaitPageLoadCompleted(driver,1);
		System.out.println("WaitPageLoadCompleted");
		
		Login login = PageFactory.initElements(driver, Login.class);
		login.login(driver);
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@DataProvider(name = "test")
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "MyResources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://strzw058051/SMARTSolutions/");
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
