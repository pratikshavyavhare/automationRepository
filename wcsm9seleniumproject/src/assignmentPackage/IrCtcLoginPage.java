package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrCtcLoginPage {
public static void main(String[] args) throws InterruptedException {
	
ChromeOptions	co=new ChromeOptions();
co.addArguments("--disable-notifications");

   WebDriver  driver=new ChromeDriver(co);
   driver.manage().window().maximize();
   
   driver.get("https://www.irctc.co.in/nget/train-search");
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("")).sendKeys("");
   
   
   
	
	
	
	
	
	
}
	
	
	
	
	
	
}
