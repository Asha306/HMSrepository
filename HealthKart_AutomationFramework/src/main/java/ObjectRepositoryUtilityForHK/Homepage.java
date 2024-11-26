package ObjectRepositoryUtilityForHK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Home")
	private WebElement homebtn;
	@FindBy(linkText = "Services")
	private WebElement servicebtn;
	@FindBy(linkText = "About Us")
	private WebElement aboutusbtn;
	@FindBy(linkText = "Gallery")
	private WebElement gallarybtn;
	@FindBy(linkText = "Contact Us")
	private WebElement contactusbtn;
	@FindBy(xpath ="//div[@id='menu']/descendant::a[contains(text(),'Logins')]")
	private WebElement loginsbtn;
	@FindBy(linkText = "Book an Appointment")
	private WebElement bookappointmentbtn;

	@FindBy(xpath  = " (//button[@class='btn btn-success btn-sm'])[1]")
	private WebElement clickherebtn;
	@FindBy(xpath = "(//button[@class='btn btn-success btn-sm'])[2]")
	private WebElement Dclickherebtn;

	@FindBy(xpath = "(//button[@class='btn btn-success btn-sm'])[3]")
	private WebElement Aclickherebtn;

	public WebElement getAClickherebtn() {
		return Aclickherebtn;
	}
	public void Aclickhere() {
		Aclickherebtn.click();
		
	}
	public WebElement getClickherebtn() {
		return clickherebtn;
	}
	public void clickhere() {
		clickherebtn.click();
		
}

	public WebElement getDClickherebtn() {
		return Dclickherebtn;
	}
	public void Dclickhere() {
		Dclickherebtn.click();
		
	}

	public WebElement getBookappointmentbtn() {
		return bookappointmentbtn;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getHomepagebtn() {
		return homebtn;
	}

	public WebElement getAboutusbtn() {
		return aboutusbtn;
	}

	public WebElement getGallarybtn() {
		return gallarybtn;
	}

	public WebElement getContactusbtn() {
		return contactusbtn;
	}

	public WebElement getLoginsbtn() {
		return loginsbtn;
	}

	public void home() {
		homebtn.click();
	}

	public void aboutus() {
		aboutusbtn.click();
	}

	public void gallary() {
		gallarybtn.click();
	}

	public void contactus() {
		contactusbtn.click();
	}

	public void login() {
		loginsbtn.click();
	}

	public void bookAppointment() {
		bookappointmentbtn.click();

	}

}
