package ObjectRepositoryUtilityForHK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelAppointmentInPatient {
	WebDriver driver;

	public CancelAppointmentInPatient(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = " //span[text()=' Appointment History ']")
	private WebElement appointmentlnk;
	@FindBy(linkText = "Cancel")
	private WebElement cancelbtn;
	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	private WebElement dropdown;
	@FindBy(xpath = "//a[contains(text(),'Log Out')]")
	private WebElement logout;

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAppointmentlnk() {
		return appointmentlnk;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}

	public void cancelappointment() {
		appointmentlnk.click();
		cancelbtn.click();

	}

	public void dropdown() {
		dropdown.click();
	}

	public void logout() {
		logout.click();
	}

}
