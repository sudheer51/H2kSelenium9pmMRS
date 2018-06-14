package org.openmrs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	
	//By Default Global Reference Variables contains null 
	WebDriver driver;//null
	int i;//0
	public RegisterPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public  void enterNameDetails()
	{
		 
			//fill Name Details
		  driver.findElement(By.name("givenName")).sendKeys("gName");
		  driver.findElement(By.name("middleName")).sendKeys("mName");
		  driver.findElement(By.name("familyName")).sendKeys("fName");

	}
	public  void selectGender()
	{
	 	 
	 	   driver.findElement(By.id("genderLabel")).click();
	 	   new Select(driver.findElement(By.id("gender-field"))).selectByVisibleText("Male");

	}
	public  void fillDOB()
	{
			driver.findElement(By.id("birthdateLabel")).click();
		   driver.findElement(By.id("birthdateYears-field")).sendKeys("2");
		   driver.findElement(By.id("birthdateMonths-field")).sendKeys("2");
	}
	public  void fillAddress()
	{
		 driver.findElement(By.xpath(".//*[@id='formBreadcrumb']/li[2]/ul/li[1]/span")).click();
		 driver.findElement(By.id("address1")).sendKeys("Address1");
		 driver.findElement(By.id("address2")).sendKeys("Address2");
		 driver.findElement(By.id("cityVillage")).sendKeys("cityVillage");
		 driver.findElement(By.id("stateProvince")).sendKeys("stateProvince");
		 driver.findElement(By.id("country")).sendKeys("country");
		 driver.findElement(By.id("postalCode")).sendKeys("112355");
 	}
	public  void fillPhoneNo()
	{
 		 driver.findElement(By.xpath(".//*[@id='formBreadcrumb']/li[2]/ul/li[2]/span")).click();
		 driver.findElement(By.name("phoneNumber")).sendKeys("12451521"); 
		
	}
	public  void fillRelationShip()
	{
 		driver.findElement(By.xpath(".//*[@id='formBreadcrumb']/li[3]/ul/li/span")).click();
		new Select(driver.findElement(By.id("relationship_type"))).selectByVisibleText("Doctor");
		driver.findElement(By.xpath(".//*[@id='null']/div/div/p[2]/input[1]")).sendKeys("data");
	}
	public  void submitData()
	{
		driver.findElement(By.id("submit")).submit();
	}
	public void doRegistration()
	{
		enterNameDetails();
		selectGender();
		fillDOB();
		fillAddress();
		fillPhoneNo();
		fillRelationShip();
		submitData();
	}
}
