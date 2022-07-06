package seagsab;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class redbuss 
{

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
			d.get("https://www.redbus.in/");
			d.findElement(By.className("db")).sendKeys("ne");
			Thread.sleep(2000);
	 d.findElement(By.xpath("//ul[@class='autoFill homeSearch']//li")).click();
	
		
//		page.navigate("");
//		page.fill("(", "ne");
//	page.click("//input[@class='db'])[1]");
//		Locator locator = page.locator("ul.autoFill li");
//		locator.allTextContents().forEach(e->System.out.println(e));
	}
}
