package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Computer World\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(3000);
		driver.navigate().to("https://www.myntra.com/shop/prebuzz?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=EAIaIQobChMIzaKL9oKR-gIVAUwrCh1A4QwqEAAYASAAEgLdFfD_BwE");
Thread.sleep(3000);
driver.navigate().to("https://www.nykaa.com/?utm_content=ads&utm_source=GooglePaid&utm_medium=PLA&utm_campaign=performancemaxnykaacosmetics&gclid=EAIaIQobChMI4bSt3oSR-gIV35hmAh3oDQ2MEAAYASAAEgL9APD_BwE");

	driver.navigate().back();
	driver.navigate().back();
	Thread.sleep(5000);
	driver.navigate().forward();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.close();
	
	
	}
}
