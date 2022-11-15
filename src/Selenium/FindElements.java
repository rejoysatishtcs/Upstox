package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Computer World\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.flipkart.com/");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		Driver.findElement(By.xpath("//button[text()='✕']")).click();
		Driver.manage().window().maximize();
	}
}
