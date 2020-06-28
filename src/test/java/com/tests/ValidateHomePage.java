package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.BaseTest;
import com.pages.HomePage;
import com.utils.PropReader;
import com.utils.TestScreenshots;

public class ValidateHomePage extends BaseTest {
	
	@Test(priority=1)
	public void validateHomePage() {
		PropReader pr = new PropReader("src/test/resources/config.properties");
		String url = pr.getValue("url");
		
		driver.get(url);
		System.out.println("URL launched");
		
		HomePage hPage = new HomePage(driver);
		hPage.clickAcceptCookies();
		System.out.println("Cookies Accepted");
		
		
		hPage.getScrollBar(driver);
		System.out.println("Page Scrolled As Desired");
	}
	
	
	@Test(priority=2)
	public void validateText() {
		HomePage hPage = new HomePage(driver);
		
		Assert.assertEquals(hPage.verifyTextAuditAndAssurance(), "Audit and Assurance");
		System.out.println("Verified");
		
		Assert.assertEquals(hPage.verifyTextTaxAndLegal(), "Tax & Legal");
		System.out.println("Verified");
		
		Assert.assertEquals(hPage.verifyTextAdvisory(), "Advisory");
		System.out.println("Verified");
		
		Assert.assertEquals(hPage.verifyTextEnterprise(), "Enterprise");
		System.out.println("Verified");
		
		TestScreenshots testScreenshots = new TestScreenshots(driver);
		testScreenshots.getScreenshots("verifiedText");
	}
	

}
