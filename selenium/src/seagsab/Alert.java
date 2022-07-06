package seagsab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
public static void main(String[] args) throws InterruptedException {
	
//	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver d =new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://letcode.in/alert");
	
	d.findElement(By.id("modern")).click();
	Thread.sleep(2000);
	
	d.findElement(By.xpath("//*[@class=\"modal-close is-large\"]")).click();
}
}
