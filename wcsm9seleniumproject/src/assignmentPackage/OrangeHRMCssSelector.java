package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMCssSelector {
public static void main(String[] args) throws InterruptedException {
WebDriver	driver=new ChromeDriver();

driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(2000);

  driver.findElement(By.name("username")).sendKeys("Admin");
   driver.findElement(By.name("password")).sendKeys("admin123");
   
   driver.findElement(By.cssSelector("button[class*='medium oxd-button']")).click();

  
  
  
}
	
	
	
	
}
