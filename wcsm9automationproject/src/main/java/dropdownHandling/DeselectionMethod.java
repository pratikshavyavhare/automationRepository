package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeselectionMethod {

	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	//  apply implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("");
	}
	
	
	
	
	
	
	
}
