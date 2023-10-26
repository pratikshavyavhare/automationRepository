package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {
 public static void main(String[] args) throws InterruptedException {
	// to launch chrome browser
WebDriver	 driver=new ChromeDriver();
    // maximize the chrome browser
driver.manage().window().maximize();
  // to launch the web application
 driver.get("http://omayo.blogspot.com/");
 
 String parentHandle = driver.getWindowHandle();
 System.out.println(parentHandle);
//to stop the execution script for 2 sec
Thread.sleep(2000);
 driver.close();
}
}
