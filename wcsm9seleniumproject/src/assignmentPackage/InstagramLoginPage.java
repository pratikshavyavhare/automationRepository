package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {
   public static void main(String[] args) throws InterruptedException {
	
	   // to launch the chrome browser
	WebDriver   driver=new ChromeDriver();
	
	// maximize the chrome browser
	driver.manage().window().maximize();
	
	// to launch the web application
	driver.get("https://www.instagram.com/");
	
	// stop the execution of script for 2 sec
	Thread.sleep(2000);
	
	// identify username
	driver.findElement(By.name("username")).sendKeys("Pratiksha");
	
	// identify password
	driver.findElement(By.name("password")).sendKeys("1234");
	
	driver.findElement(By.className("class=\"x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1\"")).click();
}
	
	
	
	
	
}
