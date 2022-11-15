package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Computer World\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.youtube.com/");
	/*public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Computer World\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/"); */
			
	}
}