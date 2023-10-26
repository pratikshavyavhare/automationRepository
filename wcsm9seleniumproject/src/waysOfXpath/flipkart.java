package waysOfXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	
	public static void main(String[] args) throws InterruptedException {
		
		// to launch the web browser
	WebDriver	driver=new ChromeDriver();
	
	// to maximize the web browser
	driver.manage().window().maximize();
	
	// to launch the web application
	driver.get("https://www.flipkart.com/");
	
	// stop the execution of script for 2 sec
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	
	driver.findElement(By.name("q")).sendKeys("mobiles");
	
	driver.findElement(By.xpath("//button[contains(@aria-label,'Search for Products, Brands and More')]")).click();
	
	driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[2]")).click();
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
