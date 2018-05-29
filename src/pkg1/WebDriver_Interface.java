package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriver_Interface {

	public static void main(String[] args) throws InterruptedException {

		//Intailizing the browser
		WebDriver driver = new FirefoxDriver();


		//OPening the url 
		driver.get("http://10.0.3.3");

		//Maximize the browser
		driver.manage().window().maximize();


		driver.findElement(By.id("txtEmployeeId")).sendKeys("HDC7340");
		driver.findElement(By.id("txtPassword")).sendKeys("Password");
		driver.findElement(By.name("btnSubmit")).click();

		Thread.sleep(5000);


		//Page title
		String title = driver.getTitle();
		System.out.println("Title of login page is:"+title);

		//Page source of current page
		String pageSource = driver.getPageSource();
		System.out.println("Page source if login page is:"+pageSource);

		//Close the browser
		driver.close();
	}

}
