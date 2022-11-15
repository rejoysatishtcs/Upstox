package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {
public static void main(String[] args) throws Throwable {
/*System.setProperty("driver.chrome.driver", "C:\\Users\\Computer World\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver Driver=new ChromeDriver();*/
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Computer World\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver Driver=new ChromeDriver();
Driver.get("https://www.youtube.com/");
Dimension R=new Dimension(200, 300);
Driver.manage().window().setSize(R);
Thread.sleep(4000);
Point D=new Point(300, 400);
 Driver.manage().window().setPosition(D);

}
}
