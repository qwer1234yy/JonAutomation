package AutoCommon;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivers {
	
	String driverName;

	public static InternetExplorerDriver getIEDriver() {
		System.setProperty("webdriver.chrome.driver", "MyResources/IEDriverServer.exe");
		return new InternetExplorerDriver();
	}

	public static ChromeDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "MyResources/chromedriver.exe");
		return new ChromeDriver();
	}

	public static FirefoxDriver getFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver", "MyResources/geckodriver.exe");
		return new FirefoxDriver();
	}
}
