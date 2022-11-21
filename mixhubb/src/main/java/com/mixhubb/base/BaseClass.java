package com.mixhubb.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static Properties prop;
	public static WebDriver driver;
	
	@Before
	public void loadconfig()
	{
		
		try {
			
			prop=new Properties();
			System.out.println("Super constructor invoked");
			FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"\\configuration\\config.properties");
			prop.load(ip);
			System.out.println("driver: "+driver);
			
			
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
			catch(IOException e) {
				e.printStackTrace();
			}
			
		
	}
	public static void launchMixhubb()
	{
		WebDriverManager.chromedriver().setup();
		String browsername=prop.getProperty("browser");
		if(browsername.contains("chrome")) {
			driver= new ChromeDriver();
		}
		else if(browsername.contains("firefox")) {
			driver= new FirefoxDriver();
		}
		if(browsername.contains("IE")) {
			driver= new InternetExplorerDriver();
		}
	}

}
