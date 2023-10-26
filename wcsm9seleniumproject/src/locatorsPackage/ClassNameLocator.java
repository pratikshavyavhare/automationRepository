package locatorsPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
public static void main(String[] args) throws InterruptedException {
	
	// to launch chrome browser
      WebDriver	driver=new ChromeDriver();

   // maximize the chrome browser
     driver.manage().window().maximize();

   // to launch the chrome browser
   driver.get("https://www.google.com");

   // stop the execution of script for 2 sec
   // Thread.sleep(2000);
    
    driver.switchTo().activeElement().sendKeys("joey Tribbiani",Keys.ENTER);
    
    // identify symbol and click
    driver.findElement(By.className("lNPNe")).click();


}
	
	
	
}
