package AdminModuleForHK;


import java.io.IOException;

import org.testng.annotations.Test;



import BaseclassForHK.BaseclassFor_HK;
import ObjectRepositoryUtilityForHK.Homepage;

public class AdminLoginpageTest extends BaseclassFor_HK {
	
	@Test(groups="smoke",retryAnalyzer = ListnerImplimentationForHK.ListenerUtility.class)
	public void loginAdmin() throws IOException {
		String AdminUser = fu.getdatafromPropertfile("adminusername");
		String AdminPsd = fu.getdatafromPropertfile("adminpassword");
		String Admintitle =fu.getdatafromPropertfile("admintitle");
		Homepage hp=new Homepage(driver);
		hp.login();
		hp.Aclickhere();
		//wu.clicktoElement(driver, home.getAdminLogin());
		//wu.switchToBrowserByTitle(driver, Admintitle);
		//AdminLoginPageTest admin=new AdminLoginPageTest(driver);
	//	admin.login(AdminUser,AdminPsd);
		System.out.println("Admin is Login to Account Successfully");
	}


		
		
		
		
	}
	
	


