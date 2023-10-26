package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimelogin {

	public static void main(String[] args) throws InterruptedException {
WebDriver		driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://laptop-lefsgmbe/login.do");
Thread.sleep(2000);

driver.findElement(By.name("username")).sendKeys("Admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.xpath("//a[@id='loginButton']")).click();

driver.findElement(By.className("sizer")).click();
driver.findElement(By.className("item active")).click();
driver.findElement(By.className("item active")).click();

driver.findElement(By.name("name")).sendKeys("hdfc bank");
driver.findElement(By.name("createCustomerSubmit")).click();


	}
	
	
	
	
	
	
	
	
	
	
	
}
