package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.primevideo.com/");
	//String title = driver.getTitle();
	//System.out.println(title);
	System.out.println(driver.getTitle());
	driver.close();
	}

}
