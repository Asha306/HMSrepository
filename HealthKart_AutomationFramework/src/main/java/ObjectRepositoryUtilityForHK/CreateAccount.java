package ObjectRepositoryUtilityForHK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {
	WebDriver driver;

	public CreateAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='registration.php']")
	private WebElement createaccountbtn;
	@FindBy(name = "full_name")
	private WebElement fullnamebtn;
	@FindBy(name = "address")
	private WebElement adressbtn;
	@FindBy(name = "city")
	private WebElement citybtn;
	@FindBy(xpath = "//label[@for='rg-female']")
	private WebElement gendrebtn;
	@FindBy(name = "email")
	private WebElement emailbtn;
	@FindBy(name = "password")
	private WebElement passwordbtn;
	@FindBy(id = "password_again")
	private WebElement passwordagainbtn;
	@FindBy(id = "submit")
	private WebElement submitbtn;

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCreateaccountbtn() {
		return createaccountbtn;
	}

	public WebElement getFullnamebtn() {
		return fullnamebtn;
	}

	public WebElement getAdressbtn() {
		return adressbtn;
	}

	public WebElement getCitybtn() {
		return citybtn;
	}

	public WebElement getEmailbtn() {
		return emailbtn;
	}

	public WebElement getGendrebtn() {
		return gendrebtn;
	}

	public WebElement getPasswordagainbtn() {
		return passwordagainbtn;
	}

	public void createaccount(String name, String address, String city, String email, String password,
			String passwordagain) {
		createaccountbtn.click();
		fullnamebtn.sendKeys(name);
		adressbtn.sendKeys(address);
		citybtn.sendKeys(city);
		emailbtn.sendKeys(email);
		passwordbtn.sendKeys(password);
		gendrebtn.click();
		passwordagainbtn.sendKeys(passwordagain);

	}

}
