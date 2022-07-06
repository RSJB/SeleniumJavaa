package seagsab;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
	  public static void main(String[] args) {
	     
	   WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.google.com");
	        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("selenium");
	       List<WebElement> mylist = driver.findElements(By.xpath("//div[@class='eIPGRd']//span"));
	        System.out.println(mylist.size());
	        for (int i = 0; i < mylist.size(); i++) {
String text = mylist.get(i).getText();
System.out.println(text);
//	            System.out.println(mylist.get(i).getText());
//	            if (mylist.get(i).getText().contains("Selenium testing")) {
//	                mylist.get(i).click();
//	                break;
//	            }


	        }
}}
