package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
static WebDriver driver;
	
	public static void browserlaunch(String url)
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		
		
	}
	
	public static void enterText(WebElement element,String txt)
	{
		element.sendKeys(txt);
	}
	
	public static void login(WebElement element)
	{
		element.click();
	}
	

}
