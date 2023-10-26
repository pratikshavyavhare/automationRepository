package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixCssSelector {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.netflix.com/in/login");

Thread.sleep(2000);
driver.findElement(By.name("userLoginId")).sendKeys("pratiksha");
driver.findElement(By.name("password")).sendKeys("12345");


driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small'")).click();


driver.close();
}
	
	
	
	
	
	
}
