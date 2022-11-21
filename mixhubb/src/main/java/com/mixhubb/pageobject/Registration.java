package com.mixhubb.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mixhubb.actiondriver.Action;
import com.mixhubb.base.BaseClass;

public class Registration extends BaseClass {

	@FindBy(xpath = "//input[@name='email']")
	WebElement emailTxt;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitBtn;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordtxt;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginBtn;
	
	// constructor
	
	public Registration(){
		PageFactory.initElements(driver, this);
		
	}
	public Dashboard registartion(String email,String password) throws Throwable
	{
		Action.type(email, emailTxt );
		Action.click(driver, submitBtn);
		Action.type(password, passwordtxt);
		Action.click(driver, loginBtn);
		return new Dashboard();
	}
	
	
	
}
