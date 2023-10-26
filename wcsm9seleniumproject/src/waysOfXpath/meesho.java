package waysOfXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class meesho {

	public static void main(String[] args) {
		
		// to launch the chrome browser
	WebDriver	driver=new ChromeDriver();
	
	   // maximize the chrome browser
	driver.manage().window().maximize();
	
	 //to launch the application
	driver.get("https://www.meesho.com/");
	
	driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']")).sendKeys("saree");
	
	
	driver.findElement(By.xpath("//p[text()='saree']/ancestor::span[@class='sc-hHTYSt iLzYsx']")).click();
	}
	
	
	
	
	
}
