package yahoo.com;

import org.testng.annotations.Test;

import smartActions.smartActsWait;
import yahooPO.LogIn;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Login {
	WebDriver driver;
//	(dataProvider = "dp")
  @Test
  public void login() {
     LogIn aLogin = PageFactory.initElements(driver, LogIn.class);
     aLogin.sendEmail("robby_yang@yahoo.com");
     aLogin.toNext(driver);
     aLogin.sendPassword("yahooRB123");
//     aLogin.submit();
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
//	  webdriver.ie.driver
	  System.setProperty("webdriver.chrome.driver", "MyResources/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://login.yahoo.com/");
//	  smartActsWait.WaitPageLoadCompleted(driver, 1);
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
