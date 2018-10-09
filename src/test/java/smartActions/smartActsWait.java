package smartActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class smartActsWait {

	private static WebDriver driver;

	private static WebDriverWait wait;

	// custom wait
	public static void Wait() {
		wait = new WebDriverWait(driver, 5);
		wait.until(new ExpectedCondition<Boolean>() {

			public Boolean apply(WebDriver input) {
				// TODO Auto-generated method stub
				return !input.findElement(By.xpath("//*[@id='kw']")).getAttribute("class")
						.contains("x-form-invalid-field");
			}
		});
	}

	// WaitPageLoadCompleted
	public static void WaitPageLoadCompleted(WebDriver driver) {
		wait = new WebDriverWait(driver, 1);
		wait.until(new ExpectedCondition<Boolean>() {

			public Boolean apply(WebDriver input) {
				// TODO Auto-generated method stub
				return ((JavascriptExecutor) input).executeScript("return document.readyState").equals("complete");
			}
		});
	}

	// check page title
	public static void waitPageTitle(String title) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.titleIs(title));
	}

	// check title contains a string
	public static void waitPageTitleContains(String partialTitle) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.titleIs(partialTitle));
	}

	// check if element is contained in the dom, it may be not visible
	public static void waitPresenceOfElementLocated(By by) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(by));
	}

	// check if element is visible or not
	public static void visibilityOf(WebElement element) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(element));
	}

	// check if element is visible and the size is not 0
	public static void visibilityOfElementLocated(By by) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	// return true once any element is present
	public static void presenceOfAllElementsLocatedBy(By by) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
	}

	// check if text contained in an element
	public static void textToBePresentInElementLocated(By by, String text) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.textToBePresentInElementLocated(by, text));
	}

	// check if a property's value is contained in an element
	public static void textToBePresentInElementValue(By by, String value) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.textToBePresentInElementValue(by, value));
	}

	// check if the frame is able to switch
	public static void frameToBeAvailableAndSwitchToIt(By by) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
	}
}
