package methodsofwebdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {
    public static void main(String[] args) throws InterruptedException {
		// to launch the chrome browser
   WebDriver 	driver=new ChromeDriver();
        //maximize the chrome browser
   driver.manage().window().maximize();
        // to launch the web application
   driver.get("http://omayo.blogspot.com/");
      // stop the execution of 2 sec
   Thread.sleep(2000);
       // click on pop up window link
   driver.findElement(By.partialLinkText("Open a popup window")).click();
   // referance variable
   Set<String> allHandles = driver.getWindowHandles();
   System.out.println(allHandles);
   driver.quit();
	}
	
	
	
	
	
	
	
}
