package waysOfXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart1 {

	public static void main(String[] args) throws InterruptedException {
		
		//to launch the chrome browser
WebDriver driver=new ChromeDriver();

        // maximize the browser
driver.manage().window().maximize();

      // to launch the application
driver.get("https://www.flipkart.com/");

     //stop the execution of script for 2 sec
Thread.sleep(2000);

     driver.findElement(By.xpath("//span[text()='✕']")).click();

     driver.findElement(By.name("q")).sendKeys("electric scooter");
     
     driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
     
     driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[6]")).click();
     
   //  driver.findElement(By.className("_2hVSre _25_uYi")).click();
     
  //   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
