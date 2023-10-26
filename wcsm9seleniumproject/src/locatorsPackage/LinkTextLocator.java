package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
public static void main(String[] args) {
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/er503tu/Desktop/wcms9work/link1.html");
//	driver.findElement(By.)
driver.findElement(By.linkText("selenium Link")).click();


}
	
	
	
}
