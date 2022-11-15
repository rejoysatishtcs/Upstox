package Selenium;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workbook {
	public static void main(String[] args) throws Throwable
	{
		FileInputStream Fis=new FileInputStream("C:\\Users\\Computer World\\OneDrive\\Documents\\Selenium.xlsx");
		Sheet sh=WorkbookFactory.create(Fis).getSheet("Sheet1");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Computer World\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Driver.manage().deleteAllCookies();
		Driver.manage().window().maximize();.
		Driver.get("https://demo.actitime.com/login.do");
		String UN =sh.getRow(0).getCell(1).getStringCellValue();
		Driver.findElement(By.xpath("//input[@id='username]")).sendKeys("UN");
	
	}

}
