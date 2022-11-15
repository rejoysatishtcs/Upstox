package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Computer World\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver Driver=new ChromeDriver();
	Driver.get("https://www.instagram.com/accounts/login/");
	Driver.manage().window().maximize();
	Thread.sleep(4000);
	
	Driver.get("https://www.facebook.com/login/");
	Thread.sleep(4000);
	Driver.get("https://www.google.com/maps");
	Thread.sleep(4000);
     Driver.navigate().back();
     Thread.sleep(4000);
     Driver.navigate().back();
     Thread.sleep(4000);
     Driver.navigate().forward();
     Driver.navigate().forward();
     Driver.navigate().refresh();
     Thread.sleep(4000);
     Driver.manage().window().minimize();
     Thread.sleep(5000);
     Driver.close();
	
	
}
}
