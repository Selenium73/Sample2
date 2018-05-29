package pkg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation_Commands {

	public static void main(String[] args) throws InterruptedException {
		// intiaslizing the browser
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://toolsqa.com/iframe-practice-page/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("IF1");
		driver.findElement(By.name("firstname")).sendKeys("S2tech");
		driver.switchTo().parentFrame();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		
		/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("HDC7340");
		driver.findElement(By.xpath("//input[@type='password' and @size='40']")).sendKeys("Password");
		driver.findElement(By.xpath("//input[@align='Center']")).click();
		System.out.println("Execution is completed");*/
		//Thread.sleep(5000);
		//driver.close();
		
	/*	Wait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		
		Wait wait1 = new FluentWait(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS);*/
		
		
		
	}

}
