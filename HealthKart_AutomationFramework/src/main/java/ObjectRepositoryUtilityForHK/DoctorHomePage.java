package ObjectRepositoryUtilityForHK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenaricWebDriverUtility.WebDriverUtilty;

public class DoctorHomePage {
	WebDriverUtilty wu=new WebDriverUtilty();
	public DoctorHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//span[text()=' Dashboard ']")
	private WebElement Dashboard;
	@FindBy(xpath = "//span[contains(text(),'Patients')]")
	private WebElement Patients;
	@FindBy(xpath = "//span[contains(text(),'Add')]")
	private WebElement AddPatient;
	@FindBy(xpath = "//span[contains(text(),'Manage')]")
	private WebElement ManagePatient;
	@FindBy(xpath = "//span[contains(text(),'Search')]")
	private WebElement SearchPatient;
	@FindBy(xpath = "//span[@class='username']")
	private WebElement DoctorDropdown;
	@FindAll({@FindBy(partialLinkText = "Profile"),@FindBy(xpath = "//a[contains(text(),'Profile')]")})
	private WebElement MyProfile;
	@FindAll({@FindBy(partialLinkText = "Change"),@FindBy(xpath = "//a[contains(text(),'Change')]")})
	private WebElement ChangePassword;
	@FindAll({@FindBy(partialLinkText = "Log"),@FindBy(xpath = "//a[contains(text(),'Log')]")})
	private WebElement LogOut;
	@FindAll({@FindBy(partialLinkText = "Update"),@FindBy(xpath = "//a[contains(text(),'Update')]")})
	private WebElement UpdateProfile;
	@FindAll({@FindBy(linkText = "Update"),@FindBy(xpath = "//a[text()='Cancel']")})
	private WebElement CancelAppointment;
	@FindAll({@FindBy(xpath = "//span[contains(text(),'Appointment')]"),@FindBy(partialLinkText = "Appointment"),@FindBy(xpath = "//a[contains(text(),'Appointment')]")})
	private WebElement AppointmentHistory;
	@FindBy(name = "patname")
	private WebElement PatientName;
	@FindBy(name = "patcontact")
	private WebElement PatientContact;
	@FindAll({@FindBy(id = "patemail"),@FindBy(name = "patemail")})
	private WebElement Patientmail;
	@FindBy(xpath = "//button[contains(text(),'Add')]")
	private WebElement Submit;
	@FindBy(xpath = "//label[contains(text(),'Male')]")
	private WebElement Malebtn;
	@FindBy(xpath = "//label[contains(text(),'Female')]")
	private WebElement Femalebtn;
	@FindBy(name = "pataddress")
	private WebElement PatientAddress;
	@FindBy(name = "patage")
	private WebElement PatientAge;
	@FindBy(name = "medhis")
	private WebElement MedicalHistory;
	
	
	
	
	public WebElement getDashboard() {
		return Dashboard;
	}
	public WebElement getPatients() {
		return Patients;
	}
	public WebElement getPatientName() {
		return PatientName;
	}
	public WebElement getPatientContact() {
		return PatientContact;
	}
	public WebElement getPatientmail() {
		return Patientmail;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	public WebElement getMalebtn() {
		return Malebtn;
	}
	public WebElement getPatientAddress() {
		return PatientAddress;
	}
	public WebElement getPatientAge() {
		return PatientAge;
	}
	public WebElement getMedicalHistory() {
		return MedicalHistory;
	}
	public void setPatients(WebElement patients) {
		Patients = patients;
	}
	public WebElement getAddPatient() {
		return AddPatient;
	}
	public WebElement getManagePatient() {
		return ManagePatient;
	}
	public WebElement getSearchPatient() {
		return SearchPatient;
	}
	public WebElement getDoctorDropdown() {
		return DoctorDropdown;
	}
	public WebElement getMyProfile() {
		return MyProfile;
	}
	public WebElement getChangePassword() {
		return ChangePassword;
	}
	public WebElement getLogOut() {
		return LogOut;
	}
	public WebElement getUpdateProfile() {
		return UpdateProfile;
	}
	public WebElement getAppointmentHistory() {
		return AppointmentHistory;
	}
	public WebElement getCancelAppointment() {
		return CancelAppointment;
	}
	
	
	public void cancelAppointment(WebDriver driver) {
		AppointmentHistory.click();
		wu.executeScript(driver, CancelAppointment);
		
	
	}
	public void logout() {
		DoctorDropdown.click();
		LogOut.click();
	}
	public void appointmenthistory() {
		AppointmentHistory.click();
		}
	public void addPatient(String patname,String phn,String email,String adress,String age,String medhis) {
		PatientName.sendKeys(patname);
		PatientContact.sendKeys(phn);
		Patientmail.sendKeys(email);
		Malebtn.click();
		PatientAddress.sendKeys(adress);
		PatientAge.sendKeys(age);
		MedicalHistory.sendKeys(medhis);
		Submit.click();
		//Malebtn.click();
	}
	public void addpatient() {
		Patients.click();
		AddPatient.click();
		//ManagePatient.click();
		
	}
	
	
	
}