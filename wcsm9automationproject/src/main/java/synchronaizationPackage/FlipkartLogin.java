package synchronaizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {

	public static void main(String[] args) throws InterruptedException   {
		// to launch the chrome driver
WebDriver	driver=new ChromeDriver();	
       
    // maximize the chrome browser
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

   // to launch the application
driver.get("https://www.flipkart.com/");

driver.findElement(By.xpath("//span[text()='✕']")).click();

driver.findElement(By.xpath("//a[@class='_1krdK5' and (@title='Cart')]")).click();

Thread.sleep(2000);

driver.findElement(By.xpath("//button[contains(@class,'_2')]")).click();
		
driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8766468948");	

driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
