package AdvanceScenarios;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSscripts {

	public static void main(String[] args) throws Throwable
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	for(int i=0;i<3;i++)
	{
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
	}
	for(int i=0;i<3;i++)
	{
		js.executeScript("window.scrollBy(0,-800)");
		Thread.sleep(1000);
	}
	}	

}
