package ObjectRepositoryUtilityForHK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenaricWebDriverUtility.WebDriverUtilty;

public class AddPatientpage {
	WebDriver driver;
	WebDriverUtilty wu=new WebDriverUtilty();

	public AddPatientpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//span[text()=' Patients ']")
	private WebElement patientlnk;
	
	@FindBy(xpath = "//span[text()=' Add Patient']")
	private WebElement addpatientbtn;
	
	@FindBy(name = "patname")
	private WebElement patname;
	
	@FindBy(name = "patcontact")
	private WebElement patcontact;
	
	@FindBy(name = "patemail")
	private WebElement patemail;
	
	@FindBy(xpath = "//label[contains(text(),'Male')]")
	private WebElement Malebtn;
	@FindBy(xpath = "//label[contains(text(),'Female')]")
	private WebElement Femalebtn;
	
	public WebElement getMalebtn() {
		return Malebtn;
	}

	public WebElement getFemalebtn() {
		return Femalebtn;
	}


	@FindBy(name = "pataddress")
	private WebElement patadress;
	
	@FindBy(name = "patage")
	private WebElement patage;
	
	@FindBy(name = "medhis")
	private WebElement medhisbtn;
	
	@FindBy(id = "submit")
	private WebElement submitbtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getPatientlnk() {
		return patientlnk;
	}

	public WebElement getAddpatientbtn() {
		return addpatientbtn;
	}

	public WebElement getPatname() {
		return patname;
	}

	public WebElement getPatcontact() {
		return patcontact;
	}

	public WebElement getPatemail() {
		return patemail;
	}

	

	public WebElement getPatadress() {
		return patadress;
	}

	public WebElement getPatage() {
		return patage;
	}

	public WebElement getMedhisbtn() {
		return medhisbtn;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	public void addPatient(String ptnname,String phn,String email,String adress,String age,String medhis ) {
		patientlnk.click();
		addpatientbtn.click();
		patname.sendKeys(ptnname);
		patcontact.sendKeys(phn);
		patemail.sendKeys(email);
//		//genderbtn.click();
//		Femalebtn.click();
//		Malebtn.click();
//		patadress.sendKeys(adress);
//	    patage.sendKeys(age);
//	    medhisbtn.sendKeys(medhis);
//	    submitbtn.click();
		wu.executeScript(driver, Femalebtn);
		//wu.executeScript(driver, Malebtn);
		wu.sendData(driver, patadress, adress);
		wu.sendData(driver, patage, age);
		wu.sendData(driver, medhisbtn, medhis);
		wu.executeScript(driver, submitbtn);
}
}
