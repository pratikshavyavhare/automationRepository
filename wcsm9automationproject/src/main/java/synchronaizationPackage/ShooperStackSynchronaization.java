package synchronaizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class ShooperStackSynchronaization {

	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.shoppersstack.com/");
	driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy Z Flip4 ']")).click();
driver.findElement(By.id("Check Delivery")).sendKeys("413512");
	
	
	
	WebElement checkButton = driver.findElement(By.id("Check"));
	explicitWait(driver, 30, checkButton).click();
	}				
	
	public static WebElement explicitWait(WebDriver driver,long sec,WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(sec));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
		return element;
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

