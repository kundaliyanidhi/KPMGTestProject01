package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	By acceptCookies_button = By.xpath("//button[contains(text(),'Accept All Cookies')]");
	By services_text = By.xpath("//h2[contains(text(),'Services')]");
	By auditAndAssurance_text = By.xpath("//h3[contains(text(),'Audit and Assurance')]");
	By taxandLegal_text = By.xpath("//h3[contains(text(),'Tax & Legal')]");
	By advisory_text = By.xpath("//h3[contains(text(),'Advisory')]");
	By enterprise_text = By.xpath("//h3[contains(text(),'Enterprise')]");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickAcceptCookies() {
		driver.findElement(acceptCookies_button).click();
	}
	
	
	public void getScrollBar(WebDriver driver) {
		WebElement Element = driver.findElement(services_text);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",Element);
	}
	
	public String verifyTextAuditAndAssurance() {
		return driver.findElement(auditAndAssurance_text).getText();
	}
	
	public String verifyTextTaxAndLegal() {
		return driver.findElement(taxandLegal_text).getText();
	}
	
	public String verifyTextAdvisory() {
		return driver.findElement(advisory_text).getText();
	}
	
	public String verifyTextEnterprise() {
		return driver.findElement(enterprise_text).getText();
	}

}
