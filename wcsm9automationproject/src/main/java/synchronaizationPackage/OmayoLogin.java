package synchronaizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OmayoLogin {

	public static void main(String[] args) {
		
	WebDriver	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	driver.get("https://omayo.blogspot.com/");
	
	driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
	
	driver.findElement(By.xpath("//a[text()='Flipkart']")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
