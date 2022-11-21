package com.mixhubb.actiondriver;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mixhubb.base.BaseClass;

public class Action extends BaseClass {
	
	public static void scrollByVisibilityofElement(WebDriver driver, WebElement ele) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollintoView", ele);
	}
	public static void click(WebDriver ldriver,WebElement locators)throws Exception{
		
		Actions act=new Actions(ldriver);
		act.moveToElement(locators).click().build().perform();
	}
	public static boolean findElement(WebDriver ldriver,WebElement ele) throws Exception{
		
		boolean flag=false;
		
		try {
			ele.isDisplayed();
			flag=true;
		}
		catch(Exception e) {
			flag=false;
		}
		finally {
			if(flag) {
				System.out.println("Successfully found element at");
			}
			else {
				System.out.println("Unable to locate element");
			}
		}
		return flag;
	}
	public static boolean isDisplayed(WebDriver ldriver, WebElement ele) throws Exception
	{
		boolean flag=false;
		flag=findElement(ldriver, ele);
		if(flag) {
			flag=ele.isDisplayed();
			if(flag) {
				System.out.println("The element is Displayed");
			}else {
				System.out.println("Not Displayed");
			}
		}
		return flag;
	}
	public static boolean isSelected(WebDriver ldriver,WebElement ele) throws Exception
	{
		boolean flag=false;
		flag=findElement(ldriver, ele);
		if(flag) {
			
			flag=ele.isSelected();
			if(flag) {
				System.out.println("The element is selected");
			}else {
				System.out.println("The element is not selected");
			}
			
			
		}
		else {
			System.out.println("Not selected");
		}
		return flag;
	}
	public static boolean isEnabled(WebDriver ldriver,WebElement ele) throws Exception
	{
		boolean flag=false;
		flag=findElement(ldriver, ele);
		if(flag) {
			
			flag=ele.isSelected();
			if(flag) {
				System.out.println("The element is Enabled");
			}else {
				System.out.println("The element is not Enabled");
			}
			
			
		}
		else {
			System.out.println("Not Enabled");
		}
		return flag;
	}
	
	public static boolean type(String text,WebElement ele) throws Exception
	{
		boolean flag=false;
		try {
			flag=ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			flag=true;
		}
		catch(Exception e) {
			System.out.println("Location not found");
			flag=false;
		}
		finally {
			if(flag) {
				System.out.println("Succesfull entered value");
			}
			else {
				System.out.println("Unable to entered value");
			}
		}
		return flag;
	}
	

}
