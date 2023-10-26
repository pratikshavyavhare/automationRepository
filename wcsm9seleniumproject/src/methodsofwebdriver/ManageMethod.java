package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
public static void main(String[] args) throws InterruptedException {
	// to launch the chrome browser
WebDriver	driver=new ChromeDriver();
    // maximize the chrome browser
driver.manage().window().maximize();
   driver.get("https://www.meesho.com/");
   // minimize the browser 
   driver.manage().window().minimize();
   // fullscreen the browser
  // driver.manage().window().fullscreen();
   // set size of the browser 
  //       Dimension targetSize = new Dimension();
 //       driver.manage().window().setSize(targetSize);
   
   // set position  of browser
   //     Point targetPosition = new Point(350,250);
   //     driver.manage().window().setPosition(targetPosition);
   Thread.sleep(6000);
   driver.close();
   
}
	
	
	
	
	
	
	
}
