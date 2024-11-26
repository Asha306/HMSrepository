package ObjectRepositoryUtilityForHK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAppointmentpage {
	WebDriver driver;

	public BookAppointmentpage(WebDriver driver) {
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

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAppointmentlnk() {
		return appointmentlnk;
	}

	public WebElement getDoctorspebtn() {
		return doctorspebtn;
	}

	public WebElement getDoctornamebtn() {
		return doctornamebtn;
	}

	public WebElement getDoctorfeebtn() {
		return doctorfeebtn;
	}

	public WebElement getDatebtn() {
		return datebtn;
	}
	public void bookAppontment(String spe,String doc){
		  doctorspebtn.sendKeys(spe);
		doctornamebtn.sendKeys(doc);
		
		submitbtn.click();
		
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	
	
	
}

