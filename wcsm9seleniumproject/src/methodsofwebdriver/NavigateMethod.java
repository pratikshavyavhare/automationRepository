package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
public static void main(String[] args) throws InterruptedException {
	// to launch the chrome browser
WebDriver	driver=new ChromeDriver();
    //to launch a web application by using navigate method()
Navigation nav = driver.navigate();
nav.to("https://www.selenium.dev");

  //to perform backward operation 
//nav.back();
//Thread.sleep(2000);
   // to perform forward operation
 //nav.forward();
    
// to perform refresh operation
 nav.refresh();
 Thread.sleep(2000);
 driver.close();
}
	
	
	
	
}
