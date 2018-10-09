package smartPageModals;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	@FindBy(id = "txtLoginid")
	WebElement username;
	@FindBy(id = "txtPassword")
	WebElement password;
	@FindBy(id = "btnloginText")
	WebElement loginBtn;

	WebDriver driver;

	String url = "http://strzw058051/SMARTSolutions/";

	public void login() {
		username.clear();
		username.click();
		username.sendKeys("admin");
		password.clear();
		password.click();
		password.sendKeys("Admin");
		loginBtn.click();

//		显示等待
		WebDriverWait wait = new WebDriverWait(driver, 10, 1);
		wait.until(new ExpectedCondition<WebElement>() {
			public WebElement apply(WebDriver text) {
				return text.findElement(By.className("dropdown-toggle"));
			}
		});
	}

}
