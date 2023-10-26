package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
//maximize the Chrome browser
driver.manage().window().maximize();
//launch the web application
driver.get("https://omayo.blogspot.com/");
//stop the execution of script for 4 sec
Thread.sleep(4000);
//close the browser
driver.close();
}
}
