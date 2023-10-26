package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLoginPage {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver		driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://affiliate.flipkart.com/login");
Thread.sleep(2000);
driver.findElement(By.id("inputEmail")).sendKeys("pratiksha@123");
driver.findElement(By.id("inputPassword")).sendKeys("1234");
driver.findElement(By.id("submitLogin")).click();
	}
	
	
}
