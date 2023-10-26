package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
  public static void main(String[] args) throws InterruptedException {
	// to launch the chrome browser
WebDriver	  driver=new ChromeDriver();

     // maximize the Chrome Browser
   driver.manage().window().maximize();
   
   // to launch the web application
   driver.get("file:///C:/Users/er503tu/Desktop/wcms9work/Radio1.html");
   
   // stop the execution of script for 2 sec
   Thread.sleep(2000);
   
   //identify the D radio button
   driver.findElement(By.name("name4")).click();
   
   driver.close();
}
	
	
	
	
	
}
