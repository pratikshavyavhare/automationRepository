package synchronaizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShooperStack {

	public static void main(String[] args) {
		
	WebDriver	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	// apply implicit wait
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	driver.get("https://www.shoppersstack.com/");
	
	driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy Z Flip4 ']")).click();
	
	driver.findElement(By.id("Check Delivery")).sendKeys("413512");
	
 //	apply explicit wait
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
 WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
	
	ele.click();
	
	driver.findElement(By.id("Check")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
