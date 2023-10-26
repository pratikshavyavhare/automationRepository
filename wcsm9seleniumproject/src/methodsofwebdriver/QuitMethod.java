package methodsofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
public static void main(String[] args) throws InterruptedException {
	//to launch the  Chrome browser
WebDriver	driver=new ChromeDriver();
    // maximize the chrome browser
driver.manage().window().maximize();
    //to launch the Web application
driver.get("http://omayo.blogspot.com/");
    //stop the execution script for 2 sec
 Thread.sleep(2000);
 //click on open a pop up window link
 driver.findElement(By.partialLinkText("Open a popup window")).click();
 Thread.sleep(2000);
 //close Browser
 driver.quit();
}
	
	
	
	
	
	
	
}
