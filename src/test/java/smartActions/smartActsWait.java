package smartActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class smartActsWait {

	private static WebDriverWait wait;

	// custom wait
	public static void Wait(WebDriver driver) {
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
	public static void WaitPageLoadCompleted(WebDriver driver, int second) {
		wait = new WebDriverWait(driver, second);
		wait.until(new ExpectedCondition<Boolean>() {

			public Boolean apply(WebDriver driver) {
				// TODO Auto-generated method stub
				boolean flag = ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
				System.out.println(flag);
				return flag;
			}
		});
	}
	// check if string contained in page source
	public static void TextContainedInPageSource(WebDriver driver, String text, int second) {
		wait = new WebDriverWait(driver, second);
		wait.until(new ExpectedCondition<Boolean>() {

			public Boolean apply(WebDriver driver) {
				// TODO Auto-generated method stub
				boolean flag = driver.getPageSource().contains("I forgot");
				System.out.println("I forgot+++"+flag);
				return flag;
			}
		});
	}
	// check page title
	public static void waitPageTitle(WebDriver driver, String title) {
		new WebDriverWait(driver, 1).until(ExpectedConditions.titleIs(title));
	}

	// check title contains a string
	public static void waitPageTitleContains(WebDriver driver, String partialTitle) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.titleContains(partialTitle));
	}

	// check if element is contained in the dom, it may be not visible
	public static void waitPresenceOfElementLocated(WebDriver driver, By by) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(by));
		System.out.println("ExpectedConditions.presenceOfElementLocated(by)---"+ExpectedConditions.presenceOfElementLocated(by));
		System.out.println("我忘了密码:"+driver.getPageSource().contains("I forgot")); 
	}

	// check if element is visible or not
	public static void visibilityOf(WebDriver driver, WebElement element) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(element));
	}

	// check if element is visible and the size is not 0
	public static void visibilityOfElementLocated(WebDriver driver, By by) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	// return true once any element is present
	public static void presenceOfAllElementsLocatedBy(WebDriver driver, By by) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
	}

	// check if text contained in an element
	public static void textToBePresentInElementLocated(WebDriver driver, By by, String text) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.textToBePresentInElementLocated(by, text));
	}

	// check if a property's value is contained in an element
	public static void textToBePresentInElementValue(WebDriver driver, By by, String value) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.textToBePresentInElementValue(by, value));
	}

	// check if the frame is able to switch
	public static void frameToBeAvailableAndSwitchToIt(WebDriver driver, By by) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
	}
}
