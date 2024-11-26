package DoctorModule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BaseclassForHK.BaseclassFor_HK;
import ObjectRepositoryUtilityForHK.AddDoctorTest;
import ObjectRepositoryUtilityForHK.AdminLoginpage;
import ObjectRepositoryUtilityForHK.BookAppointmentpage;
import ObjectRepositoryUtilityForHK.DoctorHomePage;
import ObjectRepositoryUtilityForHK.DoctorLoginpage;
import ObjectRepositoryUtilityForHK.Homepage;
import ObjectRepositoryUtilityForHK.PatientHomePageTest;
import ObjectRepositoryUtilityForHK.PatientLoginpage;

public class DoctorTest extends BaseclassFor_HK {

	@Test(groups="smoke",retryAnalyzer = ListnerImplimentationForHK.ListenerUtility.class)
	public void cancelAppointment() throws IOException {
		String Username = fu.getdatafromPropertfile("doctorusername");
		String Password = fu.getdatafromPropertfile("doctorpassword");
		String DoctorTitle = fu.getdatafromPropertfile("doctortitle");
		Homepage hp = new Homepage(driver);
		hp.login();
		hp.Dclickhere();
		wu.switchWindow(driver, DoctorTitle);

		DoctorLoginpage dp = new DoctorLoginpage(driver);
		dp.loginToApp(Username, Password);
		DoctorHomePage dhp = new DoctorHomePage(driver);
		dhp.cancelAppointment(driver);
		wu.switctoAlertAccept(driver);
		
	}

	@Test(groups="smoke",retryAnalyzer = ListnerImplimentationForHK.ListenerUtility.class)
	public void login() throws IOException {
		String Username = fu.getdatafromPropertfile("doctorusername");
		String Password = fu.getdatafromPropertfile("doctorpassword");
		String DoctorTitle = fu.getdatafromPropertfile("doctortitle");
		Homepage hp = new Homepage(driver);
		hp.login();
		hp.Dclickhere();
		wu.switchWindow(driver, DoctorTitle);
		DoctorLoginpage dp = new DoctorLoginpage(driver);
		dp.loginToApp(Username, Password);
	}

	@Test(groups="system",retryAnalyzer = ListnerImplimentationForHK.ListenerUtility.class)
	public void cancelAppointmentAndCheck() throws IOException, InterruptedException {
		String DUsername = fu.getdatafromPropertfile("doctorusername");
		String DPassword = fu.getdatafromPropertfile("doctorpassword");
		String PUsername = fu.getdatafromPropertfile("username");
		String PPassword = fu.getdatafromPropertfile("username");
		String DoctorTitle = fu.getdatafromPropertfile("doctortitle");
		String USERTITLE = fu.getdatafromPropertfile("usertitle");
		Homepage hp = new Homepage(driver);
		hp.login();
		hp.Dclickhere();
		wu.switchWindow(driver, DoctorTitle);
		DoctorLoginpage dp = new DoctorLoginpage(driver);
		dp.loginToApp(DUsername, DPassword);
		DoctorHomePage dhp = new DoctorHomePage(driver);
		dhp.cancelAppointment(driver);
		wu.switctoAlertAccept(driver);
		dhp.logout();
		hp.login();
		hp.clickhere();
		wu.switchWindow(driver, USERTITLE);
		PatientLoginpage plp = new PatientLoginpage(driver);
		plp.loginToApp(PUsername, PPassword);
		PatientHomePageTest php = new PatientHomePageTest(driver);
		php.appointment(driver);
	}

	@Test(groups="system",retryAnalyzer = ListnerImplimentationForHK.ListenerUtility.class)
	public void createDoctorAndBookAppointment() throws IOException, InterruptedException {
		String AUsername = fu.getdatafromPropertfile("adminusername");
		String APassword = fu.getdatafromPropertfile("adminpassword");
		String UUsername = fu.getdatafromPropertfile("userusername");
		String UPassword = fu.getdatafromPropertfile("userpassword");
		// String Specialization = fu.getdatafromPropertfile(UPassword)
		String Specialization = fu.getdatafromPropertfile("doctorspe");
		String DoctorName = fu.getdatafromPropertfile("doctorname");
		String Address = fu.getdatafromPropertfile("adressD");
		String Fee = fu.getdatafromPropertfile("fee");
		String Contact = fu.getdatafromPropertfile("Dphn");
		String Mail = fu.getdatafromPropertfile("Demail");
		String Password = fu.getdatafromPropertfile("password");

		String AdminTitle = fu.getdatafromPropertfile("admintitle");
		Homepage hp = new Homepage(driver);
		hp.login();
		hp.Aclickhere();
		wu.switchWindow(driver, AdminTitle);
		AdminLoginpage ap = new AdminLoginpage(driver);
		ap.loginToApp(AUsername, APassword);
		AddDoctorTest ad = new AddDoctorTest(driver);
		ad.adddoctor();
		ad.addDoctor(Specialization, DoctorName, Address, Fee, Contact, Mail, Password);
		wu.switctoAlertAccept(driver);

		System.out.println("Doctor Mail is added....");
		ap.logout();
		hp.login();
		hp.clickhere();
		
		PatientLoginpage pp = new PatientLoginpage(driver);
		pp.loginToApp(UUsername, UPassword);
		BookAppointmentpage bp=new BookAppointmentpage(driver);
		bp.bookAppontment(Specialization, DoctorName);
		
	}

	@Test(groups="smoke",retryAnalyzer = ListnerImplimentationForHK.ListenerUtility.class)
	public void createDoctor() throws IOException {
		String AUsername = fu.getdatafromPropertfile("adminusername");
		String APassword = fu.getdatafromPropertfile("adminpassword");
		String UUsername = fu.getdatafromPropertfile("userusername");
		String UPassword = fu.getdatafromPropertfile("userpassword");
		// String Specialization = fu.getdatafromPropertfile(UPassword)
		String Specialization = fu.getdatafromPropertfile("doctorspe");
		String DoctorName = fu.getdatafromPropertfile("doctorname");
		String Address = fu.getdatafromPropertfile("adressD");
		String Fee = fu.getdatafromPropertfile("fee");
		String Contact = fu.getdatafromPropertfile("Dphn");
		String Mail = fu.getdatafromPropertfile("Demail");
		String Password = fu.getdatafromPropertfile("password");

		String AdminTitle = fu.getdatafromPropertfile("admintitle");
		Homepage hp = new Homepage(driver);
		hp.login();
		hp.Aclickhere();
		wu.switchWindow(driver, AdminTitle);
		AdminLoginpage ap = new AdminLoginpage(driver);
		ap.loginToApp(AUsername, APassword);
		AddDoctorTest ad = new AddDoctorTest(driver);
		ad.adddoctor();
		ad.addDoctor(Specialization, DoctorName, Address, Fee, Contact, Mail, Password);
		wu.switctoAlertAccept(driver);
		
		System.out.println("Doctor Mail is added....");
		ap.logout();
		
	}

}