package org.openmrs.tests;

import org.automation.util.TestBaseClass;
import org.openmrs.pages.HomePage;
import org.openmrs.pages.LoginPage;
import org.openmrs.pages.RegisterPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
/**
 * 
 * 
 * 
 * @author qa
 *
 */
public class RegisterTests extends TestBaseClass{

	@Parameters({"username","password"})
	@Test
	public void registerPatientTest()
	{
		openBrowser("https://demo.openmrs.org");
		LoginPage lPage = new LoginPage(driver);
		lPage.login("Admin","Admin123");
		HomePage hPage = new HomePage(driver);
		hPage.navigatetoRegisterPatient();
		RegisterPage rPage = new RegisterPage(driver);
		rPage.doRegistration();

	}

}
