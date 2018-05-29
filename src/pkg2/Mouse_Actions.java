package pkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		//driver.get("http://demo.guru99.com/test/newtours");
				
		/*WebElement element = driver.findElement(By.className("dropdown-toggle"));
		
		Actions action = new Actions(driver);
		action.doubleClick().perform();
		action.moveToElement(element).click()
		.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'//a[contains(text(),'Flash Movie Demo')]')]"))).build().perform();*/
		
		//driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		//driver.switchTo().frame(0);
		
		/*Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.id("draggable")))
		.moveToElement(driver.findElement(By.id("droppable")))
		.release().build().perform();*/
		
		/*driver.get("http://www.google.com");
			driver.manage().window().maximize();
			Actions act=new Actions(driver);
			act.contextClick(driver.findElement(By.className("gb_P"))).perform();*/
		
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER);
		
			}

}
