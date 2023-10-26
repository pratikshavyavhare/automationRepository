package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginPage {
 public static void main(String[] args) throws InterruptedException {
	
	 // to launch the chrome browser
WebDriver	 driver=new ChromeDriver();

  // maximize the chrome browser
driver.manage().window().maximize();

  //to launch the web application
 driver.get("https://timetracker.ctepl.com/actitime/login.do");
 
  // stop execution of script for 2 sec
 Thread.sleep(2000);
 
 // identify username
 driver.findElement(By.name("username")).sendKeys("admin");
 
 // identify password
 driver.findElement(By.name("pwd")).sendKeys("manager");
 
 driver.findElement(By.id("loginButton")).click();
 
}
	
	
	
	
}
