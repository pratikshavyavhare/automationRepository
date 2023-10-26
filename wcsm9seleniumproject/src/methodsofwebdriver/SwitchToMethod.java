package methodsofwebdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		//launch the web application
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
  
	}

}
