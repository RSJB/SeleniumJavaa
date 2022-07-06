package seagsab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class checkpad {

	
	
	@Test
	void lkjhg(){	
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
			d.get("https://trains.abhibus.com/");
			 WebElement element = d.findElement(By.xpath("//span[text()='NDLS  - New Delhi']"));
			WebElement element2 = d.findElement(By.className("search-input"));
			Select s= new Select(element2);
			Actions a =new Actions(d);
			a.click(element).build().toString();

		}
	
	
	}


