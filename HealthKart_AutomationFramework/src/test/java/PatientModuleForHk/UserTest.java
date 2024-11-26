package PatientModuleForHk;



	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.testng.annotations.Test;

import BaseclassForHK.BaseclassFor_HK;
import ObjectRepositoryUtilityForHK.BookAppointmentpage;
import ObjectRepositoryUtilityForHK.CancelAppointmentInPatient;
import ObjectRepositoryUtilityForHK.CreateAccount;
import ObjectRepositoryUtilityForHK.DoctorHomePage;
import ObjectRepositoryUtilityForHK.DoctorLoginpage;
import ObjectRepositoryUtilityForHK.Homepage;
import ObjectRepositoryUtilityForHK.PatientLoginpage;

	
	public class UserTest extends BaseclassFor_HK {

		@Test(groups="smoke",retryAnalyzer = ListnerImplimentationForHK.ListenerUtility.class)
		public void createUser() throws InterruptedException, EncryptedDocumentException, IOException {

			String Fullname = fu.getdatafromPropertfile("Fullname");
			String ADRESS = fu.getdatafromPropertfile("Adress");
			String CITY = fu.getdatafromPropertfile("city");

			//String GENDER = fu.getdatafromPropertfile("Gender");
			String EMAIL = fu.getdatafromPropertfile("Email");
			String password = fu.getdatafromPropertfile("password");
			String passwordagain = fu.getdatafromPropertfile("passwordagain");
			System.out.println(Fullname);
			System.out.println(ADRESS);
			System.out.println(CITY);
			System.out.println(EMAIL);
			System.out.println(password);
			System.out.println(passwordagain);
			
			
			
			Homepage hp = new Homepage(driver);
			hp.login();
			hp.clickhere();
			String actualtext = fu.getdatafromPropertfile("usertitle");
			wu.switchWindow(driver, actualtext);

			CreateAccount ca = new CreateAccount(driver);
			
			//Thread.sleep(2000);
			
			ca.createaccount(Fullname, ADRESS, CITY, ju.getRandomNum()+EMAIL, password, passwordagain);
			wu.executeScript(driver, ca.getSubmitbtn());
			wu.switctoAlertAccept(driver);
			System.out.println("User is Created...");
			
			
		}
		
		@Test(groups="smoke",retryAnalyzer = ListnerImplimentationForHK.ListenerUtility.class)
		public void bookAppointment() throws IOException, InterruptedException {
			
			String PUsername = fu.getdatafromPropertfile("username");
			String PPassword = fu.getdatafromPropertfile("password");
			String USERTITLE = fu.getdatafromPropertfile("usertitle");
			Homepage hp = new Homepage(driver);
			hp.login();
			hp.clickhere();
			wu.switchWindow(driver, USERTITLE);
			//wu.clicktoElement(driver, home.getPatientLogin());
			PatientLoginpage pp = new PatientLoginpage(driver);
			pp.loginToApp(PUsername, PPassword);
			BookAppointmentpage ba=new BookAppointmentpage(driver);
			ba.bookAppontment("General Surgery", "Dilip VasoolRaja M.B.B.S");
			Thread.sleep(3000);
			wu.switctoAlertAccept(driver);
			System.out.println("Appintment is Booked.....");
			//p_home.logout();
		}
		@Test(groups="integration",retryAnalyzer = ListnerImplimentationForHK.ListenerUtility.class)
		public void bookAppointmentAndCancelByPatient() throws IOException, InterruptedException {
			String PUsername = fu.getdatafromPropertfile("username");
			String PPassword = fu.getdatafromPropertfile("password");
			String USERTITLE = fu.getdatafromPropertfile("usertitle");
			Homepage hp = new Homepage(driver);
			hp.login();
			hp.clickhere();
			wu.switchWindow(driver, USERTITLE);
			//wu.clicktoElement(driver, home.getPatientLogin());
			PatientLoginpage pp = new PatientLoginpage(driver);
			pp.loginToApp(PUsername, PPassword);
			BookAppointmentpage ba=new BookAppointmentpage(driver);
			ba.bookAppontment("General Surgery", "Dilip VasoolRaja M.B.B.S");
			Thread.sleep(3000);
			wu.switctoAlertAccept(driver);
			System.out.println("Appintment is Booked.....");
			//p_home.logout();
			
			CancelAppointmentInPatient cap=new CancelAppointmentInPatient(driver);
			cap.cancelappointment();
			Thread.sleep(5000);
			wu.switctoAlertAccept(driver);
			cap.dropdown();
			cap.logout();
			
			System.out.println("Appointment is canceled by User......");
			
			
			
		}
		@Test(groups="integration",retryAnalyzer = ListnerImplimentationForHK.ListenerUtility.class)
		public void bookAppointmentAndCancelByDoctor() throws IOException, InterruptedException {
			String PUsername = fu.getdatafromPropertfile("username");
			String PPassword = fu.getdatafromPropertfile("password");
			String USERTITLE = fu.getdatafromPropertfile("usertitle");
			String DOCTORTITLE = fu.getdatafromPropertfile("doctortitle");
			String DUsername = fu.getdatafromPropertfile("doctorusername");
			String DPassword = fu.getdatafromPropertfile("doctorpassword");
			Homepage hp = new Homepage(driver);
			hp.login();
			hp.clickhere();
			wu.switchWindow(driver, USERTITLE);
			//wu.screeshotForWebElement(driver, null, PUsername);
			//wu.clicktoElement(driver, home.getPatientLogin());
			PatientLoginpage pp = new PatientLoginpage(driver);
			pp.loginToApp(PUsername, PPassword);
			BookAppointmentpage ba=new BookAppointmentpage(driver);
			ba.bookAppontment("General Surgery", "Dilip VasoolRaja M.B.B.S");
			Thread.sleep(3000);
			wu.switctoAlertAccept(driver);
			
			System.out.println("Appointment is booked....");
			CancelAppointmentInPatient cap=new CancelAppointmentInPatient(driver);
			cap.dropdown();
			cap.logout();
			
			System.out.println("Sucessfully Logged out from patient.....");
			hp.login();
			hp.Dclickhere();
			wu.switchWindow(driver,DOCTORTITLE );
			
			
			DoctorLoginpage dp = new DoctorLoginpage(driver);
			dp.loginToApp(DUsername, DPassword);
			DoctorHomePage dhp = new DoctorHomePage(driver);
			dhp.cancelAppointment(driver);
			Thread.sleep(3000);
			wu.switctoAlertAccept(driver);
			
			
			
			System.out.println("Appointment is cancelled by Doctor......");
			dhp.logout();
			
			
		}

	}

