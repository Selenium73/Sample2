package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebElement_Concept {

	public static void main(String[] args) throws InterruptedException {
		// Intiallizing the browser
		System.setProperty("webdriver.ie.driver", "F:\\Selenium\\IEDriverServer_Win32_2.53.1\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://10.0.3.3");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("txtEmployeeId"));
		
		String attribute = element.getAttribute("type");
		System.out.println("Attribute of usename:"+attribute);
		
		element.sendKeys("HDC7340");
		Thread.sleep(5000);
		
		element.clear();
		
		String cssValue = element.getCssValue("font-size");
		System.out.println("Font size  of username:"+cssValue);
		
		Point location = element.getLocation();
		System.out.println("Location of username x and y cooridnates:"+location);
		
		Dimension size = element.getSize();
		System.out.println("Size of username is:"+size);
		
		String tagName = element.getTagName();
		System.out.println("Tag name of username is:"+tagName);
		
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
		driver.close();

	}

}
