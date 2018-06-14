package org.openmrs.tests;

import org.automation.util.TestBaseClass;
import org.openmrs.pages.HomePage;
import org.openmrs.pages.LoginPage;
import org.openmrs.pages.ManageServiceTypes;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ServiceTests extends TestBaseClass {

	@Parameters({"username","password"})
	@Test
	public void verifyServiceTypes() throws InterruptedException
	{
		openBrowser("https://demo.openmrs.org");
		LoginPage lPage = new LoginPage(driver);
		lPage.login("Admin","Admin123");
		HomePage hPage = new HomePage(driver);
		hPage.navigatetoServiceTypes();
		ManageServiceTypes sType = new ManageServiceTypes(driver);
		boolean result = sType.verifyServiceType("Urology");
		Assert.assertTrue(result);
	}

}
