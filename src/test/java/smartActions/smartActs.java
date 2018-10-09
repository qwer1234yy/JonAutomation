package smartActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class smartActs {
	WebDriver driver;

	// check page title
	public void waitPageTitle(String title) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.titleIs(title));
	}

    //check title contains a string
	public void waitPageTitleContains(String partialTitle) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.titleIs(partialTitle));
	}

    //check if element is contained in the dom, it may be not visible
	public void waitPresenceOfElementLocated(By by) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(by));
	}
}
