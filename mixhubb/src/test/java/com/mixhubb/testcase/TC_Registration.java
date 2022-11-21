package com.mixhubb.testcase;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.mixhubb.base.BaseClass;
import com.mixhubb.pageobject.Registration;
import org.testng.annotations.Test;

public class TC_Registration extends BaseClass{
	@BeforeMethod
	public void setup() {
		
		launchMixhubb();
	}
	public void teardown() {
		driver.quit();
	}
	@Test
	public void regis() throws Throwable {
		
		Registration registr= new Registration();
		registr.registartion(null, null);
		
	}

}
