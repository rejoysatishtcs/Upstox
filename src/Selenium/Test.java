package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Computer World\\Downloads\\chromedriver_win32\\chromedriver.exe"); //(Key and Values)
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.close();
	
	}

}
