package Selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Computer World\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://www.flipkart.com/");
		Thread.sleep(60000);
		Driver.findElement(By.xpath("//button[text()='✕']")).click();
		Driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobile Under 50000",Keys.ENTER);
		Thread.sleep(5000);
		
		Driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		Thread.sleep(5000);
		Set<String> Allwindows = Driver.getWindowHandles();
		ArrayList<String> AL=new ArrayList<String>(Allwindows);
		String Main =AL.get(0);
		System.out.println(Main);
		
		String Second = AL.get(1);
		System.out.println(Second);
	}

	
}
