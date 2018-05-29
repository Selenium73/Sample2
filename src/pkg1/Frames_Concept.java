package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames_Concept {

	public static void main(String[] args) throws InterruptedException {
		// Intializing the browser
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/iframe-practice-page/");
		
		driver.switchTo().frame("IF1");
		driver.findElement(By.name("firstname")).sendKeys("S2tech");
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(5000);
		
		driver.close();
		

	}

}
