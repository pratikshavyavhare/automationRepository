package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
public static void main(String[] args) throws InterruptedException {
	//to launch the chrome browser
WebDriver	driver=new ChromeDriver();
// maximize the chrome browser
driver.manage().window().maximize();
//to launch the web application
driver.get("view-source:https://www.flipkart.com");
// take a source code of login page
String loginPageSourceCode = driver.getPageSource();
System.out.println(loginPageSourceCode);
Thread.sleep(2000);
driver.close();
}
	
	
	
	
}
