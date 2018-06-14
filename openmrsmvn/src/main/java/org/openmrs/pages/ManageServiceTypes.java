package org.openmrs.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManageServiceTypes {
	WebDriver driver;
	public ManageServiceTypes(WebDriver driver)
	{
		this.driver=driver;
	}
	
	 
 	public  boolean verifyServiceType(String sName) throws InterruptedException
		{
			boolean result=false ; 
			List<WebElement> pageList = driver.findElements(By.xpath(".//*[@id='appointmentTypesTable_paginate']/span/a"));
			List<WebElement> tdList = driver.findElements(By.xpath(".//*[@id='appointmentTypesTable']/tbody/tr/td[1]"));
	 
			//Example for Nested for loop
			outerloop:
			for(int i = 1 ; i<=pageList.size();i++)
			{
				for(int j=0;j<tdList.size();j++)
				{
					System.out.println(tdList.get(j).getText());
					if(tdList.get(j).getText().contains(sName))
					{
						System.out.println("Service Type Found!!!");
						result = true;
						break outerloop;
					}
				}
				 
				pageList =driver.findElements(By.xpath(".//*[@id='appointmentTypesTable_paginate']/span/a")); 
				System.out.println("Click on the page"+ pageList.get(i).getText());
				pageList.get(i).click();
				tdList = driver.findElements(By.xpath(".//*[@id='appointmentTypesTable']/tbody/tr/td[1]"));
			}
			return result;
 
 
}
}

