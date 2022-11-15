package Selenium;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicHandling {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Computer World\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver Driver=new ChromeDriver();
	Driver.get("https://www.worldometers.info/coronavirus/country/india/");
	Driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1000));
	Driver.manage().window().maximize();
	String Covid= Driver.findElement(By.xpath("(//div[@class='maincounter-number'])[1]")).getText();
	System.out.println(Covid);
	String Death= Driver.findElement(By.xpath("(//div[@class='maincounter-number'])[2]")).getText();
	System.out.println(Death);
	String Recovered= Driver.findElement(By.xpath("(//div[@class='maincounter-number'])[3]")).getText();
	System.out.println(Recovered);
}
}
