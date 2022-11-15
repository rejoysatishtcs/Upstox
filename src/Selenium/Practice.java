package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class Practice {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Computer World\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.flipkart.com/");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		Driver.manage().window().maximize();
		Driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("rejoy1379@yahoo.com",Keys.TAB);
		Thread.sleep(3000);
	
		Driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Rejoy_135790",Keys.ENTER);
		Thread.sleep(3000);
	
		Driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobiles under 20000",Keys.ENTER);
		Thread.sleep(3000);
		
		Driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		
	} 

}
