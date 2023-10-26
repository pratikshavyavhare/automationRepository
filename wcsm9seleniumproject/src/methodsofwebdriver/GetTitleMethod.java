package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
public static void main(String[] args) throws InterruptedException {
	// to launch the chrome browser
WebDriver	driver=new ChromeDriver();
// maximize the chrome browser
driver.manage().window().maximize();
// to launch the web application
driver.get("https://www.flipkart.com/");
 //stop the execution of script of 2 sec
Thread.sleep(2000);

System.out.println(driver.getTitle());
driver.close();

}
}
