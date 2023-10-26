package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XPathLocator {
public static void main(String[] args) throws InterruptedException {
ChromeOptions	co=new ChromeOptions();
co.addArguments("--disable-notifications");

 WebDriver    driver=new ChromeDriver(co);
  driver.manage().window().maximize();
  driver.get("https://www.airvistara.com/in/en");
  Thread.sleep(2000);
  
  driver.findElement(By.id("cookieModalCloseBtn")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("pune");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("mumbai");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//input[@name='depart']")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//a[@data-date='22']")).click();  
  Thread.sleep(2000);
  driver.findElement(By.xpath("//a[@data-date='25']")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//input[@id='passengers']")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//button[@value='business']")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//button[@class='col-xs-12 done_btn aubergine-button-dark passengerModalBtn']")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//button[@id='book-flight-widget']")).click();

driver.close();
}
	
	
	
	
	
	
	
}
