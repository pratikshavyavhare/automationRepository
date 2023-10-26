package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
     public static void main(String[] args) throws InterruptedException {
		// to launch the chrome browser
   WebDriver 	  driver=new ChromeDriver();
       
       // maximize the chrome browser
     driver.manage().window().maximize();
     
     // to launch the web page
     driver.get("file:///C:/Users/er503tu/Desktop/wcms9work/Login.html");
     
     // stop the execution script for 2 sec
      Thread.sleep(2000);
      
      // identify username by using id 
      driver.findElement(By.id("i1")).sendKeys("admin");
    	 
      // identify password by using id 
      driver.findElement(By.id("i2")).sendKeys("manager");
    	 
    	 
	}
	
	
	
	
}
