package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Computer World\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.udemy.com/?ranMID=39197&ranEAID=OzpaRYwFVr0&ranSiteID=OzpaRYwFVr0-WJCKsREJuyxhu5CdzxY90w&LSNPUBID=OzpaRYwFVr0&utm_source=aff-campaign&utm_medium=udemyads");
		Driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		Driver.findElement(By.xpath("//a[@class='udlite-btn udlite-btn-medium udlite-btn-secondary udlite-heading-sm']")).click();;;;;;;
		
		
		//.sendKeys("REJOYSATISH",Keys.TAB);
		//Thread.sleep(2000);
		
	//Driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rejoy_135790",Keys.ENTER);
	
	}

}
