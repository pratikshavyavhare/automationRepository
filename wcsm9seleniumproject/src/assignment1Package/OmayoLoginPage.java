package assignment1Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoLoginPage {
public static void main(String[] args) throws InterruptedException {
	
WebDriver	driver=new ChromeDriver();

driver.manage().window().maximize();

driver.get("http://omayo.blogspot.com/");

Thread.sleep(2000);

driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();



driver.close();
}
	
	
	
	
	
	
	
}
