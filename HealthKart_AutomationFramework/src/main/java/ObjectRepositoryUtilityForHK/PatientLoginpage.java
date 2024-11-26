package ObjectRepositoryUtilityForHK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientLoginpage {
	WebDriver driver;

	public PatientLoginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	private WebElement usernamebtn;
	@FindBy(name = "password")
	private WebElement passwordbtn;
	@FindBy(name = "submit")
	private WebElement loginbtn;

	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getUsernamebtn() {
		return usernamebtn;
	}
	public WebElement getPasswordbtn() {
		return passwordbtn;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public void loginToApp(String name,String pwd) throws InterruptedException {
		usernamebtn.sendKeys(name);
		passwordbtn.sendKeys(pwd);
		Thread.sleep(2000);
		loginbtn.click();
	}
}
