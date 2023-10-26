package methodsofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
    public static void main(String[] args) throws InterruptedException {
		// to launch the chrome browser
    WebDriver	driver=new ChromeDriver();
    // maximize the chrome browser
    driver.manage().window().maximize();
    // launch the web application
    driver.get("http://omayo.blogspot.com/");
     // stop the execution of script for 2 sec
    Thread.sleep(2000);
    //click on pop up window link
    driver.findElement(By.partialLinkText("Open a popup window")).click();
    Thread.sleep(2000);
    // close browser
    driver.close();
	}
	
	
	
	
	
}
