package assignment1Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
public static void main(String[] args) throws InterruptedException {
	
	// to launch the web application
WebDriver	driver=new ChromeDriver();

// maximize the chrome browser
driver.manage().window().maximize();

// launch the instagram login
driver.get("https://www.instagram.com/");

// stop the execution of script for 2 sec
Thread.sleep(2000);

//identified usernameTextBox and pass inputs
driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("pratiksha.vyavhare");

// identified passwordTextBox and pass inputs
driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("1234567");

driver.findElement(By.xpath("//div[contains(text(),'L')]")).click();

//driver.findElement(By.xpath("//button[contains(@class,'_acan _acap _acas _aj1-')]")).click();

driver.quit();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
