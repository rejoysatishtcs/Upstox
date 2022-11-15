package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practise {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Computer World\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions C=new ChromeOptions();
		C.addArguments("--disable-notifications");
		C.addArguments("start-maximized");
		
	
		WebDriver Driver=new ChromeDriver(C);
		Driver.get("https://www.facebook.com/login/");
		Thread.sleep(4000);
		
		Driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rejoy1379@yahoo.com");
		Thread.sleep(4000);
		
		Driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("",Keys.ENTER);
		Thread.sleep(5000);
		
		
		Driver.findElement(By.xpath("//span[@class='gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o']")).click();
		
		/*Thread.sleep(5000);
		Driver.findElement(By.xpath(null)).click();*/
		
	}

}
