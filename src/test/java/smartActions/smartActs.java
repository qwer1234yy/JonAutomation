package smartActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class smartActs {

	private WebDriver driver;

    WebDriverWait wait = new WebDriverWait(driver, 5);


	// check page title
	public void waitPageTitle(String title) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.titleIs(title));
	}

	// check title contains a string
	public void waitPageTitleContains(String partialTitle) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.titleIs(partialTitle));
	}

	// check if element is contained in the dom, it may be not visible
	public void waitPresenceOfElementLocated(By by) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(by));
	}

	// check if element is visible or not
	public void visibilityOf(WebElement element) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(element));
	}

	// check if element is visible and the size is not 0
	public void visibilityOfElementLocated(By by) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	// return true once any element is present
	public void presenceOfAllElementsLocatedBy(By by) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
	}

	// check if text contained in an element
	public void textToBePresentInElementLocated(By by, String text) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.textToBePresentInElementLocated(by, text));
	}

	// check if a property's value is contained in an element
	public void textToBePresentInElementValue(By by, String value) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.textToBePresentInElementValue(by, value));
	}

	// 判断表单是否可以切过去，可以true 不可以反悔false
	public void frameToBeAvailableAndSwitchToIt(By by) {
				new WebDriverWait(driver, 5).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
	}
}
