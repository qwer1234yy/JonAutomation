package yahooPO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import smartActions.smartActsWait;

public class LogIn {
	
	@FindBy(id = "login-username")
	WebElement email;
	
	@FindBy(id = "login-signin")
	WebElement nextBtn;
	
	@FindBy(id = "login-passwd")
	WebElement password;	
	
	@FindBy(id = "login-signin")
	WebElement submitBtn;
	
	public void sendEmail(String address){
		email.sendKeys(address);
		email.clear();
		email.sendKeys(address);
	}
	public void toNext(WebDriver driver){
		nextBtn.click();
		System.out.println("nextBtn.click();");
	    smartActsWait.TextContainedInPageSource(driver,"I forgot",20);
	    System.out.println("visibilityOf(mbr-forgot-link);");
	}
	public void sendPassword(String pword){
		password.clear();
		password.sendKeys(pword);
	}
	public void submit(){
		submitBtn.click();
	}
}
