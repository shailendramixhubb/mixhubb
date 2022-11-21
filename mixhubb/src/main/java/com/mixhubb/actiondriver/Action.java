package com.mixhubb.actiondriver;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
	
	public static boolean selectBySendkeys(WebElement ele, String value) throws Exception{
	boolean flag=false;
	try {
		ele.sendKeys(value);
		flag=true;
		return true;
	}
	catch(Exception e) {
		return false;
	}
	finally {
		if(flag)
			{
			System.out.println("Select value from the drop down");
			}
		else {
			System.out.println("Not Select value from the drop down");
		}
	}
	
		
	}
	public static boolean selectByIndex(WebElement ele,int Index)
	{
		boolean flag=false;
		try {
			Select s= new Select(ele);
			s.selectByIndex(Index);
			flag =true;
			return true;
		}
		catch(Exception e){
			return false;
			
		}
		finally {
			if(flag) {
				System.out.println("option select by Index");
			}
			else {
				System.out.println("Option not select by index");
			}
		}
	}
	public static boolean selectByValue(WebElement ele,String value)
	{
		boolean flag=false;
		try {
			Select s= new Select(ele);
			s.selectByValue(value);
			flag =true;
			return true;
		}
		catch(Exception e){
			return false;
			
		}
		finally {
			if(flag) {
				System.out.println("option select by Value");
			}
			else {
				System.out.println("Option not select by Value");
			}
		}
	}
	public static boolean selectByVisibletext(WebElement ele,String visibletext)
	{
		boolean flag=false;
		try {
			Select s= new Select(ele);
			s.deselectByVisibleText(visibletext);
			flag =true;
			return true;
		}
		catch(Exception e){
			return false;
			
		}
		finally {
			if(flag) {
				System.out.println("option select by visibletext");
			}
			else {
				System.out.println("Option not select by visibletext");
			}
		}
	}
	public static boolean JSclick(WebDriver driver, WebElement ele) {
		boolean flag=false;
		try {
			JavascriptExecutor je = (JavascriptExecutor)driver;
			je.executeScript("arguments[0].click();", ele);
			flag=true;
		}
		catch(Exception e) {
			throw e;
			
		}
		finally {
			if(flag) {
				System.out.println("Click Action is performed");
			}
			else if(!flag){
				System.out.println("Click Action is Not performed");
			}
		}
		return flag;
	}

}
