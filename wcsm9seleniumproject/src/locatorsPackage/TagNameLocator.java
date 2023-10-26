package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
public static void main(String[] args) throws InterruptedException {
	
	// to launch the chrome browser
         WebDriver	driver=new ChromeDriver();
         
   // maximize the chrome browser
         driver.manage().window().maximize();
         
   // to launch the web page
         driver.get("file:///C:/Users/er503tu/Desktop/wcms9work/Login.html");
         
   // stop the execution script for 2 secound
          Thread.sleep(2000);
          
   // identify usernameTB and pass input AS"admin"
         driver.findElement(By.tagName("input")).sendKeys("admin");
         
   // identify passwordTB and pass AS "manager"
         driver.findElement(By.tagName("input")).sendKeys("manager");
 

}
	
	
	
}
