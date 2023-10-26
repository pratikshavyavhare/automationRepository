package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {
  public static void main(String[] args) throws InterruptedException {
	// to launch the chrome browser
WebDriver	 driver= new ChromeDriver();
 //maximize the chrome browser
driver.manage().window().maximize();
   // to launch the web application
driver.get("http://omayo.blogspot.com/");
  //take url of login page
String urlOfLoginPage = driver.getCurrentUrl();
System.out.println(urlOfLoginPage);
Thread.sleep(2000);
driver.close();
}
	
	
	
	
	
	
}
