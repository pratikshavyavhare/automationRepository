package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.close();
	
	
	}

}
