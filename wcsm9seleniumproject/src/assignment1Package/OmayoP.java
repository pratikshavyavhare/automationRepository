package assignment1Package;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.AllArguments;

public class OmayoP {
public static void main(String[] args) throws InterruptedException {
	
WebDriver	driver=new ChromeDriver();

driver.manage().window().maximize();

driver.get("http://omayo.blogspot.com/");
//String parentHandle=driver.getWindowHandles();

Thread.sleep(2000);

driver.findElement(By.partialLinkText("Open a popup window")).click();
Thread.sleep(2000);
 Set<String> allHandles = driver.getWindowHandles();
 //for (string wh= allHandles)
 {
	// if(! parentHandle.equals(wh))
	 {
	//	 driver.switchTo().window(wh).close();
 
	 }
 
 
 
 }


}
	
}
	
	
	
	

	
	
	
	
	

