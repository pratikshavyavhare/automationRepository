package synchronaizationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
public static void main(String[] args) throws InterruptedException  {
	
	// to launch the chrome browser
WebDriver	driver=new ChromeDriver();

// maximize the chrome browser
driver.manage().window().maximize();

driver.get("https://www.instagram.com/");

Thread.sleep(2000);

driver.findElement(By.name("username")).sendKeys("pratiksha");
driver.findElement(By.name("password")).sendKeys("1234567");

		driver.findElement(By.xpath("//div[text()='Log in']")).click();
}
	
	
	
	
	
}
