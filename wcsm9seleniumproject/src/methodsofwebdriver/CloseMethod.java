package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {
public static void main(String[] args) throws InterruptedException {
	//to launch the chrome browser
WebDriver	driver=new ChromeDriver();
//maximize the chrome browser
driver.manage().window().maximize();
// launch the web application
driver.get("https://www.flipkart.com/");
// stop the execution of script for 2 sec
Thread.sleep(2000);
driver.close();
}
}
