package smartPageModals;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import smartActions.smartActsWait;

public class Login {
	
	@FindBy(id = "txtLoginid")
	WebElement username;
	@FindBy(id = "txtPassword")
	WebElement password;
	@FindBy(id = "btnloginText")
	WebElement loginBtn;
	
	public void login(WebDriver driver) {
		
		
		smartActsWait.waitPageTitleContains(driver, "SMART");
		username.clear();
		username.click();
		username.sendKeys("admin");
		password.clear();
		password.click();
		password.sendKeys("Admin");
		loginBtn.click();
		
		
		
		System.out.println("afterLogin-WaitPageLoadStarted");
		smartActsWait.WaitPageLoadCompleted(driver,1);
		System.out.println("afterLogin-WaitPageLoadCompleted");
	}

}
