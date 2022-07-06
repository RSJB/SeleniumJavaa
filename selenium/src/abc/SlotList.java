package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SlotList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://betnowck.com/accessCheck");
		d.findElement(By.className("form-control")).sendKeys("5021");
d.findElement(By.xpath("//button[@type='submit']")).submit();

	
	
	
	
	
	}

}
