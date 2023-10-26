package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPage {
    public static void main(String[] args) throws InterruptedException {
		
    	// to launch the chrome browser
    WebDriver	driver=new ChromeDriver();
    
    // maximize the chrome browser
    driver.manage().window().maximize();
    
    // to launch the web application
    driver.get("https://www.facebook.com/");
    
    // stop the execution of script for 2 sec
    Thread.sleep(2000);
    
    // identify username
    driver.findElement(By.id("email")).sendKeys("Pratiksha");
    
    // identify password
   driver.findElement(By.id("pass")).sendKeys("1234");
    
    driver.findElement(By.name("login")).click();
	}

	
	
	
	
	
	
	
	
	
}
