package smart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.TestCase;

public class Login_Junit extends TestCase {

	public void login() {
	 System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");		
   	 WebDriver driver = new FirefoxDriver();
   	 driver.get("http://strzw058051/SMARTSolutions/");
    }
}
