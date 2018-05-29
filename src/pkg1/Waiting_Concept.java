package pkg1;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiting_Concept {

	public static void main(String[] args) {
		
		//Intializing the browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Enter the url in browser
		driver.get("http://omayo.blogspot.in");
		
		driver.findElement(By.id(""));
		
		Wait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		
		Wait wait1 = new FluentWait(driver)
				.withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

	}

}
