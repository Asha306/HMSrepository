package ObjectRepositoryUtilityForHK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelAppointmentPage {
	WebDriver driver;

	public CancelAppointmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//a[@href='book-appointment.php'])[2]")
	private WebElement appointmentlnk;
	@FindBy(name = "Doctorspecialization")
	private WebElement doctorspebtn;
	
	@FindBy(name = "doctor")
	private WebElement doctornamebtn;
	
	@FindBy(name = "fees")
	private WebElement doctorfeebtn;
	
	@FindBy(name = "appdate")
	private WebElement datebtn;
	
	@FindBy(id = "timepicker1")
	private WebElement timebtn;
	
	@FindBy(name = "submit")
	private WebElement submitbtn;

}
