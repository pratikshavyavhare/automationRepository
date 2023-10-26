package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {
public static void main(String[] args) throws InterruptedException {
  //launch the web browser
	WebDriver	driver=new ChromeDriver();
  // maximize the browser
	driver.manage().window().maximize();
  //launch the web application
	driver.get("https://www.flipkart.com/");
	 
	String urlOfLoginPage = driver.getCurrentUrl();
	 System.out.println(urlOfLoginPage);
	
	 Thread.sleep(4000);
	 driver.close();
}
}
