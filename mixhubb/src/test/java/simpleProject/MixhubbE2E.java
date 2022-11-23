package simpleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MixhubbE2E {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.mixhubb.com/registration");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("socialloginmixhubb@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Testing1@3");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
