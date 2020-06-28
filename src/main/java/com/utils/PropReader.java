package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropReader {
	
	Properties pr;
	
	public PropReader(String filepath) {
		pr = new Properties();
		try {
			pr.load(new FileInputStream(new File(filepath)));
		}catch(Exception e) {}
	}
	
	public String getValue(String Key) {
		return(pr.getProperty(Key));
	}

}
