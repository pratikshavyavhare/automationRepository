package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
 
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver	driver=new ChromeDriver();
	//maximize the browser
	driver.manage().window().maximize();
	//launch the browser
	driver.get(" http://omayo.blogspot.com/");
    Thread.sleep(2000);
	System.out.println(driver.getPageSource());
	}
}
