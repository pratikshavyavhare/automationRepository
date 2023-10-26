package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLoginPage {
public static void main(String[] args) throws InterruptedException {
	
	// to launch chrome browser
WebDriver	driver=new ChromeDriver();

    // maximize the chrome browser
   driver.manage().window().maximize();
   
   // launch the Netflix
   driver.get("https://www.netflix.com/in/login");
   
   // stop the execution of script for 2 sec
   Thread.sleep(2000);
   
   //identify username login 
   driver.findElement(By.id("id_userLoginId")).sendKeys("pratiksha");
   
   Thread.sleep(2000);
   
   // identify password 
   driver.findElement(By.id("id_password")).sendKeys("1234");
   
   Thread.sleep(2000);
   
   driver.findElement(By.className("btn login-button btn-submit btn-small")).click();
   
}
	
	
	
	
}
