package com.mixhubb.testcase;

import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.mixhubb.base.BaseClass;
import com.mixhubb.pageobject.Registration;

public class TC_Registration extends BaseClass{
	@BeforeMethod
	public void setup() {
		
		launchMixhubb();
	}
	public void teardown() {
		driver.quit();
	}
	@org.testng.annotations.Test
	public void regis() {
		
		Registration registr= new Registration();
		
	}

}
