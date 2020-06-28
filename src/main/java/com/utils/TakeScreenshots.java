package com.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.framework.BaseTest;

public class TakeScreenshots extends BaseTest {
	
	public TakeScreenshots(WebDriver driver) {
		this .driver=driver;
	}
	
	public void getScreenshots(String getMethodName) {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\Users\\nidkunda\\eclipse-workspace\\KPMGTestProject\\Screenshots\\"
			+ getMethodName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
